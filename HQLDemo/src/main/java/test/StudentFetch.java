package test;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentFetch {

	public static void main(String[] args) {

		//Step:1 Reading details from hibernate configuration file
				Configuration conf=new Configuration();
				conf.configure("hibernate.cfg.xml");
				
				//Step:2 
				
				SessionFactory factory=conf.buildSessionFactory();
				
				//Step: 3
				
				Session session=factory.openSession();
				
				//Step: 4
				
				List<Student> l1 = session.createQuery("From Student", Student.class).list();
				
				for(Student s1: l1)
				{
					System.out.println(s1.getName()+"  "+s1.getAge());
				}
				
				session.close();
				factory.close();
				
				System.out.println("Details Retrived Successfully");
	}
}