package com.hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class InsertPersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager  entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction =entityManager.getTransaction();
        
        
        
        Person  person =new Person();
        person.setId(12);
        person.setName("Dimple");
        
        person.setAge(24);
       
        
        Pan pan = new Pan();
        pan.setId(1);
        pan.setPanNumber("123GTRE67FD65");
        pan.setFatherName("Ramesh");
        pan.setPerson(person);
        
        
        
        
        
        entityTransaction.begin();
        entityManager.persist(person); // try to insert two table values
        entityManager.persist(pan);  //  try to insert two table values
        entityTransaction.commit();
        

	}

}
