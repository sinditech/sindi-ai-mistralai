/**
 * 
 */
package za.co.sindi.ai.mistral.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;
import za.co.sindi.ai.mistral.chat.AssistantMessage;
import za.co.sindi.ai.mistral.chat.SystemMessage;
import za.co.sindi.ai.mistral.chat.ToolMessage;
import za.co.sindi.ai.mistral.chat.UserMessage;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="base", type=BaseModel.class),
	    @JsonbSubtype(alias="fine-tuned", type=FineTunedModel.class)
	}
)
public abstract class Model implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private long created;
	
	@JsonbProperty("owned_by")
	private String ownedBy;
	
	@JsonbProperty
	private ModelCapabilities capabilities;
	
	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty("max_context_length")
	private Integer maxContextLength;
	
	@JsonbProperty
	private String[] aliases;
	
	@JsonbProperty
	private String deprecation;
	
	@JsonbProperty("default_model_temperature")
	private Double defaultModelTemperature;

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
	 * @return the created
	 */
	public long getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(long created) {
		this.created = created;
	}

	/**
	 * @return the ownedBy
	 */
	public String getOwnedBy() {
		return ownedBy;
	}

	/**
	 * @param ownedBy the ownedBy to set
	 */
	public void setOwnedBy(String ownedBy) {
		this.ownedBy = ownedBy;
	}
}
