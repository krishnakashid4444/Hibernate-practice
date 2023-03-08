package com.hibernate.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employe {
	
	@Id
	private int emp_id;
	private String emp_name;
	private int  emp_role;
	private int emp_sal;
	private String emp_address;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_role() {
		return emp_role;
	}
	public void setEmp_role(int emp_role) {
		this.emp_role = emp_role;
	}
	public int getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(int emp_sal) {
		this.emp_sal = emp_sal;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	
	

}
