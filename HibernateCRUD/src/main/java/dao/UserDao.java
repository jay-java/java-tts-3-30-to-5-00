package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import connection.DBConnection;
import model.User;

public class UserDao {
	Transaction tx = null;
	Session session = null;
	List<User> list = null;
	User u = null;
	public void insertUser(User u) {
		Session session = new DBConnection().createSession();
		tx = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
	}
	public User doLogin(User u) {
		try {
			session = new DBConnection().createSession();
			tx = session.beginTransaction();
			Query q = session.createQuery("from User u where u.email=:email and u.password=:password");
			q.setParameter("email", u.getEmail());
			q.setParameter("password", u.getPassword());
			list = q.list();
			u = list.get(0);
			tx.commit();
			session.close();
		} catch (Exception e) {
			u = null;
			e.printStackTrace();
		}
		return u;
	}
	public User getUserById(int uid) {
		try {
			session = new DBConnection().createSession();
			tx = session.beginTransaction();
			Query q = session.createQuery("from UserBean u where u.uid=:uid");
			q.setParameter("uid", uid);
			list = q.list();
			u = list.get(0);
			session.close();
		} catch (Exception e) {
			u=null;
			e.printStackTrace();
		}
		return u;
	}

}
