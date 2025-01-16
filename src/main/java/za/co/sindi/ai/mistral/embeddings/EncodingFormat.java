/**
 * 
 */
package za.co.sindi.ai.mistral.embeddings;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.mistral.ai/api/#tag/embeddings/operation/embeddings_v1_embeddings_post">Mistral AI Chat Completion documentation.</a>
 */
public enum EncodingFormat {
	FLOAT("float")
	;
	private final String format;

	/**
	 * @param format
	 */
	private EncodingFormat(String format) {
		this.format = format;
	}
	
	public static EncodingFormat of(final String value) {
		for (EncodingFormat format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid encoding format '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
