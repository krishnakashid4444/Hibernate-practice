package com.hibernate.teacher;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDataBySubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();

        String jpql="Select t from Teacher t where t.subject = ?1";
        Query q= entityManager.createQuery(jpql);
        
        q.setParameter(1, "advance java");
        List<Teacher> t =q.getResultList();
        System.out.println(t);
        
        
	}

}
