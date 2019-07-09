package com.kish.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kish.claim.entity.EnterpriseClaim;
import com.kish.claim.model.ClaimServiceRequest;
import com.kish.claim.model.ClaimServiceResponse;
import com.kish.claim.repositry.ClaimServiceRepositry;
import com.kish.claim.util.ClaimServiceConverter;

@Service
public class ClaimService {
	
	@Autowired
	ClaimServiceRepositry claimServiceRepositry=null;
	@Autowired
	ClaimServiceConverter claimServiceConvertor=null;
	
	public ClaimServiceResponse getClaimDuplicate(ClaimServiceRequest claimServiceRequest)
	{
		ClaimServiceResponse response=null;
		try
		{
		EnterpriseClaim claim=claimServiceConvertor.convertoEnterpriseClaim(claimServiceRequest);
		claimServiceRepositry.save(claim);
		System.out.println("Save Claim");
		 response=claimServiceConvertor.convertoClaimServiceResponse(claim);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return response;
	}

	public ClaimServiceResponse getClaimInpatient(ClaimServiceRequest claimServiceRequest)
	{
		EnterpriseClaim claim=claimServiceConvertor.convertoEnterpriseClaim(claimServiceRequest);
		claimServiceRepositry.save(claim);
		ClaimServiceResponse response=claimServiceConvertor.convertoClaimServiceResponse(claim);
		return response;
	}
	
	
	
}
