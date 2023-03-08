package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

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
		
		// creating question
		
				Question q1 = new Question();
				
				q1.setQuestionId(1212);
				q1.setQuestion("what is java");
				
				// creating answer
				
				Answer answer1=new Answer();
				
				answer1.setAnswerId(343);
				answer1.setAnswer("Java is a programming languge");
				answer1.setQuestion(q1);
				
				
                Answer answer2=new Answer();
				
				answer2.setAnswerId(344);
				answer2.setAnswer("Java is a high level programming languge");
				answer2.setQuestion(q1);
				
                 Answer answer3=new Answer();
				
				answer3.setAnswerId(345);
				answer3.setAnswer("Java is a develop in 1995");
				answer3.setQuestion(q1);
				
				List <Answer> list=new ArrayList<Answer>();
				list.add(answer1);
				list.add(answer2);
				list.add(answer3);
				q1.setAnswer(list);
				
				
				
				
				
				Session session =factory.openSession();
				
				
				
				Transaction tx= session.beginTransaction();
				
				
				
				session.save(q1);
				
				session.save(answer1);
				session.save(answer2);
				session.save(answer3);
				
				
				
				tx.commit();
				
				
				
				session.close();
				
				factory.close();
				

	}

}
