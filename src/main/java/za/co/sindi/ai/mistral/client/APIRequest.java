/**
 * 
 */
package za.co.sindi.ai.mistral.client;

import java.nio.charset.Charset;
import java.util.Objects;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public class APIRequest<T> {

	private String httpMethod;
	private String uri;
	private String contentType;
	private Charset contentCharset;
	private T content;
	
	/**
	 * @param httpMethod
	 * @param uri
	 */
	public APIRequest(String httpMethod, String uri) {
		this(httpMethod, uri, null);
	}
	
	/**
	 * @param httpMethod
	 * @param uri
	 * @param contentType
	 */
	public APIRequest(String httpMethod, String uri, String contentType) {
		super();
		this.httpMethod = Objects.requireNonNull(httpMethod, "An HTTP method is required.");
		this.uri = Objects.requireNonNull(uri, "A request URI is required.");
		this.contentType = contentType;
	}

	/**
	 * @return the httpMethod
	 */
	public String getHttpMethod() {
		return httpMethod;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @return the content
	 */
	public T getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(T content) {
		this.content = content;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @return the contentCharset
	 */
	public Charset getContentCharset() {
		return contentCharset;
	}

	/**
	 * @param contentCharset the contentCharset to set
	 */
	public void setContentCharset(Charset contentCharset) {
		this.contentCharset = contentCharset;
	}
}
