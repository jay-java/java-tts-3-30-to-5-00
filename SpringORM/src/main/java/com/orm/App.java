package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con  =new ClassPathXmlApplicationContext("com/orm/config.xml");
		Dao dao = (Dao)con.getBean("dao");
		Model m1 = new Model(1, "c", "ahmedabad");
		dao.insertUser(m1);
	}
}
