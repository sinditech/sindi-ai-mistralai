/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.mistral.ai/api/#tag/chat/operation/chat_completion_v1_chat_completions_post">Mistral AI Chat Completion documentation.</a>
 */
public enum ToolChoiceEnum {
	AUTO("auto")
	,NONE("none")
	,ANY("any")
	,REQUIRED("required")
	;
	private final String choice;

	/**
	 * @param choice
	 */
	private ToolChoiceEnum(String choice) {
		this.choice = choice;
	}
	
	public static ToolChoiceEnum of(final String value) {
		for (ToolChoiceEnum toolChoice : values()) {
			if (toolChoice.choice.equals(value)) return toolChoice;
		}
		
		throw new IllegalArgumentException("Invalid Tool Choice '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return choice;
	}
}
