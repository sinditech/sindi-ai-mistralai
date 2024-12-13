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
public class ToolChoiceFunction implements Serializable {

	@JsonbProperty
	private String name;
	
	/**
	 * @param name
	 */
	public ToolChoiceFunction(String name) {
		super();
		this.name = Objects.requireNonNull(name);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
