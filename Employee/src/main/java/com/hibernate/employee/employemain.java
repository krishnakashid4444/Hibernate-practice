package com.hibernate.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class employemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        
        employe t = new employe();
        
        t.setEmp_id(1);
        t.setEmp_name("Raj");
        t.setEmp_role(30);
        t.setEmp_sal(34567);
        t.setEmp_address("sanpada");
        
        entityTransaction.begin();
        entityManager.persist(t);
        entityTransaction.commit();

	}

}
