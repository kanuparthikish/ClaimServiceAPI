package com.kish.claim.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;



@ResponseStatus(HttpStatus.NOT_FOUND)
@Data
public class ClaimServiceException extends RuntimeException {
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errorMessage;
	public ClaimServiceException(String errorCode,String errorMessage)
	{
	   super(errorMessage);
		this.errorCode=errorCode;
		this.errorMessage=errorMessage;
	}

}
