package com.hibernate.teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
       
        Teacher t= entityManager.find(Teacher.class,11);
        System.out.println(t);
        
	}

}
