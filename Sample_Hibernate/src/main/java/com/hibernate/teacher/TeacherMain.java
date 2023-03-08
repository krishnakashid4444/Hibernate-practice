package com.hibernate.teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TeacherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        
        Teacher t = new Teacher();
        
        t.setId(12);
        t.setName("Raj");
        t.setSubject("java");
        t.setSalary(34567.8);
        
        entityTransaction.begin();
        entityManager.persist(t);
        entityTransaction.commit();
	}

}
