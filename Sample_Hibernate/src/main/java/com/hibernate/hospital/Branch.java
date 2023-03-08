package com.hibernate.hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {
	
	@Id
	@GeneratedValue(strategy)
	private int id;
	private String name;
	private String email_id;
	
	
	

}
