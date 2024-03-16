/**
 * 
 */
package za.co.sindi.ai.mistral.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class ModelList implements Serializable {

	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private Model[] data;

	/**
	 * @return the object
	 */
	public String getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
	}

	/**
	 * @return the data
	 */
	public Model[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Model[] data) {
		this.data = data;
	}
}
