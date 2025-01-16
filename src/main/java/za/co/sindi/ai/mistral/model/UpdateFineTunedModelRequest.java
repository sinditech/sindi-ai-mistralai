/**
 * 
 */
package za.co.sindi.ai.mistral.model;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.mistral.BaseRequest;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class UpdateFineTunedModelRequest extends BaseRequest {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String description;

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
}
