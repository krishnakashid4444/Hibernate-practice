package com.hibernate.hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
	@Id
	private int id;
	private String name;
	private long phone_no;
	

}
