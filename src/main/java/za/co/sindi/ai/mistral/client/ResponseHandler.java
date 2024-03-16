/**
 * 
 */
package za.co.sindi.ai.mistral.client;

import java.net.http.HttpResponse;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
@FunctionalInterface
public interface ResponseHandler<T> {

	public T handleResponse(final HttpResponse<String> httpResponse);
}
