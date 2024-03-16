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
public class Choice implements Serializable {

	@JsonbProperty
	private int index;
	
	@JsonbProperty
	private ChatMessage message;
	
	@JsonbProperty("finish_reason")
	private FinishReason finishReason;

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * @return the message
	 */
	public ChatMessage getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(ChatMessage message) {
		this.message = message;
	}

	/**
	 * @return the finishReason
	 */
	public FinishReason getFinishReason() {
		return finishReason;
	}

	/**
	 * @param finishReason the finishReason to set
	 */
	public void setFinishReason(FinishReason finishReason) {
		this.finishReason = finishReason;
	}
}
