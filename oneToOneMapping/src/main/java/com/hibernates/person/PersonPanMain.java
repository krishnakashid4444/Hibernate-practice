package com.hibernates.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonPanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager  entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction =entityManager.getTransaction();
        
        Pan pan = new Pan();
       pan.setId(12);
        pan.setPan_no("123GTRE67FD65");
       pan.setFather_name("Ramesh");
        
        person  person =new person();
        person.setId(1);
        person.setName("Dimple");
        person.setAge(24);
        person.setPan(pan);
        
        entityTransaction.begin();
        entityManager.persist(person); // try to insert two table values
        entityManager.persist(pan);  //  try to insert two table values
        entityTransaction.commit();
        
		
		
		
		
	}

}
