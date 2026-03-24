package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// configure person hibernate file
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction trans = session.beginTransaction();
		
		Person p = new Person("Nayan",29,60000,"Pune");
		
		session.save(p);
		
		trans.commit();
		session.close();
		factory.close();
		
		System.out.println("Person Added Successfully");
	}

}
