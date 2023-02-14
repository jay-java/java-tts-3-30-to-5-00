package connection;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {
	SessionFactory sf = null;
	Session session = null;
	Configuration cfg = null;
	Properties prop = null;
	public Session createSession() {
		prop = new Properties();
		prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		prop.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hibernatecrud");
		prop.setProperty("hibernate.connection.username", "root");
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.show_sql", "true");
		cfg = new Configuration();
		cfg.configure().buildSessionFactory();
		cfg.addProperties(prop);
		sf = cfg.buildSessionFactory();
		session = sf.openSession();
		return session;
	}
}
