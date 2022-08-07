package Tesk;
import java.awt.*;
import javax.swing.*;
public class MyApp extends JFrame {
	
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta=new JTextArea("🐇¸.•*¨*•¸¸.𝒊𝒏𝒔𝒆𝒓𝒕 𝒚𝒐𝒖𝒓 𝒎𝒆𝒔𝒔𝒂𝒈𝒆🐇.•*¨*•¸¸.",18,26);
	JButton b1,b2,b3,b4;
	
	
	public MyApp(){
		super("˗ˋˏ✄—MyApp——");
		add(p);
		p.add(pN);
		
		
		p.setBackground(Color.black);
		pN.setBackground(Color.black);
		
		b1=new JButton("Login");
		b2=new JButton("Join ");
		b3=new JButton("Home ");
		b4=new JButton("Exit  ");
	
		pN.add(b1);
		pN.add(b2);
		pN.add(b3);
		pN.add(b4);
		
		
		p.add(ta,BorderLayout.CENTER);
		JScrollPane sp=new JScrollPane(ta);
		ta.setBackground(Color.black);
		ta.setForeground(Color.pink);
		
		p.add(sp);
		

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		MyApp my=new MyApp();
		my.setSize(285,400);
		my.setVisible(true);

	}

}
