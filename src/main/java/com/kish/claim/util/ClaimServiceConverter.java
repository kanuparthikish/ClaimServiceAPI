package com.kish.claim.util;

import org.springframework.context.annotation.Configuration;

import com.kish.claim.entity.EnterpriseClaim;
import com.kish.claim.model.ClaimServiceRequest;
import com.kish.claim.model.ClaimServiceResponse;

@Configuration
public class ClaimServiceConverter {

	public EnterpriseClaim convertoEnterpriseClaim(ClaimServiceRequest request)
	{
		EnterpriseClaim claim=new EnterpriseClaim();
		claim.setMemberSysId(request.getMemberSystemId());
		claim.setRequestType(request.getServiceType());
		claim.setTcn(request.getTcnNumber());
		return claim;
	}
	public ClaimServiceResponse convertoClaimServiceResponse(EnterpriseClaim request)
	{
		ClaimServiceResponse response=new ClaimServiceResponse();
		response.setResponseType(request.getRequestType());
		response.setMemberSysId(request.getMemberSysId());
		response.setRequestDate(request.getRequestDate());
		return response;
	}
}
