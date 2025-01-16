package za.co.sindi.ai.mistral.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class ModelCapabilities implements Serializable {

	@JsonbProperty("completion_chat")
	private Boolean completionChat;
	
	@JsonbProperty("completion_fim")
	private Boolean completionFim;
	
	@JsonbProperty("function_calling")
	private Boolean functionCalling;
	
	@JsonbProperty("fine_tuning")
	private Boolean fineTuning;
	
	@JsonbProperty
	private Boolean vision;

	/**
	 * @return the completionChat
	 */
	public Boolean getCompletionChat() {
		return completionChat;
	}

	/**
	 * @param completionChat the completionChat to set
	 */
	public void setCompletionChat(Boolean completionChat) {
		this.completionChat = completionChat;
	}

	/**
	 * @return the completionFim
	 */
	public Boolean getCompletionFim() {
		return completionFim;
	}

	/**
	 * @param completionFim the completionFim to set
	 */
	public void setCompletionFim(Boolean completionFim) {
		this.completionFim = completionFim;
	}

	/**
	 * @return the functionCalling
	 */
	public Boolean getFunctionCalling() {
		return functionCalling;
	}

	/**
	 * @param functionCalling the functionCalling to set
	 */
	public void setFunctionCalling(Boolean functionCalling) {
		this.functionCalling = functionCalling;
	}

	/**
	 * @return the fineTuning
	 */
	public Boolean getFineTuning() {
		return fineTuning;
	}

	/**
	 * @param fineTuning the fineTuning to set
	 */
	public void setFineTuning(Boolean fineTuning) {
		this.fineTuning = fineTuning;
	}

	/**
	 * @return the vision
	 */
	public Boolean getVision() {
		return vision;
	}

	/**
	 * @param vision the vision to set
	 */
	public void setVision(Boolean vision) {
		this.vision = vision;
	}
}
