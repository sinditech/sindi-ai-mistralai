/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 15 March 2024
 */
@JsonbTypeInfo(
		key = "type",
		value = {
		    @JsonbSubtype(alias="text", type=TextContent.class),
		    @JsonbSubtype(alias="image_url", type=ImageUrlContent.class),
		}
	)
public abstract class Content implements Serializable {

}
