class Math1{
	public void sum() {
		System.out.println("math 1 class");
	}
}
class Math2 extends Math1{
	public void sum() {
		
		System.out.println("math2 class");
		super.sum();
	}
}
public class Overriding {
	public static void main(String[] args) {
		Math2 m = new Math2();
		m.sum();
	}
}
