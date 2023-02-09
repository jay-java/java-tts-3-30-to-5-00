package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Ques q1 = new Ques();
		q1.setQid(1);
		q1.setQuetion("what is java ?");
		
		Ans a1 = new Ans();
		a1.setAid(1);
		a1.setAnswer("HL");

		Ans a2 = new Ans();
		a2.setAid(2);
		a2.setAnswer("OOP");

		Ans a3 = new Ans();
		a3.setAid(3);
		a3.setAnswer("WD");
		
		List<Ans> list = new ArrayList<Ans>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswer(list);
		a1.setQuestion(q1);
		a2.setQuestion(q1);
		a3.setQuestion(q1);
		
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		tx.commit();
		session.close();
		sf.close();
	}
}
