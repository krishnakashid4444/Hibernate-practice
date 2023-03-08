package com.hibernates;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sim {
	@Id
	private int id;
	private String provider;
	@ManyToOne
	@JoinColumn
	
	private Mobile mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Sim [id=" + id + ", provider=" + provider + ", mobile=" + mobile + "]";
	}
	
	
	
	

}
