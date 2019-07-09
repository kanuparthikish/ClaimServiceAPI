package com.kish.claim.exception;

import java.util.Date;

import lombok.Data;

@Data
public class ExceptionResponseEntity {
	private String errorCode=null;
	private String errorMessage=null;
	private Date errorDate=null;
	private String clientInfo=null;
	
	public ExceptionResponseEntity(String errorCode,String errorMessage,Date errorDate,String clientInfo)
	
	{
		this.errorCode=errorCode;
		this.errorDate=errorDate;
		this.errorMessage=errorMessage;
		this.clientInfo=clientInfo;
	}

}
