package com.hibernate.teacher;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
       
        String jpql ="select t from Teacher t";
        
        Query q = entityManager.createQuery(jpql);
        List<Teacher> t=q.getResultList();
        System.out.println(t);
        
        

	}

}
