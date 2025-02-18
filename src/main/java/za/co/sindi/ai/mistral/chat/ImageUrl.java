/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class ImageUrl implements Serializable {

	@JsonbProperty
	private String url;
	
	@JsonbProperty
	private String detail;

	/**
	 * @param url
	 */
	public ImageUrl(String url) {
		super();
		this.url = Objects.requireNonNull(url, "A url is required.");
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
}
