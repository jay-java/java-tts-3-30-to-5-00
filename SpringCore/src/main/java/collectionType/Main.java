package collectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("collectionType/config.xml");
		Data d1 = (Data)con.getBean("d1");
		System.out.println(d1);
	}
}
