package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {

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
				
				Employee e1=new Employee();
				e1.setName("Deepak");
				
				Regular_emp e2 = new Regular_emp();
				e2.setName("Nayan");
				e2.setSalary(4500);
				e2.setBonus(43);
				
				Contract_emp e3 = new Contract_emp();
				e3.setName("Vishal");
				e3.setPay_per_hour(600);
				e3.setContract_period("3 Years");
				
				session.persist(e1);
				session.persist(e2);
				session.persist(e3);
				
				tx.commit();
				session.close();
				factory.close();
				
				System.out.println("Details Added Successfully");
	}

}
