/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
@JsonbTypeInfo(
	key = "role",
	value = {
	    @JsonbSubtype(alias="system", type=SystemMessage.class),
	    @JsonbSubtype(alias="user", type=UserMessage.class),
	    @JsonbSubtype(alias="assistant", type=AssistantMessage.class),
	    @JsonbSubtype(alias="tool", type=ToolMessage.class),
	}
)
public abstract class Message<T extends Serializable> implements Serializable {

	/**
	 * @return the content
	 */
	public abstract T getContent();

	/**
	 * @param content the content to set
	 */
	public abstract void setContent(T content);
}
