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

import za.co.sindi.ai.mistral.agents.AgentsCompletionRequest;
import za.co.sindi.ai.mistral.agents.AgentsCompletionResponse;
import za.co.sindi.ai.mistral.chat.ChatCompletionRequest;
import za.co.sindi.ai.mistral.chat.ChatCompletionResponse;
import za.co.sindi.ai.mistral.client.APIClient;
import za.co.sindi.ai.mistral.client.APIClientImpl;
import za.co.sindi.ai.mistral.client.APIRequest;
import za.co.sindi.ai.mistral.client.ResponseHandler;
import za.co.sindi.ai.mistral.embeddings.EmbeddingRequest;
import za.co.sindi.ai.mistral.embeddings.EmbeddingResponse;
import za.co.sindi.ai.mistral.fim.FimCompletionRequest;
import za.co.sindi.ai.mistral.fim.FimCompletionResponse;
import za.co.sindi.ai.mistral.model.ArchivedFineTunedModel;
import za.co.sindi.ai.mistral.model.DeletedFineTunedModel;
import za.co.sindi.ai.mistral.model.Model;
import za.co.sindi.ai.mistral.model.ModelList;
import za.co.sindi.ai.mistral.model.UpdateFineTunedModelRequest;
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#createChatCompletion(za.co.sindi.ai.mistral.agents.AgentsCompletionRequest)
	 */
	@Override
	public AgentsCompletionResponse createAgentsCompletion(AgentsCompletionRequest request) {
		// TODO Auto-generated method stub
		APIRequest<AgentsCompletionRequest> apiRequest = new APIRequest<>("POST", BASE_URL + "/agents/completions", "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		try {
			return apiClient.send(apiRequest, new ResponseHandler<AgentsCompletionResponse>() {

				@Override
				public AgentsCompletionResponse handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), AgentsCompletionResponse.class);
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#createChatCompletionAsync(za.co.sindi.ai.mistral.agents.AgentsCompletionRequest)
	 */
	@Override
	public CompletableFuture<AgentsCompletionResponse> createAgentsCompletionAsync(AgentsCompletionRequest request) {
		// TODO Auto-generated method stub
		APIRequest<AgentsCompletionRequest> apiRequest = new APIRequest<>("POST", BASE_URL + "/agents/completions", "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		return apiClient.sendAsync(apiRequest, new ResponseHandler<AgentsCompletionResponse>() {

			@Override
			public AgentsCompletionResponse handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), AgentsCompletionResponse.class);
			}
		});
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#createFimCompletion(za.co.sindi.ai.mistral.fim.FimCompletionRequest)
	 */
	@Override
	public FimCompletionResponse createFimCompletion(FimCompletionRequest request) {
		// TODO Auto-generated method stub
		APIRequest<FimCompletionRequest> apiRequest = new APIRequest<>("POST", BASE_URL + "/fim/completions", "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		try {
			return apiClient.send(apiRequest, new ResponseHandler<FimCompletionResponse>() {

				@Override
				public FimCompletionResponse handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), FimCompletionResponse.class);
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#createFimCompletionAsync(za.co.sindi.ai.mistral.fim.FimCompletionRequest)
	 */
	@Override
	public CompletableFuture<FimCompletionResponse> createFimCompletionAsync(FimCompletionRequest request) {
		// TODO Auto-generated method stub
		APIRequest<FimCompletionRequest> apiRequest = new APIRequest<>("POST", BASE_URL + "/fim/completions", "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		return apiClient.sendAsync(apiRequest, new ResponseHandler<FimCompletionResponse>() {

			@Override
			public FimCompletionResponse handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), FimCompletionResponse.class);
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
	public CompletableFuture<EmbeddingResponse> createEmbeddingAsync(EmbeddingRequest request) {
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#retrieveModel(java.lang.String)
	 */
	@Override
	public Model retrieveModel(String modelId) {
		// TODO Auto-generated method stub
		try {
			return apiClient.send(new APIRequest<>("GET", BASE_URL + "/models/" + modelId), new ResponseHandler<Model>() {

				@Override
				public Model handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), Model.class);
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#retrieveModelAsync(java.lang.String)
	 */
	@Override
	public CompletableFuture<Model> retrieveModelAsync(String modelId) {
		// TODO Auto-generated method stub
		return apiClient.sendAsync(new APIRequest<>("GET", BASE_URL + "/models/" + modelId), new ResponseHandler<Model>() {

			@Override
			public Model handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), Model.class);
			}
		});
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#deleteModel(java.lang.String)
	 */
	@Override
	public DeletedFineTunedModel deleteModel(String modelId) {
		// TODO Auto-generated method stub
		try {
			return apiClient.send(new APIRequest<>("DELETE", BASE_URL + "/models/" + modelId), new ResponseHandler<DeletedFineTunedModel>() {

				@Override
				public DeletedFineTunedModel handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), DeletedFineTunedModel.class);
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#deleteModelAsync(java.lang.String)
	 */
	@Override
	public CompletableFuture<DeletedFineTunedModel> deleteModelAsync(String modelId) {
		// TODO Auto-generated method stub
		return apiClient.sendAsync(new APIRequest<>("DELETE", BASE_URL + "/models/" + modelId), new ResponseHandler<DeletedFineTunedModel>() {

			@Override
			public DeletedFineTunedModel handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), DeletedFineTunedModel.class);
			}
		});
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#updateFineTunedModel(java.lang.String, za.co.sindi.ai.mistral.model.UpdateFineTunedModelRequest)
	 */
	@Override
	public Model updateFineTunedModel(String modelId, UpdateFineTunedModelRequest request) {
		// TODO Auto-generated method stub
		APIRequest<UpdateFineTunedModelRequest> apiRequest = new APIRequest<>("PATCH", BASE_URL + "/fine_tuning/models/" + modelId, "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		try {
			return apiClient.send(apiRequest, new ResponseHandler<Model>() {

				@Override
				public Model handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), Model.class);
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#updateFineTunedModelAsync(java.lang.String, za.co.sindi.ai.mistral.model.UpdateFineTunedModelRequest)
	 */
	@Override
	public CompletableFuture<Model> updateFineTunedModelAsync(String modelId, UpdateFineTunedModelRequest request) {
		// TODO Auto-generated method stub
		APIRequest<UpdateFineTunedModelRequest> apiRequest = new APIRequest<>("PATCH", BASE_URL + "/fine_tuning/models/" + modelId, "application/json");
		apiRequest.setContent(request);
		apiRequest.setContentCharset(StandardCharsets.UTF_8);
		return apiClient.sendAsync(apiRequest, new ResponseHandler<Model>() {

			@Override
			public Model handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), Model.class);
			}
		});
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#archiveFineTunedModel(java.lang.String)
	 */
	@Override
	public ArchivedFineTunedModel archiveFineTunedModel(String modelId) {
		// TODO Auto-generated method stub
		try {
			return apiClient.send(new APIRequest<>("POST", BASE_URL + "/fine_tuning/models/" + modelId + "/archive"), new ResponseHandler<ArchivedFineTunedModel>() {

				@Override
				public ArchivedFineTunedModel handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), ArchivedFineTunedModel.class);
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#archiveFineTunedModelAsync(java.lang.String)
	 */
	@Override
	public CompletableFuture<ArchivedFineTunedModel> archiveFineTunedModelAsync(String modelId) {
		// TODO Auto-generated method stub
		return apiClient.sendAsync(new APIRequest<>("POST", BASE_URL + "/fine_tuning/models/" + modelId + "/archive"), new ResponseHandler<ArchivedFineTunedModel>() {

			@Override
			public ArchivedFineTunedModel handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), ArchivedFineTunedModel.class);
			}
		});
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#unarchiveFineTunedModel(java.lang.String)
	 */
	@Override
	public ArchivedFineTunedModel unarchiveFineTunedModel(String modelId) {
		// TODO Auto-generated method stub
		try {
			return apiClient.send(new APIRequest<>("DELETE", BASE_URL + "/fine_tuning/models/" + modelId + "/archive"), new ResponseHandler<ArchivedFineTunedModel>() {

				@Override
				public ArchivedFineTunedModel handleResponse(HttpResponse<String> httpResponse) {
					// TODO Auto-generated method stub
					return objectTransformer.transform(httpResponse.body(), ArchivedFineTunedModel.class);
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

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.MistralAI#unarchiveFineTunedModelAsync(java.lang.String)
	 */
	@Override
	public CompletableFuture<ArchivedFineTunedModel> unarchiveFineTunedModelAsync(String modelId) {
		// TODO Auto-generated method stub
		return apiClient.sendAsync(new APIRequest<>("DELETE", BASE_URL + "/fine_tuning/models/" + modelId + "/archive"), new ResponseHandler<ArchivedFineTunedModel>() {

			@Override
			public ArchivedFineTunedModel handleResponse(HttpResponse<String> httpResponse) {
				// TODO Auto-generated method stub
				return objectTransformer.transform(httpResponse.body(), ArchivedFineTunedModel.class);
			}
		});
	}
}
