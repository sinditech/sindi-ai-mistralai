/**
 * 
 */
package za.co.sindi.ai.mistral;

import java.io.InputStream;

import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class JSONObjectTransformer implements ObjectTransformer {

	private JsonbConfig newJsonbConfig() {
		JsonbConfig config = new JsonbConfig();
		config.withAdapters(new FinishReasonAdapter());
		return config;
	}
	
	@Override
	public <E> String transform(E object) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).toJson(object);
	}

	@Override
	public <E> E transform(String data, Class<E> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).fromJson(data, type);
	}

	@Override
	public <E> E transform(InputStream stream, Class<E> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).fromJson(stream, type);
	}
}
