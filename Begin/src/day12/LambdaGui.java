package day12;
//이벤트를 람다식으로
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LambdaGui extends JFrame {
	
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JLabel lb;
	JButton bt1, bt2;

	public LambdaGui() {
		super("::LambdaGui::");
		
		add(p,"Center");
		p.setLayout(new BorderLayout());//동서남북 붙일 수 있다
		
		//lb=new JLabel("Welcome to MyApp"); //글은 기본이 왼쪽정렬이라서 중앙인데도 상당히 좌측에 위치
		lb=new JLabel(new ImageIcon("myicon.png")); //정중앙에 사진이 위치
		lb.setText("Welcome to MyApp");
		lb.setHorizontalTextPosition(JLabel.CENTER);
		lb.setVerticalTextPosition(JLabel.TOP);
		lb.setFont(new Font("sans-serif",Font.BOLD,24));//글자체로 (서체, 스타일 , 크기)

		//붙이기 전에 여기서 [1][2]문제 풀었더니 NullPointException나옴  붙이고 나서 해야함
	
		p.add(pN,"North");
		p.add(lb,"Center"); 
		
		bt1=new JButton("Blue");
		bt2=new JButton("Pink");
		pN.add(bt1);
		pN.add(bt2);
		
				
		
		//[1] bt1 클릭 시 lb의 글자색을 파랑으로 =>Anonymous class
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb.setForeground(Color.blue);
			}
		});
				
		//bt1.addActionListener(new ActionListener(){});기본틀 잡고 중괄호 사이에 추상메서드 작성해준다.
				
		//추상메서드 1개면 람다식 할 수 있다
		//[2] bt2 핑크색 => Lambda식 이용해서 이벤트 처리하기
		
		bt2.addActionListener(e ->{lb.setForeground(Color.pink);});  //중괄호도 생략가능
		
		//bt2.addActionListener(); 기본으로해서 함수형으로 만듬
		
		
		this.setSize(500,700); //생성자에서 사이즈할 땐 this로 접근 (가로 폭, 세로 높이)
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new LambdaGui(); //생성자 호출

	}

}
