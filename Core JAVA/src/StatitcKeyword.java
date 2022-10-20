
class Studen{
	static {
		System.out.println("static block in student");
	}
	int id;
	static String cname="TOPS";
	public Studen(int id) {
		this.id=id;
	}
	public void run() {
		System.out.println("run method inside student class");
	}
	public static void call() {
		System.out.println("call method inside student class");
	}
	@Override
	public String toString() {
		return "id : "+id+" cname : "+cname;
	}
}
public class StatitcKeyword {
	
	public static void main(String[] args) {
		Studen s1 = new Studen(1);
		Studen s2 = new Studen(2);
		System.out.println(s1);
		System.out.println(s2);
		s1.run();
		s1.call();
		Studen.call();
		
	}
	static {
		System.out.println("static block in main method");
	}
}
