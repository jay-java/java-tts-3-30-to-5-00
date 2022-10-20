final class ParentStu{
	final public void change() {
		System.out.println("change method inside parent");
	}
}
class student1 extends ParentStu{
	final int id = 1;
	public void change() {
//		id++;
		System.out.println(id);
	}
	
}
public class FInaleKeyword {
	public static void main(String[] args) {
		student1 s  = new student1();
		s.change();
	}
}
