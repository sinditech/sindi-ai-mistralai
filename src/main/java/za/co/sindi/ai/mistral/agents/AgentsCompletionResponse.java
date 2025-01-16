/**
 * 
 */
package za.co.sindi.ai.mistral.agents;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.mistral.chat.ChatCompletionChoice;
import za.co.sindi.ai.mistral.models.UsageInfo;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class AgentsCompletionResponse implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private long created;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private ChatCompletionChoice[] choices;
	
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
	 * @return the choices
	 */
	public ChatCompletionChoice[] getChoices() {
		return choices;
	}

	/**
	 * @param choices the choices to set
	 */
	public void setChoices(ChatCompletionChoice[] choices) {
		this.choices = choices;
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
