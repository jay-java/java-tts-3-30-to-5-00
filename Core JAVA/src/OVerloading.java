class MAthematics{
	public void sum(int i,int j) {
		System.out.println(i+j);
	}
	public void sum(float a,int b) {
		System.out.println("sum method 1");
	}
}
public class OVerloading {
	public static void main(String[] args) {
		MAthematics m = new MAthematics();
				m.sum(1,2);
	}
}
