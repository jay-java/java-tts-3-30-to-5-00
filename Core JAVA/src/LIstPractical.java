import java.util.ArrayList;
import java.util.List;

class Students{
	int id;
	String name;
	double per;
	public Students(int id,String name,double per) {
		this.id = id;
		this.name=name;
		this.per= per;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" per : "+per;
	}
}
public class LIstPractical {
	public static void main(String[] args) {
		Students s1  = new Students(1, "Rudra", 56.5);
		Students s2  = new Students(2, "Hemant", 56.5);
		Students s3  = new Students(3, "Vatsal", 56.5);
		Students s4  = new Students(4, "Kushal", 56.5);
		List<Students> list = new ArrayList<Students>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(list);
		
	}
}
