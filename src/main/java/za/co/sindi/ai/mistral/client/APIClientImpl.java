/**
 * 
 */
package za.co.sindi.ai.mistral.client;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

import za.co.sindi.ai.mistral.JSONObjectTransformer;
import za.co.sindi.ai.mistral.MistralAIException;
import za.co.sindi.ai.mistral.ObjectTransformer;
import za.co.sindi.ai.mistral.error.ErrorResponse;
import za.co.sindi.commons.net.sse.Event;
import za.co.sindi.commons.net.sse.MessageEvent;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class APIClientImpl implements APIClient {
	
	private Duration connectionTimeout;
	private ProxySelector proxy;
	private Executor executor;
	
	private final String mistralAPIKey;
	private ObjectTransformer objectTransformer = new JSONObjectTransformer();

	/**
	 * @param mistralAPIKey
	 */
	public APIClientImpl(final String mistralAPIKey) {
		super();
		this.mistralAPIKey = Objects.requireNonNull(mistralAPIKey, "A Mistral AI API Key is required.");
	}

	@Override
	public void setConnectionTimeout(Duration connectionTimeout) {
		// TODO Auto-generated method stub
		this.connectionTimeout = connectionTimeout;
	}

	@Override
	public void setProxy(ProxySelector proxy) {
		// TODO Auto-generated method stub
		this.proxy = proxy;
	}

	@Override
	public void setExecutor(Executor executor) {
		// TODO Auto-generated method stub
		this.executor = executor;
	}

	@Override
	public void setObjectTransformer(ObjectTransformer objectTransformer) {
		// TODO Auto-generated method stub
		this.objectTransformer = objectTransformer;
	}

	@Override
	public <REQ, T> T send(APIRequest<REQ> request, ResponseHandler<T> responseHandler) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpRequest httpRequest = createHttpRequestBuilder(request).build();
		HttpClient httpClient = createHttpClient();
		HttpResponse<String> httpResponse = httpClient.send(httpRequest, BodyHandlers.ofString());
		validateHttpResponse(httpResponse);
		return responseHandler.handleResponse(httpResponse);
	}

	@Override
	public <REQ, T> CompletableFuture<T> sendAsync(APIRequest<REQ> request, ResponseHandler<T> responseHandler) {
		// TODO Auto-generated method stub
		HttpRequest httpRequest = createHttpRequestBuilder(request).build();
		HttpClient httpClient = createHttpClient();
		return httpClient.sendAsync(httpRequest, BodyHandlers.ofString()).thenApplyAsync(httpResponse -> {
			validateHttpResponse(httpResponse);
			return responseHandler.handleResponse(httpResponse);
		}).toCompletableFuture();
	}
	
	private <REQ> HttpRequest.Builder createHttpRequestBuilder(final APIRequest<REQ> request) {
		final BodyPublisher bodyPublisher = request.getContent() == null ? BodyPublishers.noBody() : BodyPublishers.ofString(objectTransformer.transform(request.getContent()), request.getContentCharset());
		HttpRequest.Builder httpRequestBuilder = HttpRequest.newBuilder(URI.create(request.getUri()))
															.header("Accept", "application/json")
															.header("Authorization", "Bearer " + mistralAPIKey)
															.method(request.getHttpMethod(), bodyPublisher == null ? BodyPublishers.noBody() : bodyPublisher);
		
		if (!Strings.isNullOrEmpty(request.getContentType())) {
			httpRequestBuilder.header("Content-Type", request.getContentType());
		}
		
		return httpRequestBuilder;
	}
	
	private HttpClient createHttpClient() {
		HttpClient.Builder httpClientBuilder = HttpClient.newBuilder();
		if (connectionTimeout != null) {
			httpClientBuilder.connectTimeout(connectionTimeout);
		}
		
		if (proxy != null) {
			httpClientBuilder.proxy(proxy);
		}
		
		if (executor != null) {
			httpClientBuilder.executor(executor);
		}
		
		return httpClientBuilder.build();
	}
	
	private void validateHttpResponse(final HttpResponse<String> httpResponse) {
		int code = httpResponse.statusCode() / 100;
		if (code == 4 || code == 5) {
			String content = httpResponse.body();
			String contentType = httpResponse.headers().firstValue("content-type").orElse(null);
			if (!Strings.isNullOrEmpty(contentType) && contentType.startsWith("application/json")) {
				ErrorResponse errorResponse = objectTransformer.transform(content, ErrorResponse.class);
				if (errorResponse.getError() != null) {
					throw new MistralAIException(errorResponse.getError());
				} else {
					throw new MistralAIException(objectTransformer.transform(content, za.co.sindi.ai.mistral.error.Error.class));
				}
			} else throw new MistralAIException(content);
		}
	}
	
	private <R> Stream<R> handleStream(final Stream<Event> events, Class<R> entityClassType) {
		List<R> result = new ArrayList<>();
		events.forEach(event -> {
			if (event instanceof MessageEvent message) {
				String content = message.getData();
				if (!"[DONE]".equals(content)) {
					result.add(objectTransformer.transform(content, entityClassType));
				}
			}
		});
		
		return Collections.unmodifiableList(result).stream();
	}
}
