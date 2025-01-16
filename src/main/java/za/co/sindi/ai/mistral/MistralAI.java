/**
 * 
 */
package za.co.sindi.ai.mistral;

import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.mistral.chat.ChatCompletionRequest;
import za.co.sindi.ai.mistral.chat.ChatCompletionResponse;
import za.co.sindi.ai.mistral.embeddings.EmbeddingRequest;
import za.co.sindi.ai.mistral.embeddings.EmbeddingResponse;
import za.co.sindi.ai.mistral.fim.FimCompletionRequest;
import za.co.sindi.ai.mistral.fim.FimCompletionResponse;
import za.co.sindi.ai.mistral.model.ArchivedFineTunedModel;
import za.co.sindi.ai.mistral.model.DeletedFineTunedModel;
import za.co.sindi.ai.mistral.model.Model;
import za.co.sindi.ai.mistral.model.ModelList;
import za.co.sindi.ai.mistral.model.UpdateFineTunedModelRequest;

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
	 * @return a {@link CompletableFuture} of {@link ChatCompletionResponse}
	 */
	public CompletableFuture<ChatCompletionResponse> createChatCompletionAsync(final ChatCompletionRequest request);
	
	/**
	 * Create FIM Completions
	 * 
	 * @param request an {@link FimCompletionRequest}
	 * @return an instance of {@link ChatCompletionResponse}
	 */
	public FimCompletionResponse createFimCompletion(final FimCompletionRequest request);
	
	/**
	 * Create FIM Completions
	 * 
	 * @param request an {@link FimCompletionRequest}
	 * @return a {@link CompletableFuture} off {@link ChatCompletionResponse}
	 */
	public CompletableFuture<FimCompletionResponse> createFimCompletionAsync(final FimCompletionRequest request);
	
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
	 * @return a {@link CompletableFuture} of {@link EmbeddingResponse}
	 */
	public CompletableFuture<EmbeddingResponse> createEmbeddingAsync(final EmbeddingRequest request);
	
	/**
	 * List Available Models
	 * 
	 * @return an instance of {@link ModelList}, which has an array of {@link Model}
	 */
	public ModelList listModels();
	
	/**
	 * List Available Models
	 * 
	 * @return a {@link CompletableFuture} of {@link ModelList}, which has an array of {@link Model}
	 */
	public CompletableFuture<ModelList> listModelsAsync();
	
	/**
	 * Retrieve a model information.
	 * 
	 * @param modelId the model id.
	 * @return an instance of {@link Model}
	 */
	public Model retrieveModel(final String modelId);
	
	/**
	 * Retrieve a model information.
	 * 
	 * @param modelId the model id.
	 * @return a {@link CompletableFuture} of {@link Model}
	 */
	public CompletableFuture<Model> retrieveModelAsync(final String modelId);
	
	/**
	 * Delete a Fine Tuned model.
	 * 
	 * @param modelId the Fine Tuned model id.
	 * @return an instance of {@link DeletedFinedTuneModel}
	 */
	public DeletedFineTunedModel deleteModel(final String modelId);
	
	/**
	 * Delete a Fine Tuned model.
	 * 
	 * @param modelId the model id.
	 * @return a {@link CompletableFuture} of {@link DeletedFineTunedModel}
	 */
	public CompletableFuture<DeletedFineTunedModel> deleteModelAsync(final String modelId);
	
	/**
	 * Update a model name or description.
	 * 
	 * @param modelId the model id.
	 * @param request the {@link UpdateFineTunedModelRequest}
	 * @return an instance of {@link Model}
	 */
	public Model updateFineTunedModel(final String modelId, final UpdateFineTunedModelRequest request);
	
	/**
	 * Update a model name or description.
	 * 
	 * @param modelId the model id.
	 * @param request the {@link UpdateFineTunedModelRequest}
	 * @return a {@link CompletableFuture} of {@link Model}
	 */
	public CompletableFuture<Model> updateFineTunedModelAsync(final String modelId, final UpdateFineTunedModelRequest request);
	
	/**
	 * Archive a Fine Tuned model.
	 * 
	 * @param modelId the Fine Tuned model id.
	 * @return an instance of {@link ArchivedFineTunedModel}
	 */
	public ArchivedFineTunedModel archiveFineTunedModel(final String modelId);
	
	/**
	 * Archive a Fine Tuned model.
	 * 
	 * @param modelId the model id.
	 * @return a {@link CompletableFuture} of {@link ArchivedFineTunedModel}
	 */
	public CompletableFuture<ArchivedFineTunedModel> archiveFineTunedModelAsync(final String modelId);
	
	/**
	 * Unarchive a Fine Tuned model.
	 * 
	 * @param modelId the Fine Tuned model id.
	 * @return an instance of {@link ArchivedFineTunedModel}
	 */
	public ArchivedFineTunedModel unarchiveFineTunedModel(final String modelId);
	
	/**
	 * Unarchive a Fine Tuned model.
	 * 
	 * @param modelId the model id.
	 * @return a {@link CompletableFuture} of {@link ArchivedFineTunedModel}
	 */
	public CompletableFuture<ArchivedFineTunedModel> unarchiveFineTunedModelAsync(final String modelId);
}
