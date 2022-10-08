
public class StringClassDemo {
	public static void main(String[] args) {
		String s1 = "TOPS TECHNOLOGIES";
		String s2 = "TOPS TECHNOLOGIES";
		System.out.println(s1);
		String name = new String("TOPS");
		System.out.println(name);
		System.out.println(s1.length());
		System.out.println(s1.charAt(11));
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s1.contains("plsd"));
		System.out.println(s1.endsWith("A"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace('T', 'Q'));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
