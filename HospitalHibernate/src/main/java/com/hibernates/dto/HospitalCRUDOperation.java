package com.hibernates.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernates.dao.Hospital;



public class HospitalCRUDOperation {
	
	static EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
    static EntityManager entityManager = entitymanagerfactory.createEntityManager();
    static EntityTransaction entityTransaction= entityManager.getTransaction();

    
    public static void saveData(Hospital h)
	{
		entityTransaction.begin();
		entityManager.persist(h);
		entityTransaction.commit();
		
	}
	public static void getDataById(int id)
	{
		Hospital h =entityManager.find(Hospital.class,id);
		System.out.println(h);
		
	}
	public static void deleteData(int id)
	{
		Hospital h = entityManager.find(Hospital.class,id);
		entityTransaction.begin();
		entityManager.remove(h);
		entityTransaction.commit();
		
	}
}
