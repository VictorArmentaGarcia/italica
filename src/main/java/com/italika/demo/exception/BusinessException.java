package com.italika.demo.exception;

import com.italika.demo.enums.EnumHttpStatus;
import com.italika.demo.model.ErrorResponse;

import lombok.Data;

/**
 * The Class BusinessException.
 */
@Data
public class BusinessException extends Exception {

	/** The error response. */
	private ErrorResponse errorResponse;
	
	/**
	 * Instantiates a new business exception.
	 *
	 * @param status the status
	 * @param businessMessage the business message
	 * @param exception the exception
	 */
	public BusinessException(EnumHttpStatus status, String businessMessage, String exception) {
		super(businessMessage);
		errorResponse = new ErrorResponse(status, exception);
	}

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3994169212572730399L;

}
