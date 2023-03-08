package com.hibernates.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonPanData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager  entityManager = entityManagerFactory.createEntityManager();
        
        person p=entityManager.find(person.class,1);
        System.out.println(p);    // not working gives error
        
        
        

	}

}
