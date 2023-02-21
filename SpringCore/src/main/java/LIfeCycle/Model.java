package LIfeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Model implements InitializingBean,DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("interface started");
	}

	public void destroy() throws Exception {
		System.out.println("interface destroyed");
	}
	
}
