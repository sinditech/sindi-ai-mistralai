/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public enum FinishReason {
	STOP("stop"),
	LENGTH("length"),
	MODEL_LENGTH("model_length"),
	ERROR("error"),
	TOOL_CALLS("tool_calls")
	;
	private final String value;

	/**
	 * @param value
	 */
	private FinishReason(String value) {
		this.value = value;
	}
	
	public static FinishReason of(final String value) {
		for (FinishReason reason : values()) {
			if (reason.value.equals(value)) return reason;
		}
		
		throw new IllegalArgumentException("Invalid Finish Reason '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}	
}
