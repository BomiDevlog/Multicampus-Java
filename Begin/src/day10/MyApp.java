package day10;
import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame {
	
	
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JButton b1,b2,b3,b4;
	JButton[] bt=new JButton[1];
	JTextArea ta1;

	public MyApp()  {
		super("::MyApp::");
		/////////////////////////
		add(p);
		p.setBackground(Color.blue); 
		
		b1=new JButton(" Login ");
		b2=new JButton(" Join  ");
		b3=new JButton(" Home  ");
		b4=new JButton(" Exit  ");//띄어쓰기하면 패널폭이 넓어짐 탭키는 크기 그대로임
		p.add(b1);// NullPointerException- b1생성 전에 붙이기부터 하니까 붙일 것이 없다고 오류
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		///왜 안나오지?
		/*
		add(pN);
		pN.setLayout(new BorderLayout());
		pN.setBackground(Color.white); 
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton("b"+(i+1));
		}
		pN.add(bt[0],"North");
		*/
		
		ta1=new JTextArea(10,30); 
		JScrollPane sp=new JScrollPane(ta1); 
		p.add(sp);
		
	
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyApp my=new MyApp();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
