/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class ChatSystemTextMessage extends SystemMessage<String> {

	@JsonbProperty
	private String content;

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.chat.ChatMessage#getContent()
	 */
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.mistral.chat.ChatMessage#setContent(java.io.Serializable)
	 */
	@Override
	public void setContent(String content) {
		// TODO Auto-generated method stub
		this.content = content;
	}
}
