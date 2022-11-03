import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add(1);
		list.add("name");
		list.add(12.2);
		list.add('r');
		list.add(false);
		list.add(12323);
		list.add("xyz");
		list.remove(2);
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		Enumeration em  =list.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
