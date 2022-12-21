package com.shashi;

public class ExceptionExample01 extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionExample01(String message) {
		super(message);
	}

	public ExceptionExample01(String message, Throwable cause) {
		super(message, cause);
	}

}
