package com.hibernate.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class updateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        employe t= new employe();
        t.setEmp_id(1);
        t.setEmp_name("Raj");
        t.setEmp_role(32);
        t.setEmp_sal(3455);
        t.setEmp_address("Thane");
        
        entityTransaction.begin();
        entityManager.merge(t);
        entityTransaction.commit();

	}

}
