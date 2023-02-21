package LIfeCycle;

public class User {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + "]";
	}
	public void start() {
		System.out.println("bean started");
	}
	public void stop() {
		System.out.println("bean destroyed");
	}
}
