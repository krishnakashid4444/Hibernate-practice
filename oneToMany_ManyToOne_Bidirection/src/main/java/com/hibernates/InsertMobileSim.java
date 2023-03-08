package com.hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertMobileSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        
        
        Mobile m=new Mobile();
        m.setId(1);
        m.setName("one plus");
        m.setCost(23.456);
        
        
        Sim sim1 = new Sim();
        sim1.setId(101);
        sim1.setProvider("Airtel");
        sim1.setMobile(m);
        
        Sim sim2 = new Sim();
        sim2.setId(102);
        sim2.setProvider("Jio");
        sim2.setMobile(m);
        
        entityTransaction.begin();
        entityManager.persist(m);
        entityManager.persist(sim1);
        entityManager.persist(sim2);
        entityTransaction.commit();
        
        
        
        
        
        
        

	}

}
