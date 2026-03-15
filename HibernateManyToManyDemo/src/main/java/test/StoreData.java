package test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {

		//Step:1 Reading details from hibernate configuration file
				Configuration conf=new Configuration();
				conf.configure("hibernate.cfg.xml");
				
				//Step:2 
				
				SessionFactory factory=conf.buildSessionFactory();
				
				//Step: 3
				
				Session session=factory.openSession();
				
				//Step: 4
				
				Transaction tx=session.beginTransaction();
				
				
				Answer ans1 = new Answer();
				ans1.setAnsname("Java is Programming Language");
				ans1.setPostby("Batman");
				
				
				Answer ans2 = new Answer();
				ans2.setAnsname("Java is Platform");
				ans2.setPostby("Joker");
				
				Answer ans3 = new Answer();
				ans3.setAnsname("Servlet is Server Side Webpage");
				ans3.setPostby("Deepak");
				
				Answer ans4 = new Answer();
				ans4.setAnsname("Servlet is API");
				ans4.setPostby("DKing");
				
				Question q1 = new Question();
				q1.setQname("What is Java?");
				
				Question q2 = new Question();
				q2.setQname("What is Servlet?");
				
				ArrayList<Answer> a1 = new ArrayList<Answer>();
				a1.add(ans1);
				a1.add(ans2);
				
				ArrayList<Answer> a2 = new ArrayList<Answer>();
				a2.add(ans3);
				a2.add(ans4);
				
				q1.setAnswer(a1);
				
				q2.setAnswer(a2);
				
				session.persist(q1);
				session.persist(q2);
				
				tx.commit();
				session.close();
				factory.close();
				
				System.out.println("Details Added Successfully");
	}
}
