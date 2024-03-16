/**
 * 
 */
package za.co.sindi.ai.mistral;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public abstract class BaseRequest implements Serializable {

	@JsonbProperty
	private String model;

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(MistralModelName model) {
		this.model = Objects.requireNonNull(model, "A Mistral Model name is required.").getName();
	}
}
