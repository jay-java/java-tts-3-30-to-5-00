package ManyToMany;

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

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("abc");
		s1.setPer(45.4);
		Student s2= new Student();
		s2.setId(2);
		s2.setName("def");
		s2.setPer(46.4);
		Student s3= new Student();
		s3.setId(3);
		s3.setName("abc");
		s3.setPer(47.4);

		Teacher t1  =new Teacher();
		t1.setId(1);
		t1.setName("a");
		t1.setAddress("ahmedabad");

		Teacher t2  =new Teacher();
		t2.setId(2);
		t2.setName("b");
		t2.setAddress("kolkata");

		Teacher t3 =new Teacher();
		t3.setId(3);
		t3.setName("c");
		t3.setAddress("delhi");

		List<Student> slist = new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		
		List<Teacher> tlist = new ArrayList<Teacher>();
		tlist.add(t1);
		tlist.add(t2);
		tlist.add(t3);
		
		s1.setTeachers(tlist);
		s2.setTeachers(tlist);
		s3.setTeachers(tlist);
		
		t1.setStudents(slist);
		t2.setStudents(slist);
		t3.setStudents(slist);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
