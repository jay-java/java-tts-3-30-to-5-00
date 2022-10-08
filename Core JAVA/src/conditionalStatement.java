import java.util.Scanner;

//5 types of conditional statements
//1.simple if
//2.if else
//3.nested if
//4.else if ladder
//5.switch case
public class conditionalStatement {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("i = ");
		i = sc.nextInt();
		System.out.println("j = ");
		j = sc.nextInt();
		// 1.simple if
		if (i > j) {
			System.out.println("i is greater than j");
		}

		// 2.if else
		if (i > j) {
			System.out.println("i is greater than j");
		} else {
			System.out.println("j is greater than i");
		}

		// 3.nested if
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is grater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// 4.else if ladder
		System.out.println("enter marks : ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 50) {
			System.out.println("D greade");
		} else if (m >= 51 && m <= 70) {
			System.out.println("c grade");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch case
		System.out.println("enter 1 for English");
		System.out.println("enter 2 for HIndi");
		System.out.println("enter 3 for Gujarati");
		System.out.println("enter your choice");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("You selected English");
			break;

		case 2:
			System.out.println("You selected Hindi");
			break;

		case 3:
			System.out.println("You selected Guj");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
