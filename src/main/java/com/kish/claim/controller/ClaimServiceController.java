package com.kish.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kish.claim.exception.ClaimServiceException;
import com.kish.claim.model.ClaimServiceRequest;
import com.kish.claim.model.ClaimServiceResponse;
import com.kish.claim.service.ClaimService;





@RestController
@RequestMapping(value="/ClaimService")
public class ClaimServiceController {
	
	@Autowired
	ClaimService claimService;
	
	@GetMapping
    public ClaimServiceResponse getEmployee(@RequestParam("service-type")String serviceType,@RequestBody ClaimServiceRequest serviceRequest)
    {
		if(serviceType!=null && (serviceType.equalsIgnoreCase("DupCheck")||serviceType.equalsIgnoreCase("DrgPricing")))
		{
			serviceRequest.setServiceType(serviceType);
			System.out.println("serviceType"+serviceType);
		return claimService.getClaimDuplicate(serviceRequest);
		}
		else
			throw new ClaimServiceException("Service Not found", "ServiceException");
    }

}
