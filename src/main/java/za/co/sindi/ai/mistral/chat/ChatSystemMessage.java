/**
 * 
 */
package za.co.sindi.ai.mistral.chat;

import java.io.Serializable;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public abstract class ChatSystemMessage<T extends Serializable> extends ChatMessage<T> {

}
