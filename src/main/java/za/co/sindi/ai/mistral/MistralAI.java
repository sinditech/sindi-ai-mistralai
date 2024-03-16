/**
 * 
 */
package za.co.sindi.ai.mistral;

import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.mistral.chat.ChatCompletionRequest;
import za.co.sindi.ai.mistral.chat.ChatCompletionResponse;
import za.co.sindi.ai.mistral.embeddings.EmbeddingRequest;
import za.co.sindi.ai.mistral.embeddings.EmbeddingResponse;
import za.co.sindi.ai.mistral.model.Model;
import za.co.sindi.ai.mistral.model.ModelList;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public interface MistralAI {

	/**
	 * Create Chat Completions
	 * 
	 * @param request an {@link ChatCompletionRequest}
	 * @return an instance of {@link ChatCompletionResponse}
	 */
	public ChatCompletionResponse createChatCompletion(final ChatCompletionRequest request);
	
	/**
	 * Create Chat Completions
	 * 
	 * @param request an {@link ChatCompletionRequest}
	 * @return an instance of {@link ChatCompletionResponse}
	 */
	public CompletableFuture<ChatCompletionResponse> createChatCompletionAsync(final ChatCompletionRequest request);
	
	/**
	 * Create Embeddings
	 * 
	 * @param request an {@link EmbeddingRequest}
	 * @return an {@link EmbeddingResponse}
	 */
	public EmbeddingResponse createEmbedding(final EmbeddingRequest request);
	
	/**
	 * Create Embeddings
	 * 
	 * @param request an {@link EmbeddingRequest}
	 * @return an {@link EmbeddingResponse}
	 */
	public CompletableFuture<EmbeddingResponse> createEmbeddingAsyn(final EmbeddingRequest request);
	
	/**
	 * List Available Models
	 * 
	 * @return an instance of {@link ModelList}, which has an array of {@link Model}
	 */
	public ModelList listModels();
	
	/**
	 * List Available Models
	 * 
	 * @return an instance of {@link ModelList}, which has an array of {@link Model}
	 */
	public CompletableFuture<ModelList> listModelsAsync();
}
