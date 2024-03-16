/**
 * 
 */
package za.co.sindi.ai.mistral;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.mistral.chat.FinishReason;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class FinishReasonAdapter implements JsonbAdapter<FinishReason, String> {

	@Override
	public String adaptToJson(FinishReason finishReason) throws Exception {
		// TODO Auto-generated method stub
		if (finishReason == null) return null;
		return finishReason.toString();
	}

	@Override
	public FinishReason adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return FinishReason.of(value);
	}
}
