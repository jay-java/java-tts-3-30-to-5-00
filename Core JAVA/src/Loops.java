//1.for
//2.while
//3.do while
//4.for each
public class Loops {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for(String s:args) {
			System.out.println(s);
		}
		
		System.out.println("for loop");
		for(int i=6;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("while loop");
		//while(condition)
		int j=6;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		System.out.println("do while");
		int k=6;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=5);
	}
}
