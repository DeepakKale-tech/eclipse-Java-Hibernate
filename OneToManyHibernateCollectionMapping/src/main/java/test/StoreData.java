package test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step:1 Reading details from hibernate configuration file
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		//Step:2 
		SessionFactory factory=conf.buildSessionFactory();
		//Step: 3
		Session session=factory.openSession();
		//Step: 4
		Transaction tx=session.beginTransaction();
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Java is programming Language");
		l1.add("Java is platform");
		Question q1 = new Question();
		q1.setQname("What is java?");
		q1.setAnswers(l1);
		session.persist(q1);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Details Added Successfully");
	}

}
