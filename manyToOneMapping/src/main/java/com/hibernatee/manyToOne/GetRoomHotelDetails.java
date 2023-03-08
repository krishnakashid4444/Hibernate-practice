package com.hibernatee.manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetRoomHotelDetails {
	
	EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("manisha");
    EntityManager entityManager = entitymanagerfactory.createEntityManager();
    
    Room r=entityManager.find(Room.class,2);
    

}
