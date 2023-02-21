package collectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Data {
	private int id;
	private String name;
	private List mono;
	private Set datas;
	private Map bank;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getMono() {
		return mono;
	}
	public void setMono(List mono) {
		this.mono = mono;
	}
	public Set getDatas() {
		return datas;
	}
	public void setDatas(Set datas) {
		this.datas = datas;
	}
	public Map getBank() {
		return bank;
	}
	public void setBank(Map bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", mono=" + mono + ", datas=" + datas + ", bank=" + bank + "]";
	}
	
}
