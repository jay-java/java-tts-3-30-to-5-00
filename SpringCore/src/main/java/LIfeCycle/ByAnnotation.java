package LIfeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ByAnnotation {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ByAnnotation [id=" + id + "]";
	}
	@PostConstruct
	public void startingMethod() {
		System.out.println("annotation stared");
	}
	@PreDestroy
	public void stopMethod() {
		System.out.println("annotaion stopped");
	}
}
