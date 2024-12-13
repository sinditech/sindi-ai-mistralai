/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.mistral.ai/api/#tag/chat/operation/chat_completion_v1_chat_completions_post">Mistral AI Chat Completion documentation.</a>
 */
public class Tool implements Serializable {
	
	@JsonbProperty
	private String type;
	
	@JsonbProperty
	private Function function;

	/**
	 * 
	 */
	public Tool() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param type
	 * @param function
	 */
	public Tool(String type, Function function) {
		super();
		this.type = type;
		this.function = function;
	}

	/**
	 * @param function
	 */
	public Tool(Function function) {
		this("function", Objects.requireNonNull(function));
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the function
	 */
	public Function getFunction() {
		return function;
	}

	/**
	 * @param function the function to set
	 */
	public void setFunction(Function function) {
		this.function = function;
	}
}
