package com.hibernates.person;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class person {
	
	@Id
	private int id;
	private String name;
    private int age;
    
    @Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", age=" + age + ", pan=" + pan + "]";
	}
	@OneToOne
    private Pan pan;
    
	public Pan getPan() {
		return pan;
	}
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
