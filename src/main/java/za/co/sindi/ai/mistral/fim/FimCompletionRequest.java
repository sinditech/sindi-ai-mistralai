/**
 * 
 */
package za.co.sindi.ai.mistral.fim;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.mistral.BaseStreamRequest;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class FimCompletionRequest extends BaseStreamRequest {

	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty("top_p")
	private Double topP;
	
	@JsonbProperty("max_tokens")
	private Integer maxTokens;
	
//	@JsonbProperty
//	private Boolean stream;
	
	@JsonbProperty
	private String[] stop;
	
	@JsonbProperty("random_seed")
	private Integer randomSeed;
	
	@JsonbProperty
	private String prompt;
	
	@JsonbProperty
	private String suffix;
	
	@JsonbProperty("min_tokens")
	private Integer minTokens;

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the topP
	 */
	public Double getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Double topP) {
		this.topP = topP;
	}

	/**
	 * @return the maxTokens
	 */
	public Integer getMaxTokens() {
		return maxTokens;
	}

	/**
	 * @param maxTokens the maxTokens to set
	 */
	public void setMaxTokens(Integer maxTokens) {
		this.maxTokens = maxTokens;
	}

//	/**
//	 * @return the stream
//	 */
//	public Boolean getStream() {
//		return stream;
//	}
//
//	/**
//	 * @param stream the stream to set
//	 */
//	public void setStream(Boolean stream) {
//		this.stream = stream;
//	}

	/**
	 * @return the stop
	 */
	public String[] getStop() {
		return stop;
	}

	/**
	 * @param stop the stop to set
	 */
	public void setStop(String[] stop) {
		this.stop = stop;
	}

	/**
	 * @return the randomSeed
	 */
	public Integer getRandomSeed() {
		return randomSeed;
	}

	/**
	 * @param randomSeed the randomSeed to set
	 */
	public void setRandomSeed(Integer randomSeed) {
		this.randomSeed = randomSeed;
	}

	/**
	 * @return the prompt
	 */
	public String getPrompt() {
		return prompt;
	}

	/**
	 * @param prompt the prompt to set
	 */
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * @return the minTokens
	 */
	public Integer getMinTokens() {
		return minTokens;
	}

	/**
	 * @param minTokens the minTokens to set
	 */
	public void setMinTokens(Integer minTokens) {
		this.minTokens = minTokens;
	}
}
