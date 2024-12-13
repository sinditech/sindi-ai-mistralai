/**
 * 
 */
package za.co.sindi.ai.mistral;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.mistral.chat.ToolChoiceEnum;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class ToolChoiceEnumAdapter implements JsonbAdapter<ToolChoiceEnum, String> {

	@Override
	public String adaptToJson(ToolChoiceEnum toolChoice) throws Exception {
		// TODO Auto-generated method stub
		if (toolChoice == null) return null;
		return toolChoice.toString();
	}

	@Override
	public ToolChoiceEnum adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ToolChoiceEnum.of(value);
	}
}
