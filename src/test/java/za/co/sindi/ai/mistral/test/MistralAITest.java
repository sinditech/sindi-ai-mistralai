/**
 * 
 */
package za.co.sindi.ai.mistral.test;

import java.util.stream.Stream;

import za.co.sindi.ai.mistral.MistralAI;
import za.co.sindi.ai.mistral.MistralAIImpl;
import za.co.sindi.ai.mistral.model.ModelList;

/**
 * @author Buhake Sindi
 * @since 02 March 2024
 */
public class MistralAITest {

	public static void main(String[] args) {
		testMistralGetModel();
	}
	
	private static void testMistralGetModel() {
		MistralAI ai = new MistralAIImpl("asdfsdfsdfasdfasdf");
		ModelList modelList = ai.listModels();
		Stream.of(modelList.getData()).forEach(model -> System.out.println(model.getId()));
	}
}
