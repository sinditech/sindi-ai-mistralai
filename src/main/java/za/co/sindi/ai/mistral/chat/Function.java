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
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class Function implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty
	private String arguments;

	/**
	 * 
	 */
	public Function() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param description
	 * @param arguments
	 */
	public Function(String name, String description, String arguments) {
		this(name,  arguments);
		this.description = description;
	}

	/**
	 * @param name
	 * @param arguments
	 */
	public Function(String name, String arguments) {
		super();
		this.name = Objects.requireNonNull(name);
		this.arguments = Objects.requireNonNull(arguments);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the arguments
	 */
	public String getArguments() {
		return arguments;
	}

	/**
	 * @param arguments the arguments to set
	 */
	public void setArguments(String arguments) {
		this.arguments = arguments;
	}
}
