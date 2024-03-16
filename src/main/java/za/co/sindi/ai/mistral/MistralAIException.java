/**
 * 
 */
package za.co.sindi.ai.mistral;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class MistralAIException extends RuntimeException {

	private za.co.sindi.ai.mistral.error.Error error;

	/**
	 * @param error
	 */
	public MistralAIException(za.co.sindi.ai.mistral.error.Error error) {
		super(error.getMessage());
		this.error = error;
	}

	/**
	 * @param message
	 */
	public MistralAIException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the error
	 */
	public za.co.sindi.ai.mistral.error.Error getError() {
		return error;
	}
}
