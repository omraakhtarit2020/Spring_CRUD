package com.myfirstspringapp.myFirstApp.payload;

public class ApiResponse {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	private boolean success;

	public ApiResponse(String message, boolean success) {
		// TODO Auto-generated constructor stub
		this.message = message;
		this.success = success;

	}

}
