package referenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("referenceType/config.xml");
		Model m1 = (Model)con.getBean("m1");
		System.out.println(m1);
	}
}
