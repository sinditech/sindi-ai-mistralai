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
	MISTRAl_LARGE_LASTEST("mistral-large-latest"),
	PIXTRAL_LARGE_LATEST("pixtral-large-latest"),
	MISTRAL_MODERATION_LATEST("mistral-moderation-latest"),
	MISTRAL_3B_LATEST("mistral-3b-latest"),
	MISTRAL_8B_LATEST("mistral-8b-latest"),
	OPEN_MISTRAL_NEMO("open-mistral-nemo"),
	MISTRAL_SMALL_LATEST("mistral-small-latest"),
	CODESTRAL_LATEST("codestral-latest"),
	
	PIXTRAL_12B_2409("pixtral-12b-2409"),
	OPEN_CODESTRAL_MAMBA("open-codestral-mamba"),
	MISTRAL_EMBED("mistra-embed"),
	
	@Deprecated
	MISTRAl_7B("open-mistral-7b"),
	
	@Deprecated
	MIXTRAL_8x7B("open-mixtral-8x7b"),
	
	@Deprecated
	MISTRAL_SMALL("mistral-small-latest"),
	
	@Deprecated
	MISTRAL_MEDIUM("mistral-medium-latest"),
	
	@Deprecated
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
