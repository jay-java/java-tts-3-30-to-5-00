//1.Class
//2.OBject
//3.Inheritance->to access property of one class to another class
//	types of
//		1.single
//		2.multilevel
//		3.multiple
//		4.hierarchical
//		5.hybrid
//4.Polymorphism -> Same method name but having differrent functionalities
//	types
//		1.Complitime->Method overloading
//		2.Runtime->Method Overriding
//5.Abstraction
//6.Encapsulation



//1.single inheritance
class A1{ //parent,base
	public void a1Method() {
		System.out.println("a1 class method");
	}
}
class B extends A1{ //child,derived
	public void bMethod() {
		System.out.println("b class method");
	}
}
class C extends B{
	public void cClass() {
		System.out.println("c class method");
	}
}
public class InheritanceDmeo {
	public static void main(String[] args) {
		B b = new B();
		b.a1Method();
		b.bMethod();
		C c  = new C();
		c.a1Method();
		c.bMethod();
		c.cClass();
	}
}
