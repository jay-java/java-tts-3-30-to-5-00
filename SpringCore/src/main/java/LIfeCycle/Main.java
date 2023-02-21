package LIfeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("LIfeCycle/config.xml");
		User u1 = (User)con.getBean("u1");
		System.out.println(u1);
		
		Model m1 = (Model)con.getBean("m1");
		System.out.println(m1);
		
		ByAnnotation a1 = (ByAnnotation)con.getBean("a1");
		System.out.println(a1);
		
		con.registerShutdownHook();
	}
}
