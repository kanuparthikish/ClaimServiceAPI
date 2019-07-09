package com.kish.claim.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ClaimServiceExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(ClaimServiceException.class)
	public final ResponseEntity<Object> handleALLException(Exception ex, WebRequest request) throws Exception {
	
		ExceptionResponseEntity exceptionResponseEntity=new ExceptionResponseEntity("Claim Service::",ex.getMessage(),new Date(),request.getDescription(true));
		return new ResponseEntity<Object>(exceptionResponseEntity,HttpStatus.NOT_FOUND);
	}

}
