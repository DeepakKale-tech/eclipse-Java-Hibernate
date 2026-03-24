package test;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class StudentFetchByColumn {
	public static void main(String[] args) {
		//step 1 configure
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		//step2 Build session factory
		SessionFactory factory = config.buildSessionFactory();
		//step3 session open
		Session session = factory.openSession();
		//step4 query
		List<Object[]> list = session.createQuery("select s.name, s.age from Student s").list();
		for (Object[] row : list) {
		    String name = (String) row[0];
		    int age = (Integer) row[1];
		    System.out.println(name + " " + age);
		}
		session.close();
		factory.close();
		System.out.println("Operation Successfull...");
	}
}