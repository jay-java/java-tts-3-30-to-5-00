import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo {
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	public SwingDemo() {
		JFrame fr = new JFrame("MyApp");
		fr.setSize(700, 500);
		fr.setVisible(true);
		fr.setLayout(null);
		
		l1 = new JLabel("Id : ");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(200, 100, 120, 20);
		fr.add(t1);
		
		b1 = new JButton("insert");
		b1.setBounds(100, 350, 120, 20);
		fr.add(b1);
	}
	public static void main(String[] args) {
		new SwingDemo();
	}
}
