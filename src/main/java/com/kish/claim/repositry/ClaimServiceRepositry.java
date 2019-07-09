package com.kish.claim.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kish.claim.entity.EnterpriseClaim;



@Repository
public interface ClaimServiceRepositry  extends CrudRepository<EnterpriseClaim, Long>{


}
