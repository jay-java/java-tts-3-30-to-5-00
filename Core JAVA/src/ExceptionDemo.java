import java.util.InputMismatchException;
import java.util.Scanner;

//abnormal situation occurs at runtime
//checked
//unchecked
//5.keyword
//1.try
//2.catch
//3.finally
//4.throw
//5.throws
class ThrowThrows{
	public void divide() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println(c);
//		throw new ArithmeticException();
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			ThrowThrows t = new ThrowThrows();
			t.divide();
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		
		
		
		
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a/b;
//			System.out.println(c);
//			System.exit(0);
//		} catch (ArithmeticException e) {
//			System.out.println("number cannot divide by zero");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("number cannot divid by string");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will execute everytime");
//		}
	}
}
