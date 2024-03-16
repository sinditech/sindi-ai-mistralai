/**
 * 
 */
package za.co.sindi.ai.mistral.embeddings;

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
