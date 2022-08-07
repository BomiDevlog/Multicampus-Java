package day10;
import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame{
	JButton[] bt = new JButton[4];
	JPanel p = new JPanel();
	JPanel pN = new JPanel();
	JTextArea ta;
	public MyApp() {
		super("::MyApp::");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);
		p.setLayout(new BorderLayout());
		p.setBackground(Color.blue);
	
		for(int i =0; i<bt.length; i++) {
			bt[i] = new JButton("b"+(i+1));
		}
		pN.add(bt[0]);
		pN.add(bt[1]);
		pN.add(bt[2]);
		pN.add(bt[3]);
		pN.setBackground(Color.red);

		p.add(pN, "North");
		
		ta = new JTextArea("ta1", 5, 50);
		ta.setBackground(Color.cyan);
		
		JScrollPane sp = new JScrollPane(ta);
		p.add(sp);
		
	}

	public static void main(String[] args) {
		MyApp my = new MyApp();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}
