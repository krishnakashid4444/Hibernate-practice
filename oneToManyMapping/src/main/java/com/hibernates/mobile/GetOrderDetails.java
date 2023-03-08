package com.hibernates.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetOrderDetails {
	
	EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
    EntityManager entityManager = entitymanagerfactory.createEntityManager();
    
    FoodOrderBill f= entityManager.find(FoodOrderBill.class,1111);  // check code on email as one to many mapping 2
    System.out.println(f);
    
    

}
