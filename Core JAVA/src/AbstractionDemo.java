
abstract class RBI{
	public abstract void interest();
	public abstract void HL();
	public void RepoRate() {
		System.out.println("+-4 %");
	}
}
class SBI extends RBI{
	public void interest() {
		System.out.println("sbi interest : 5%");
	}
	public void HL() {
		System.out.println(" sbi hoem laon : 8 %");
	}
}
class JAVA extends RBI{
	public void interest() {
		System.out.println(" java interest : 7 %");
	}
	public void HL() {
		System.out.println(" java honme laon : 8 %");
	}
}
public class AbstractionDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		JAVA j  =new JAVA();
		j.interest();
		j.HL();
	}
}
