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
				Employee e1 = new Employee();
				e1.setName("Deepak Kale");
				e1.setEmail("Dk@xyz.com");
				Employee e2 = new Employee();
				e2.setName("Amol Wahwal");
				e2.setEmail("Aw@xyz.com");
				Address a1 = new Address();
				a1.setAddressline1("XYZ Phase 1");
				a1.setCity("Pune");
				a1.setCountry("India");
				a1.setState("Maharashtra");
				a1.setPincode(001232);
				e1.setAddress(a1);
				e2.setAddress(a1);
				session.persist(e1);
				session.persist(e2);
				tx.commit();
				session.close();
				factory.close();
				System.out.println("Details Added Successfully");
	}
}
