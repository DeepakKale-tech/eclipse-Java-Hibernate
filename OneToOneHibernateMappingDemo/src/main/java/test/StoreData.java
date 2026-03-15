package test;

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
				
				Person p = new Person();
//				p.setPid(1);
				p.setPname("Deepak");
				
				
				Marks m = new Marks();
				m.setId(1);
				m.setEng(77);
				m.setMath(87);
				m.setSci(94);
				
				p.setMarks(m);
				
				
				session.save(p);
				
				
				tx.commit();
				session.close();
				factory.close();
				
				System.out.println("Details Added Successfully");
	}
}
