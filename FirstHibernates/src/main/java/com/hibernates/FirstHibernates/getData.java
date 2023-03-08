
// get Data means Fetch Data



package com.hibernates.FirstHibernates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class getData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernates.cfg.xml");
		
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		
		Student student =(Student)session.get(Student.class,44); // load or get
		
		Address ad =(Address)session.get(Address.class,1);   // load or get
		
		System.out.println(ad);
		
		
		System.out.println(student);
		
		session.close();
		factory.close();
		
		

	}

}
