import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutpurInputStream {
	public static void main(String[] args) throws IOException {
		String s = "hello this is file handling";
		FileOutputStream fos = new FileOutputStream("t1.txt");
		byte[] b = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("file written successfully");
		
		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
