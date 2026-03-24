package test;
import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.sql.rowset.spi.TransactionalWriter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class StudentDao {
	public static void main(String[] args) {
		//Step:1 Reading details from hibernate configuration file
				Configuration conf=new Configuration();
				conf.configure("hibernate.cfg.xml");
				//Step:2 
				SessionFactory factory=conf.buildSessionFactory();
				//Step: 3
				Session session=factory.openSession();
				//Step: 4
				Transaction tx = session.beginTransaction();
				session.save(new Student("Deepak",27));
				session.save(new Student("King",26));
				session.save(new Student("Batman",29));
				session.save(new Student("Shark",44));
				tx.commit();
				session.close();
				factory.close();
				System.out.println("Details Saved Successfully");
	}
}