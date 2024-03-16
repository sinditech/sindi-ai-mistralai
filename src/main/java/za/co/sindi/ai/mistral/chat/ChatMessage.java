/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import jakarta.json.bind.annotation.JsonbProperty;
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
	    @JsonbSubtype(alias="system", type=ChatSystemMessage.class),
	    @JsonbSubtype(alias="user", type=ChatUserMessage.class),
	    @JsonbSubtype(alias="assistant", type=ChatAssistantMessage.class),
	}
)
public abstract class ChatMessage {

	@JsonbProperty
	private String content;

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
