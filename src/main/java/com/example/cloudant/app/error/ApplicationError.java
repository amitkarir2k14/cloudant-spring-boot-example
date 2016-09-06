package com.example.cloudant.app.error;

public class ApplicationError extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1332127140175131253L;
	private int id;
	private String message;

	public ApplicationError(int id, String message) {
		this.id = id;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
