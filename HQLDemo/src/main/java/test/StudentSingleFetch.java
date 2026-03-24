package test;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class StudentSingleFetch {
	public static void main(String[] args) {
		//Step:1 Reading details from hibernate configuration file
				Configuration config = new Configuration();
				config.configure("hibernate.cfg.xml");
				//Step:2 
				SessionFactory factory = config.buildSessionFactory();	
				//Step: 3
				Session session = factory.openSession();
				//Step: 4
				Student s = session.get(Student.class,4);
				if(s!=null)
				{
					System.out.println("Id: "+s.getId()+"  Name: "+s.getName()+"  Age: "+s.getAge());
				}else
				{
					System.out.println("Student not found");
				}
				Student s2 = session.createQuery("From Student s where s.name=:d", Student.class).setParameter("d", "Deepak").uniqueResult();
				if(s2!=null)
				{
					System.out.println("Id: "+s2.getId()+"   Name: "+s2.getName()+"   Age: "+s2.getAge());
				}else
				{
					System.out.println("student not found for s2");
				}
				session.close();
				factory.close();
				System.out.println("Single record Retrived Successfully");
	}
}