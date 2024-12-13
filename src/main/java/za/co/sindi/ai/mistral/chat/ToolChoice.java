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
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>
 */
public class ToolChoice implements Serializable {
	
	@JsonbProperty
	private String type;
	
	@JsonbProperty
	private ToolChoiceFunction function;

	/**
	 * 
	 */
	public ToolChoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param function
	 */
	public ToolChoice(ToolChoiceFunction function) {
		super();
		this.type = "function";
		this.function = Objects.requireNonNull(function);
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
	public ToolChoiceFunction getFunction() {
		return function;
	}

	/**
	 * @param function the function to set
	 */
	public void setFunction(ToolChoiceFunction function) {
		this.function = function;
	}
}
