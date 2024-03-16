/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class Usage implements Serializable {

	@JsonbProperty("prompt_tokens")
	private int promptTokens;
	
	@JsonbProperty("completion_tokens")
	private int completionTokens;
	
	@JsonbProperty("total_tokens")
	private int totalTokens;

	/**
	 * @return the promptTokens
	 */
	public int getPromptTokens() {
		return promptTokens;
	}

	/**
	 * @param promptTokens the promptTokens to set
	 */
	public void setPromptTokens(int promptTokens) {
		this.promptTokens = promptTokens;
	}

	/**
	 * @return the completionTokens
	 */
	public int getCompletionTokens() {
		return completionTokens;
	}

	/**
	 * @param completionTokens the completionTokens to set
	 */
	public void setCompletionTokens(int completionTokens) {
		this.completionTokens = completionTokens;
	}

	/**
	 * @return the totalTokens
	 */
	public int getTotalTokens() {
		return totalTokens;
	}

	/**
	 * @param totalTokens the totalTokens to set
	 */
	public void setTotalTokens(int totalTokens) {
		this.totalTokens = totalTokens;
	}
}
