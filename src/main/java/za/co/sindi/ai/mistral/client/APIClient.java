/**
 * 
 */
package za.co.sindi.ai.mistral.client;

import java.io.IOException;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

import za.co.sindi.ai.mistral.BaseStreamRequest;
import za.co.sindi.ai.mistral.ObjectTransformer;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public interface APIClient {

	/**
	 * @param connectionTimeout the connectionTimeout to set
	 */
	public void setConnectionTimeout(Duration connectionTimeout);

	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(ProxySelector proxy);

	/**
	 * @param executor the executor to set
	 */
	public void setExecutor(Executor executor);
	
	public void setObjectTransformer(final ObjectTransformer objectTransformer);
	
	public <REQ, T> T send(final APIRequest<REQ> request, final ResponseHandler<T> responseHandler) throws IOException, InterruptedException;
	public <REQ, T> CompletableFuture<T> sendAsync(final APIRequest<REQ> request, final ResponseHandler<T> responseHandler);
	public <REQ extends BaseStreamRequest, T> Stream<T> sendStreaming(APIRequest<REQ> request, Class<T> chunkClass) throws IOException, InterruptedException;
	public <REQ extends BaseStreamRequest, T> CompletableFuture<Stream<T>> sendStreamingAsync(APIRequest<REQ> request, Class<T> chunkClass);
}
