package com.hibernates.mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertMobileSim {
	
	public static void main(String[] args) {
		

		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        
        Sim s1 = new Sim();
        s1.setId(11);
        s1.setProvider("Airtel");
        s1.setNumber(3455677888l);
        
        Sim s2 =new Sim();
        s1.setId(102);
        s2.setProvider("jio");
        s2.setNumber(88463463534l);
        
        List<Sim> sims=new ArrayList<Sim>();
        sims.add(s1);
        sims.add(s2);
        
        mobile m=new mobile();
        m.setId(1);
        m.setName("one plus");
        m.setCost(40000);
        m.setSim(sims);
        
        entityTransaction.begin();
        entityManager.persist(m);
        entityManager.persist(s1);
        entityManager.persist(s2);
        entityTransaction.commit();
        
        
        
        
        
        
	}
	
	

}
