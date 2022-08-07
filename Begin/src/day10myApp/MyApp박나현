package day10;
import javax.swing.*;
import java.awt.*;


public class MyApp extends JFrame{
	JButton b1,b2,b3,b4;
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta1;
	public MyApp() {
		super("::MyApp::");
		add(p);
		add(pN,"North");
		p.setLayout(new BorderLayout());
		p.setBackground(Color.blue);
		pN.setBackground(Color.red);
		
		b1=new JButton("Login");
		b2=new JButton("Join");
		b3=new JButton("Home");
		b4=new JButton("Exit");
		
		pN.add(b1);
		pN.add(b2);
		pN.add(b3);
		pN.add(b4);
		
		ta1=new JTextArea();
		JScrollPane sp=new JScrollPane(ta1);
		p.add(sp,"Center");
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyApp my=new MyApp();
		my.setSize(500,500);
		my.setVisible(true);
	}

}
