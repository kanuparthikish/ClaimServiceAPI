package com.kish.claim.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;



import lombok.Data;

@Data
@Entity(name="CLAIM_TB")
public class EnterpriseClaim {
	
	@Id
	@Column(name="id")
	@GeneratedValue(generator="claim_seq")
	@SequenceGenerator(name="claim_seq",sequenceName="claim_id_seq",allocationSize=1)
	private Long id;
	@Column(name="tcn")
	private String tcn;
	@Column(name="memberSysId")
	private Long memberSysId;
	@Column(name="requestType")
	private String requestType;
	@Column(name="requestDate")
	private Date requestDate;


}
