package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setQid(1);
		q1.setQuetion("what is java ? ");

		Question q2 = new Question();
		q2.setQid(2);
		q2.setQuetion("what is python ? ");

		Answer a1 = new Answer();
		a1.setAid(1);
		a1.setAnswer("java HL,OP");
		
		Answer a2 = new Answer();
		a2.setAid(2);
		a2.setAnswer("python DS,WD");
		
		q1.setAnswer(a1);
		q2.setAnswer(a2);

		a1.setQuestion(q1);
		a2.setQuestion(q2);
		
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		tx.commit();
		session.close();
		sf.close();
	}
}
