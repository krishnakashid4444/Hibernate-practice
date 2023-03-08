package com.hibernates.mobiledto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	@Id
	private int id;
	private String brand;
	private double cost;
	
	@OneToMany
	private List<Sim> listofSim;
	
	
	public List<Sim> getListofSim() {
		return listofSim;
	}
	public void setListofSim(List<Sim> listofSim) {
		this.listofSim = listofSim;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", cost=" + cost + ", listofSim=" + listofSim + "]";
	}
	
	
	
	

}
