
class CALL{
	public void run() {
		System.out.println("run method inside call class");
	}
}
public class ClassObject {
	public static void main(String[] args) {
		CALL c  = new CALL();
		c.run();
	}
}
