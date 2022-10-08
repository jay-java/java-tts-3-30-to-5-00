
public class StringBuffreandStringBUilder {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		StringBuffer s1 = new StringBuffer(" java");
		System.out.println(s.append(s1));
		System.out.println(s);
		
		StringBuilder s2= new StringBuilder("hello");
		StringBuilder s3= new StringBuilder(" java");
		System.out.println(s2.append(s3));
		System.out.println(s2);
	}
}
