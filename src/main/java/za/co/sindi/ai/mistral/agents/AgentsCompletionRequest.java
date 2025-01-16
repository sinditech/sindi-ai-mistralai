/**
 * 
 */
package za.co.sindi.ai.mistral.agents;

import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.mistral.BaseStreamRequest;
import za.co.sindi.ai.mistral.chat.Message;
import za.co.sindi.ai.mistral.chat.ResponseFormat;
import za.co.sindi.ai.mistral.chat.Tool;
import za.co.sindi.ai.mistral.chat.ToolChoice;
import za.co.sindi.ai.mistral.chat.ToolChoiceEnum;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 * @see <a href="https://docs.mistral.ai/api/">Mistral API Docs</a>.
 */
public class AgentsCompletionRequest extends BaseStreamRequest {

	@JsonbProperty("agent_id")
	private String agentId;
	
	@JsonbProperty
	private List<Message<?>> messages;
	
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
	
	@JsonbProperty("response_format")
	private ResponseFormat responseFormat;
	
	@JsonbProperty
	private Tool[] tools;
	
	@JsonbProperty("tool_choice")
	private Object toolChoice;
	
	@JsonbProperty("presence_penalty")
	private Double presencePenalty;
	
	@JsonbProperty("frequency_penalty")
	private Double frequencyPenalty;
	
	@JsonbProperty
	private Integer n;

	/**
	 * @return the agentId
	 */
	public String getAgentId() {
		return agentId;
	}

	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	/**
	 * @return the messages
	 */
	public List<Message<?>> getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(List<Message<?>> messages) {
		this.messages = messages;
	}

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
	 * @return the responseFormat
	 */
	public ResponseFormat getResponseFormat() {
		return responseFormat;
	}

	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(ResponseFormat responseFormat) {
		this.responseFormat = responseFormat;
	}

	/**
	 * @return the tools
	 */
	public Tool[] getTools() {
		return tools;
	}

	/**
	 * @param tools the tools to set
	 */
	public void setTools(Tool[] tools) {
		this.tools = tools;
	}

	/**
	 * @return the toolChoice
	 */
	public Object getToolChoice() {
		return toolChoice;
	}

	/**
	 * @param toolChoice the toolChoice to set
	 */
	public void setToolChoice(ToolChoice toolChoice) {
		this.toolChoice = toolChoice;
	}
	
	/**
	 * @param toolChoice the toolChoice to set
	 */
	public void setToolChoice(ToolChoiceEnum toolChoice) {
		this.toolChoice = toolChoice;
	}

	/**
	 * @return the presencePenalty
	 */
	public Double getPresencePenalty() {
		return presencePenalty;
	}

	/**
	 * @param presencePenalty the presencePenalty to set
	 */
	public void setPresencePenalty(Double presencePenalty) {
		this.presencePenalty = presencePenalty;
	}

	/**
	 * @return the frequencyPenalty
	 */
	public Double getFrequencyPenalty() {
		return frequencyPenalty;
	}

	/**
	 * @param frequencyPenalty the frequencyPenalty to set
	 */
	public void setFrequencyPenalty(Double frequencyPenalty) {
		this.frequencyPenalty = frequencyPenalty;
	}

	/**
	 * @return the n
	 */
	public Integer getN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(Integer n) {
		this.n = n;
	}
}
