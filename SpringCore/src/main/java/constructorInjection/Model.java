package constructorInjection;

public class Model {
	private int a;
	private int b;
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(int a, int b) {
		super();
		System.out.println("setting values by integer cons");
		this.a = a;
		this.b = b;
	}
	public Model(String a, String b) {
		super();
		System.out.println("setting values by String cons");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	public Model(double a, double b) {
		super();
		System.out.println("setting values by double cons");
		this.a = (int)a;
		this.b = (int)b;
	}
	@Override
	public String toString() {
		return "Model [a=" + a + ", b=" + b + "]";
	}
	
}
