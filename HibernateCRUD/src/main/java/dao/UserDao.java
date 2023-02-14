package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import connection.DBConnection;
import model.User;

public class UserDao {
	Transaction tx = null;
	Session session = null;
	public void insertUser(User u) {
		Session session = new DBConnection().createSession();
		tx = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
	}
//	public User loginUser(User u) {
//		
//	}
}
