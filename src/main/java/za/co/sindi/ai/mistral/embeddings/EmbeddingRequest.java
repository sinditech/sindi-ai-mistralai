/**
 * 
 */
package za.co.sindi.ai.mistral.embeddings;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.mistral.BaseRequest;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class EmbeddingRequest extends BaseRequest {

//	@JsonbProperty
//	private String model;
	
	@JsonbProperty
	private String[] inputs;
	
	@JsonbProperty("encoding_format")
	private EncodingFormat encodingFormat;

//	/**
//	 * @return the model
//	 */
//	public String getModel() {
//		return model;
//	}
//
//	/**
//	 * @param model the model to set
//	 */
//	public void setModel(String model) {
//		this.model = model;
//	}

	/**
	 * @return the inputs
	 */
	public String[] getInputs() {
		return inputs;
	}

	/**
	 * @param inputs the inputs to set
	 */
	public void setInputs(String[] inputs) {
		this.inputs = inputs;
	}

	/**
	 * @return the encodingFormat
	 */
	public EncodingFormat getEncodingFormat() {
		return encodingFormat;
	}

	/**
	 * @param encodingFormat the encodingFormat to set
	 */
	public void setEncodingFormat(EncodingFormat encodingFormat) {
		this.encodingFormat = encodingFormat;
	}
}
