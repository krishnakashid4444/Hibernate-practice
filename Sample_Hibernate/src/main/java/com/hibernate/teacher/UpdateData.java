package com.hibernate.teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        Teacher t= new Teacher();
        t.setId(11);
        t.setName("Bikash");
        t.setSubject("advance java");
        t.setSalary(8900.0);
        
        entityTransaction.begin();
        entityManager.merge(t);
        entityTransaction.commit();
        
	}

}
