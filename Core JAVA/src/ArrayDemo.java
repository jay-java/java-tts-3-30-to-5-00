import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int index=0;index<arr.length;index++){
			System.out.println(arr[index]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.print("enter element at a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		int addition = 0;
		for(int i=0;i<a.length;i++) {
			addition = addition + a[i];
		}
		System.out.println("addition of elements is : "+addition);
		int num;
		System.out.println("etner number to search in array : ");
		num = sc.nextInt();
		int counter=0;
		for(int i=0;i<a.length;i++) {
			if(num == a[i]) {
				counter++;
				break;
			}
		}
		if(counter==1) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
