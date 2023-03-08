package com.hibernates.FirstHibernates;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

public class Test2 {

	public static void main(String[] args) throws IOException {
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
		
		Address ad=new Address();
		ad.setStreet("Street");
		ad.setCity("delhi");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(88.99);
		
		//To take image from pc
		
		FileInputStream fi=new FileInputStream("src/main/java/krishna.jpg");
		byte[ ]data =new byte[fi.available()];
		fi.read(data);
		ad.setImage(data);
		
		
         Session session =factory.openSession();
		
		
		Transaction tr = session.beginTransaction();
		
		session.save(st);
		session.save(ad);
		
		System.out.println("JJJJJJJJJJJJJJJJJ");
		
	     tr.commit();
	     
		System.out.println("ggggggggggggggg");
		
		session.close();
		
		System.out.println("success  ");
		
		
		

	}

}
