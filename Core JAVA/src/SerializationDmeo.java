import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name;
	double salary;
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class SerializationDmeo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e = new Employee(1, "java", 10000);
		FileOutputStream fos = new FileOutputStream("serialize.txt");
		ObjectOutputStream oos  =new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.flush();
		oos.close();
		System.out.println("object written successfully");
		
		FileInputStream fis = new FileInputStream("serialize.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e1 = (Employee)ois.readObject();
		System.out.println(e1);
	}
}
