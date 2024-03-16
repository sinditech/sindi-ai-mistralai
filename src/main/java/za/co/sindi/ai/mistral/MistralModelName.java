/**
 * 
 */
package za.co.sindi.ai.mistral;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/guides/model-selection/">Mistral Model Selection</a>.
 */
public enum MistralModelName {
	MISTRAl_7B("open-mistral-7b"),
	MIXTRAL_8x7B("open-mixtral-8x7b"),
	MISTRAL_SMALL("mistral-small-latest"),
	MISTRAL_MEDIUM("mistral-medium-latest"),
	MISTRAL_LARGE("mistral-large-latest")
	;
	private final String name;

	/**
	 * @param name
	 */
	private MistralModelName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
