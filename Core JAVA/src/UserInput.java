import java.util.Scanner;

class abc{
	public void call() {
		System.out.println("abc class method");
	}
}
public class UserInput {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter i = ");
		i =  sc.nextInt();
		System.out.println(i);
		float f;
		System.out.println("enter f = ");
		f = sc.nextFloat();
		System.out.println(f);
		char c;
		System.out.println("enter character : ");
		c = sc.next().charAt(0);
		System.out.println(c);
		double d;
		System.out.println("enter d = ");
		d = sc.nextDouble();
		System.out.println(d);
		abc obj = new abc();
		obj.call();
		
	}
}
