package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {

		//Step:1 Reading details from hibernate configuration file
				Configuration conf=new Configuration();
				conf.configure("hibernate.cfg.xml");
				
				//Step:2 
				
				SessionFactory factory=conf.buildSessionFactory();
				
				//Step: 3
				
				Session session=factory.openSession();
				
				//Step: 4
				
				TypedQuery q1 = session.createQuery("from Employee e");
				
				List<Employee> l1 = q1.getResultList();
				
				Iterator<Employee> itr = l1.iterator();
				
				while(itr.hasNext())
				{
					Employee emp = itr.next();
					System.out.println(emp.getEmpid()+"  "+emp.getName()+"  "+emp.getEmail());
					
					Address add = emp.getAddress();
					
					System.out.println(add.getAddressid()+"  "+add.getAddressline1()+"  "+add.getCity()+"  "+add.getCountry()+"  "+add.getState()+"  "+add.getPincode());
				}
				
				session.close();
				factory.close();
				
				System.out.println("Details Retrived Successfully");
	}
}
