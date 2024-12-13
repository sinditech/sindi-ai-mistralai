/**
 * 
 */
package za.co.sindi.ai.mistral;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.mistral.chat.ChatResponseFormat;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class ChatResponseFormatAdapter implements JsonbAdapter<ChatResponseFormat, String> {

	@Override
	public String adaptToJson(ChatResponseFormat format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ChatResponseFormat adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ChatResponseFormat.of(value);
	}
}
