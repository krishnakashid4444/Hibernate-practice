package com.hibernates.FirstHibernates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfg = new Configuration();
		cfg.configure("hibernates.cfg.xml");
		
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		System.out.println(factory);
		
		
		
		Student st = new Student();
		st.setId(44);
		st.setName("krishna");
		st.setCity("sanpada");
		System.out.println(st);
		
		
		
		Session session =factory.openSession();
		
		
		Transaction tr = session.beginTransaction();
		
		session.save(st);
		System.out.println("JJJJJJJJJJJJJJJJJ");
		
	     tr.commit();
	     
		System.out.println("ggggggggggggggg");
		
		session.close();
		
		
	}

}
