package com.hibernatess;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudentSubject {
	
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("manisha");
	    EntityManager  entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction =entityManager.getTransaction();
	    
	    
	    Subject sub1=new Subject();
	    
	    sub1.setId(11);
	    sub1.setName("Java");
	    
	    Subject sub2=new Subject();
	    sub2.setId(12);
	    sub2.setName("sql");
	    
	    List<Subject>subjects = Arrays.asList(sub1,sub2);
	    
	    Student s1 = new Student();
	    s1.setId(1);
	    s1.setName("Dimple");
	    s1.setSubjects(subjects);
	    
	    
	    entityTransaction.begin();
	    entityManager.persist(s1);
	    entityManager.persist(sub1);
	    entityManager.persist(sub2);
	    entityTransaction.commit();
	    
		
	}
	
	
    
    
    
    
    
    
    

}
