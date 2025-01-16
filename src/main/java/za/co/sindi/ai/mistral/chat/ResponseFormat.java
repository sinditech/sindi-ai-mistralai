/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.mistral.ai/api/#tag/chat/operation/chat_completion_v1_chat_completions_post">Mistral AI Chat Completion documentation.</a>
 */
public class ResponseFormat implements Serializable {

	@JsonbProperty
	private ResponseFormats type;
	
	/**
	 * 
	 */
	public ResponseFormat() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the type
	 */
	public ResponseFormats getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ResponseFormats type) {
		this.type = type;
	}
}
