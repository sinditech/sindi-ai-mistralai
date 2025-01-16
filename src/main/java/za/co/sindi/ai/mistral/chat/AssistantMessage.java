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
public abstract class AssistantMessage<T extends Serializable> extends Message<T> {
	
	@JsonbProperty("tool_calls")
	private ToolCall[] toolCalls;
	
	@JsonbProperty
	private Boolean prefix;

	/**
	 * @return the prefix
	 */
	public Boolean getPrefix() {
		return prefix;
	}

	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(Boolean prefix) {
		this.prefix = prefix;
	}
}
