import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private float per;
	public Student() {
	}
	public Student(int id,String name,float per) {
		this.id=id;
		this.name=name;
		this.per=per;
	}
	Scanner sc = new Scanner(System.in);
	public void setId() {
		System.out.println("enter id : ");
		id = sc.nextInt();
	}
	public int getId() {
		return id;
	}
	public void setName() {
		System.out.println("enter name : ");
		name =sc.next();
	}
	public String getName() {
		return name;
	}
	public void setPer() {
		System.out.println("enter per : ");
		per = sc.nextFloat();
	}
	public float getPer() {
		return per;
	}
//	@Override
//	public String toString() {
//		return "id : "+id+" name : "+name+" per : "+per;
//	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.setId();
//		s1.setName();
//		s1.setPer();
//		System.out.println("id = "+s1.getId());
//		System.out.println("name = "+s1.getName());
//		System.out.println("per = "+s1.getPer());
		int id;
		String name;
		float per;
		Scanner sc  =new Scanner(System.in);
		System.out.println("enter id : ");
		id = sc.nextInt();
		System.out.println("enter name : ");
		name = sc.next();
		System.out.println("enter per : ");
		per = sc.nextFloat();
		Student s2 = new Student(id, name, per);
		System.out.println(s2);
	}
}
