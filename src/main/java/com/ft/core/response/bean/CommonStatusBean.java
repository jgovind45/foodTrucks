package com.ft.core.response.bean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common bean for the status response sent to web
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonStatusBean {
	@JsonProperty("status")
	private Integer status;

	@JsonProperty("message")
	private String message;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

