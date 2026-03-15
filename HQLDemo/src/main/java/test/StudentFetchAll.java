package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentFetchAll {

	public static void main(String[] args)
	{
		//step 1 configure
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		//step 2 build session factory
		SessionFactory factory = config.buildSessionFactory();
		
		//step 3 open session
		Session session = factory.openSession();
		
		//step 4 query
		Query q = session.createQuery("From Student",Student.class);
		List<Student> list = q.list();
		
		for(Student s:list)
		{
			System.out.println("Id: "+s.getId());
			System.out.println("Name: "+s.getName());
			System.out.println("Age: "+s.getAge());
		}
		session.close();
		factory.close();
	}
}
