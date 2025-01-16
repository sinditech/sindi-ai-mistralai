/**
 * 
 */
package za.co.sindi.ai.mistral.embeddings;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.mistral.models.UsageInfo;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class EmbeddingResponse implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private EmbeddingResponseData[] data;
	
	@JsonbProperty
	private UsageInfo usage;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

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
	public EmbeddingResponseData[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(EmbeddingResponseData[] data) {
		this.data = data;
	}

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
	 * @return the usage
	 */
	public UsageInfo getUsage() {
		return usage;
	}

	/**
	 * @param usage the usage to set
	 */
	public void setUsage(UsageInfo usage) {
		this.usage = usage;
	}	
}
