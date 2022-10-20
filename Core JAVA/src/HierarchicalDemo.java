
class Parent{
	public void parentMehotd() {
		System.out.println("parent method");
	}
}
class Child1 extends Parent{
	public void child1Method() {
		System.out.println("child 1 method");
	}
}
class child2 extends Parent{
	public void child2Method() {
		System.out.println("child 2 method");
	}
}
public class HierarchicalDemo {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.child1Method();
		c1.parentMehotd();
		
		child2 c2  =new child2();
		c2.child2Method();
		c2.parentMehotd();
	}
}
