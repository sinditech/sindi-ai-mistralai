/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.mistral.BaseRequest;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class ChatCompletionRequest extends BaseRequest {

//	@JsonbProperty
//	private String model;
	
	@JsonbProperty
	private List<ChatMessage> messages;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty("top_p")
	private Double topP;
	
	@JsonbProperty("max_tokens")
	private Integer maxTokens;
	
	@JsonbProperty
	private Boolean stream;
	
	@JsonbProperty("safe_prompt")
	private boolean safePrompt;
	
	@JsonbProperty("random_seed")
	private Integer randomSeed;

//	/**
//	 * @return the model
//	 */
//	public String getModel() {
//		return model;
//	}
//
//	/**
//	 * @param model the model to set
//	 */
//	public void setModel(String model) {
//		this.model = model;
//	}

	/**
	 * @return the messages
	 */
	public List<ChatMessage> getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(List<ChatMessage> messages) {
		this.messages = messages;
	}

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the topP
	 */
	public Double getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Double topP) {
		this.topP = topP;
	}

	/**
	 * @return the maxTokens
	 */
	public Integer getMaxTokens() {
		return maxTokens;
	}

	/**
	 * @param maxTokens the maxTokens to set
	 */
	public void setMaxTokens(Integer maxTokens) {
		this.maxTokens = maxTokens;
	}

	/**
	 * @return the stream
	 */
	public Boolean getStream() {
		return stream;
	}

	/**
	 * @param stream the stream to set
	 */
	public void setStream(Boolean stream) {
		this.stream = stream;
	}

	/**
	 * @return the safePrompt
	 */
	public boolean isSafePrompt() {
		return safePrompt;
	}

	/**
	 * @param safePrompt the safePrompt to set
	 */
	public void setSafePrompt(boolean safePrompt) {
		this.safePrompt = safePrompt;
	}

	/**
	 * @return the randomSeed
	 */
	public Integer getRandomSeed() {
		return randomSeed;
	}

	/**
	 * @param randomSeed the randomSeed to set
	 */
	public void setRandomSeed(Integer randomSeed) {
		this.randomSeed = randomSeed;
	}
}
