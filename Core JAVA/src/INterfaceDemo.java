
interface inter1{
	public void interface1();
	public static void interface4() {
		System.out.println("interface 4");
	}
}
interface inter2 extends inter1{
	public void interface2();
}
interface inter3{
	public void interface3();
}
class Calling implements inter2,inter3{

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		
	}
	
}
public class INterfaceDemo {
	public static void main(String[] args) {
		inter1.interface4();
	}
}
