package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentFetchByWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step1 configu
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		//step2 build session factory
		SessionFactory factory = config.buildSessionFactory();
		
		//step3 open session
		Session session = factory.openSession();
		
		//step 4 query
		
		List<Student> list = session.createQuery("From Student s where s.age > :a",Student.class).setParameter("a", 28).list();
		
		for(Student s:list)
		{
			System.out.println("Id: "+s.getId());
			System.out.println("Name: "+s.getName());
			System.out.println("Age: "+s.getAge());
		}
		session.close();
		factory.close();
		System.out.println("Success.");
		
	}

}
