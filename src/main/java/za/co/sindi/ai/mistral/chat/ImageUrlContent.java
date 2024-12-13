/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class ImageUrlContent extends Content {

	@JsonbProperty("image_url")
	private ImageUrl imageUrl;

	/**
	 * @param text
	 */
	public ImageUrlContent(ImageUrl imageUrl) {
		super();
		this.imageUrl = Objects.requireNonNull(imageUrl, "A text is required.");
	}

	/**
	 * @return the imageUrl
	 */
	public ImageUrl getImageUrl() {
		return imageUrl;
	}
}
