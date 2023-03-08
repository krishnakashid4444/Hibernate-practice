package com.hibernate.hospital;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patients {
	@Id
	@GeneratedValue(strategy = GenerationType)
	private int tid;
	private String name;
	private long phone_no;
	

}
