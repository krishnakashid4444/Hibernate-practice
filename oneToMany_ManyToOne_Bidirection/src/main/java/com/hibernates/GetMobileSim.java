package com.hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobileSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
        EntityManager entityManager = entitymanagerfactory.createEntityManager();
        
       // Mobile m = entityManager.find(Mobile.class,1);
       /// System.out.println(m);
        
        Sim m=entityManager.find(Sim.class,101);
        System.out.println(m);
        

	}

}
