package com.hibernate.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        employe t=entityManager.find(employe.class,12);
        
        if(t!=null) {
        	entityTransaction.begin();
        	entityManager.remove(t);
        	entityTransaction.commit();
        	
        }
        else
        {
        	System.out.println("data is not present in table");
        }

	}

}
