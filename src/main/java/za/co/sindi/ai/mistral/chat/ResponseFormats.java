/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.mistral.ai/api/#tag/chat/operation/chat_completion_v1_chat_completions_post">Mistral AI Chat Completion documentation.</a>
 */
public enum ResponseFormats {
	TEXT("text")
	,JSON_OBJECT("json_object")
	;
	private final String format;

	/**
	 * @param format
	 */
	private ResponseFormats(String format) {
		this.format = format;
	}
	
	public static ResponseFormats of(final String value) {
		for (ResponseFormats format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid chat response format '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
