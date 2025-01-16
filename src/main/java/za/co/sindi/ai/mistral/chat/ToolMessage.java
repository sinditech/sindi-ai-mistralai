/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public abstract class ToolMessage<T extends Serializable> extends Message<T> {
	
	@JsonbProperty("tool_call_id")
	private String toolCallId;
	
	@JsonbProperty
	private String name;

	/**
	 * @return the toolCallId
	 */
	public String getToolCallId() {
		return toolCallId;
	}

	/**
	 * @param toolCallId the toolCallId to set
	 */
	public void setToolCallId(String toolCallId) {
		this.toolCallId = toolCallId;
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
}
