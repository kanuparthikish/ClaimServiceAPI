package com.kish.claim.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ClaimServiceResponse {
	
	private String tcn;
	private Long memberSysId;
	private String responseType;
	private Date requestDate;

}
