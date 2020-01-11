package com.capgemini.retailermaintainance.dto;

import java.util.List;

public class UserResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<UserInfo> beans;

	// Getters and Setters
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<UserInfo> getBeans() {
		return beans;
	}

	public void setBeans(List<UserInfo> beans) {
		this.beans = beans;
	}
}
