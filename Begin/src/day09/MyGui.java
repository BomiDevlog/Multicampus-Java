package day09;
import javax.swing.*; 
import java.awt.*;
/*CLI : Command Line Interface 도스 콘솔에서 실행되는 프로그램
 *GUI : Graphic User Interface 그래픽 환경을 갖춘 프로그램 
 *JFrame : Window 계열의 컨테이너
 *		   반드시 사이즈를 정해주고 setVisible(true)를 주어야 화면에 보여짐
 *JPanel : Panel계열의 컨테이너 
 **/

public class MyGui extends JFrame {
	JPanel p; //멤버변수 선언
	JButton bt1,bt2, bt3;//Component (부품,구성요소) 패널에 단추를 붙일 것.
	Icon icon1, icon2,icon3,icon4,icon5; //이미지파일도 변수로 선언
	
	JTextField tf1, tf2;
	JTextArea ta1, ta2;
	
	public MyGui(){ //기본생성자 구현
		super("::MyGui Program v1.1::"); //타이틀에 문자열이 올라간다
		//super는 부모클래스 JFrame에서 불러온 기능
		
		p=new JPanel();
		add(p);//JFrame의 중앙에 판넬이 붙는다
		p.setBackground(Color.yellow); //색깔을 넣어준다
		
		icon1=new ImageIcon("icon1.png"); //파일명도 대소문자 동일하게 해야 에러안난다
		icon2=new ImageIcon("icon2.png");
		icon3=new ImageIcon("icon3.png");
		icon4=new ImageIcon("icon4.png");
		icon5=new ImageIcon("icon5.png");
		
		bt1=new JButton(icon1);//()하면 빈칸이, ("Hello")하면 글자버튼이 나온다
		
		bt2=new JButton("Home", icon3);
		bt2.setHorizontalTextPosition(JButton.CENTER);//텍스트 위치를 수평의 중앙에 위치
		bt2.setVerticalTextPosition(JButton.TOP);// 수직의 위에 위치
		
		bt3=new JButton("Login", icon2);
		bt3.setHorizontalTextPosition(JButton.CENTER);//텍스트 위치를 수평의 중앙에 위치
		bt3.setVerticalTextPosition(JButton.BOTTOM);// 수직의 아래에 위치
		bt3.setPressedIcon(icon4); //누르면 그림이 바뀜
		bt3.setRolloverIcon(icon5);//마우스를 가져다대면 그림이 바뀜
		
		p.add(bt1); //붙여주어야 창에 구현된다
		p.add(bt2);
		p.add(bt3);
		
		//한줄짜리 텍스트박스. 기본은 흰바탕에 검은색테두리에 글이 올라감 
		
		tf1=new JTextField(20); //빈칸에 입력할수 있는 칸이 있다 int값이 폭이 된다
		tf1.setBackground(Color.pink);//배경색
		tf2=new JTextField("검색창에 검색하세요!",30); //흰바탕에 검은색테두리에 글이 올라감. 글을 지우고 새로 쓸 수 있다
		tf2.setBackground(Color.blue);
		tf2.setForeground(Color.white);//글자색
		
		p.add(tf1);
		p.add(tf2);
		
		//멀티라인 텍스트박스. rows행의 수 columns 열의 수
		ta1=new JTextArea("안녕하세요. 반갑습니다~~~",5,20); //흰바탕에 글이 올라감
		ta2=new JTextArea(10,30); 
		
		//JTextArea는 JScrollPane에 붙여야 스크롤바가 붙는다
		JScrollPane sp=new JScrollPane(ta1); 
		p.add(sp);
		
		p.add(new JScrollPane(ta2)); //채팅을 구현할 때 종종 쓰임
	
		
		//this. 만 쳐도 상속받은 수많은 기능이 보여진다.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창닫기 처리-프로세스 종료
		//창을 x누르면 콘솔창의 붉은색이 회색으로 꺼진다.
		
	}

	public static void main(String[] args) {
		MyGui my=new MyGui();//JFrame
		my.setSize(500,500);//폭,넓이를 사이즈 정함
		my.setVisible(true);//눈에 보이게 구현 /콘솔을 누르면 어떤 창이 뜬다!
		
		//+> 패ㅏ키지 이름 바꿀때 Refactor Rename하거나 F2

		
	}

}
