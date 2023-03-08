package com.hibernate.teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TeacherMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        
        TeacherCRUDOperation.getDataById(11);
       // TeacherCRUDOperation.updateData();
        

	}

}
