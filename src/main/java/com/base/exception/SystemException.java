package com.base.exception;

public class SystemException extends RuntimeException {

	/**
	 *    
	 */
	private static final long serialVersionUID = 8751539980339376205L;

	public SystemException() {
		super();
	}

	public SystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemException(String message) {
		super(message);
	}

	public SystemException(Throwable cause) {
		super(cause);
	}
}
