package com.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con  =new ClassPathXmlApplicationContext("com/orm/config.xml");
		Dao dao = (Dao)con.getBean("dao");
//		Model m1 = new Model(2, "c++", "ahrhhgd");
//		dao.insertUser(m1);
		
//		Model m = dao.getModelById(1);
//		System.out.println(m);
		
//		List<Model> list = dao.getAllModel();
//		System.out.println(list);
		
//		Model m1 = new Model(2, "java", "ahrhhgd");
//		dao.updateModel(m1);
		
		Model m = dao.getModelById(1);
		dao.deleteModel(m);
	}
}
