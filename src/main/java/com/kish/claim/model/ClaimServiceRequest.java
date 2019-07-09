package com.kish.claim.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ClaimServiceRequest {
	
	
	private String tcnNumber;
	private Long memberSystemId;
	private String serviceType;

}
