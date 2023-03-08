package com.hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager  entityManager = entityManagerFactory.createEntityManager();
        
        
        Pan p=entityManager.find(Pan.class,11);
        System.out.println(p);

	}

}
