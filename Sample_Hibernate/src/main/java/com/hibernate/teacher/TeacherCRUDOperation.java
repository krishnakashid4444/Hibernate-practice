package com.hibernate.teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TeacherCRUDOperation {
	
	static EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
    static EntityManager entityManager = entitymanagerfactory.createEntityManager();
    static EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public static void saveData(Teacher t)
	{
		entityTransaction.begin();
		entityManager.persist(t);
		entityTransaction.commit();
		
	}
	public static void getDataById(int id)
	{
		Teacher t=entityManager.find(Teacher.class,id);
		System.out.println(t);
		
	}
	public static void deleteData(int id)
	{
		Teacher t = entityManager.find(Teacher.class,id);
		entityTransaction.begin();
		entityManager.remove(t);
		entityTransaction.commit();
		
	}
	public static void updateData(Teacher t)
	{
		t.setId(12);
		t.setName("Nagesh");
		t.setSalary(450000.00);
		t.setSubject("java");
		entityTransaction.begin();
		entityManager.merge(t);
		entityTransaction.commit();
		
	}

}
