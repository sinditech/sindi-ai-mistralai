/**
 * 
 */
package za.co.sindi.ai.mistral;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.mistral.chat.ChatCompletionRequest;
import za.co.sindi.ai.mistral.chat.ChatCompletionResponse;
import za.co.sindi.ai.mistral.client.APIClient;
import za.co.sindi.ai.mistral.client.APIClientImpl;
import za.co.sindi.ai.mistral.client.APIRequest;
import za.co.sindi.ai.mistral.client.ResponseHandler;
import za.co.sindi.ai.mistral.embeddings.EmbeddingRequest;
import za.co.sindi.ai.mistral.embeddings.EmbeddingResponse;
import za.co.sindi.ai.mistral.model.ModelList;
import za.co.sindi.commons.io.UncheckedException;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class MistralAIImpl implements MistralAI {
	
	private static final String BASE_URL = "https://api.mistral.ai/v1";
	
	private APIClient apiClient;
	private ObjectTransformer objectTransformer;
	
	/**
	 * @param apiKey
	 */
	public MistralAIImpl(final String apiKey) {
		this(new APIClientImpl(apiKey));
	}
	
	/**
	 * @param apiKey
	 * @param objectTransformer
	 */
	public MistralAIImpl(final String apiKey, ObjectTransformer objectTransformer) {
		this(new APIClientImpl(apiKey), objectTransformer);
	}
	
	/**
	 * @param apiClient
	 */
	public MistralAIImpl(APIClient apiClient) {
		this(apiClient, new JSONObjectTransformer());
	}
	
	/**
	 * @param apiClient
	 * @param objectTransformer
	 */
	public MistralAIImpl(APIClient apiClient, ObjectTransformer objectTransformer) {
		super();
		this.apiClient = Objects.requireNonNull(apiClient, "An MistralAI API Client is required.");
		this.objectTransformer = Objects.requireNonNull(objectTransformer, "A JSON Object Transformer is required.");
		this.apiClient.setObjectTransformer(objectTransformer);
	}

	@Override
	public ChatCompletionResponse createChatCompletion(ChatCompletionRequest request) {
		// TODO Auto-generated method stub
		APIRequest<ChatCompletionRequest> apiRequest = new APIRequest<>("POST", BASE_URL + "/chat/completions", "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		try {
			return apiClient.send(apiRequest, new ResponseHandler<ChatCompletionResponse>() {

				@Override
				public ChatCompletionResponse handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), ChatCompletionResponse.class);
				}
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	@Override
	public CompletableFuture<ChatCompletionResponse> createChatCompletionAsync(ChatCompletionRequest request) {
		// TODO Auto-generated method stub
		APIRequest<ChatCompletionRequest> apiRequest = new APIRequest<>("POST", BASE_URL + "/chat/completions", "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		return apiClient.sendAsync(apiRequest, new ResponseHandler<ChatCompletionResponse>() {

			@Override
			public ChatCompletionResponse handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), ChatCompletionResponse.class);
			}
		});
	}

	@Override
	public EmbeddingResponse createEmbedding(EmbeddingRequest request) {
		// TODO Auto-generated method stub
		APIRequest<EmbeddingRequest> apiRequest = new APIRequest<>("POST", BASE_URL + "/embeddings", "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		try {
			return apiClient.send(apiRequest, new ResponseHandler<EmbeddingResponse>() {

				@Override
				public EmbeddingResponse handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), EmbeddingResponse.class);
				}
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	@Override
	public CompletableFuture<EmbeddingResponse> createEmbeddingAsyn(EmbeddingRequest request) {
		// TODO Auto-generated method stub
		APIRequest<EmbeddingRequest> apiRequest = new APIRequest<>("POST", BASE_URL + "/embeddings", "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		return apiClient.sendAsync(apiRequest, new ResponseHandler<EmbeddingResponse>() {

			@Override
			public EmbeddingResponse handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), EmbeddingResponse.class);
			}
		});
	}

	@Override
	public ModelList listModels() {
		// TODO Auto-generated method stub
		try {
			return apiClient.send(new APIRequest<>("GET", BASE_URL + "/models"), new ResponseHandler<ModelList>() {

				@Override
				public ModelList handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), ModelList.class);
				}
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	@Override
	public CompletableFuture<ModelList> listModelsAsync() {
		// TODO Auto-generated method stub
		return apiClient.sendAsync(new APIRequest<>("GET", BASE_URL + "/models"), new ResponseHandler<ModelList>() {

			@Override
			public ModelList handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), ModelList.class);
			}
		});
	}
}
