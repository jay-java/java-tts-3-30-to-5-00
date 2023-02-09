package hiberCore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sf  = new Configuration().configure("hiberCore/hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
//		
//		User u = new User(3,"python",45);
//		session.save(u);
		
//		User u = session.get(User.class, 3);
//		System.out.println(u);
		
//		User u = new User(3,"python",98);
//		session.update(u);
		User u = new User(3,"python",98);
		session.delete(u);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
