package com.hibernates.mobiledto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim {
	
	
	@Id
	private int id;
	private String provide;
	private String imrc;
	
	
	@Override
	public String toString() {
		return "Sim [id=" + id + ", provide=" + provide + ", imrc=" + imrc + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvide() {
		return provide;
	}
	public void setProvide(String provide) {
		this.provide = provide;
	}
	public String getImrc() {
		return imrc;
	}
	public void setImrc(String imrc) {
		this.imrc = imrc;
	}
	
	

}
