package Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("Autowire/config.xml");
		Student s1 = (Student)con.getBean("s1");
		System.out.println(s1);
	}
}
