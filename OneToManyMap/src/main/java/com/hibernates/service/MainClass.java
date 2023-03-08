package com.hibernates.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernates.mobiledto.Mobile;
import com.hibernates.mobiledto.Sim;

public class MainClass {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        
        Mobile m1=new Mobile();
        m1.setId(101);
        m1.setBrand("Vivo");
        m1.setCost(20000);
        
        Sim s1=new Sim();
        
        s1.setId(201);
        s1.setProvide("Jio");
        s1.setImrc("asdd234");
        
        Sim s2=new Sim();
        
        s2.setId(202);
        s2.setProvide("airtel");
        s2.setImrc("xyz33445");
        
        List<Sim> sims=new ArrayList<Sim>();
        sims.add(s1);
        sims.add(s2);
        
        m1.setListofSim(sims);;
        
        entityTransaction.begin();
        entityManager.persist(s1);
        entityManager.persist(s2);
        entityManager.persist(m1);
        
        entityTransaction.commit();
        
        
        
        
        
        
        
		
		
	}

}
