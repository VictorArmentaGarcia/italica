package com.italika.demo.exception;

import com.italika.demo.enums.EnumHttpStatus;
import com.italika.demo.model.ErrorResponse;

import lombok.Data;

@Data
public class BusinessException extends Exception {

	private ErrorResponse errorResponse;
	
	public BusinessException(EnumHttpStatus status, String businessMessage, String exception) {
		super(businessMessage);
		errorResponse = new ErrorResponse(status, exception);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3994169212572730399L;

}
