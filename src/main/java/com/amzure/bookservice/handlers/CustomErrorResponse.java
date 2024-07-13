package com.amzure.bookservice.handlers;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomErrorResponse {

	private int statusCode;
    private String message;
    private Map<String, String> errors;
	public CustomErrorResponse(int statusCode, String message, Map<String, String> errors) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.errors = errors;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<String, String> getErrors() {
		return errors;
	}
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
    
}
