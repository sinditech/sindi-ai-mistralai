/**
 * 
 */
package za.co.sindi.ai.mistral;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.mistral.chat.ResponseFormats;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class ResponseFormatsAdapter implements JsonbAdapter<ResponseFormats, String> {

	@Override
	public String adaptToJson(ResponseFormats format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ResponseFormats adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ResponseFormats.of(value);
	}
}
