package oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg = new Configuration();
		cfg.configure("oneToOneMapping/hibernates.cfg.xml");
		
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		// creating question
		
		Question q1 = new Question();
		
		q1.setQuestionId(1212);
		q1.setQuestion("what is java");
		
		// creating answer
		
		Answer answer1=new Answer();
		
		answer1.setAnswerId(343);
		answer1.setAnswer("Java is a programming languge");
		q1.setAnswer(answer1);
		

		// creating question
		
		Question q2 = new Question();
		
		q2.setQuestionId(242);
		q2.setQuestion("what is collection");
		
		// creating answer
		
		Answer answer2=new Answer();
		
		answer2.setAnswerId(344);
		answer2.setAnswer("is a frameworks");
		q2.setAnswer(answer2);
		
		System.out.println("  Goooooood");
		
		Session session =factory.openSession();
		
		System.out.println("nice --------------------");
		
		Transaction tx= session.beginTransaction();
		
		System.out.println(" not fine---------");
		
		session.save(q1);
		session.save(q2);
		session.save(answer1);
		session.save(answer2);
		
		System.out.println("   here -------------");
		
		tx.commit();
		
		System.out.println("  kkkkkkkkkkkkkkkkkkk  ");
		
		session.close();
		
		factory.close();
		
		
		
		
		

	}

}
