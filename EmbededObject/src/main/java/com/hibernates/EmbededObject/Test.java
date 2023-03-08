package com.hibernates.EmbededObject;

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
		
		Student student1 =new Student();
		
		student1.setId(66);
		student1.setName("hare krishna");
		student1.setCity("sanpada");
		
		
		Certificate certificate1 =new Certificate();
		
		certificate1.setCourse("Java");
		certificate1.setDuration("2 months");
		student1.setCerti(certificate1);
		
		
        Student student2 =new Student();
		
		student2.setId(67);
		student2.setName("vainkateshwar");
		student2.setCity("tirupati");
		
         Certificate certificate2 =new Certificate();
		
		certificate2.setCourse("spring");
		certificate2.setDuration("2 months");
		student2.setCerti(certificate2);
		
		
		
         Session session =factory.openSession();
		
		
		Transaction tr = session.beginTransaction();
		
		session.save(student1);
		session.save(student2);
		
		
	     tr.commit();
	     
	
		
		session.close();
		
		
		
		

	}

}
