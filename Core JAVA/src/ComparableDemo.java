import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mobile implements Comparable<Mobile>{
	int price;
	int ram;
	String name;
	public Mobile(int price,int ram,String name) {
		this.price=price;
		this.ram=ram;
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public int getRam() {
		return ram;
	}
	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Mobile o) {
		if(this.getPrice()>o.getPrice()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	@Override
	public String toString() {
		return "price : "+price+" ram : "+ram+" name : "+name;
	}
}
public class ComparableDemo {
	public static void main(String[] args) {
		Mobile m1 = new Mobile(10000, 4, "MI");
		Mobile m2 = new Mobile(30000, 6, "Apple");
		Mobile m3 = new Mobile(20000, 2, "Samsung");
		List<Mobile> mlist = new ArrayList<Mobile>();
		mlist.add(m1);
		mlist.add(m2);
		mlist.add(m3);
		
		Collections.sort(mlist);
		for(Mobile m :mlist) {
			System.out.println(m);
		}
		
	}
}
