/**
 * 
 */
package za.co.sindi.ai.mistral;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.mistral.embeddings.EncodingFormat;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class EncodingFormatAdapter implements JsonbAdapter<EncodingFormat, String> {

	@Override
	public String adaptToJson(EncodingFormat format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public EncodingFormat adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return EncodingFormat.of(value);
	}
}
