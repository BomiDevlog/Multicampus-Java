package day10;
//MyGui이어지는 내용/ 레이아웃 3가지 배움
import javax.swing.*;
import java.awt.*;
/*LayoutManager
 * -[1] FlowLayout: 가장 기본적인 설정이다. 
 * -[2] BorderLayout : 동, 서, 남, 북, 중앙 영역을 지정해서 배치
 * -[3] GridLayout : 행과 열의 형태로 균등하게 배치
 */
/*java.awt.*; =>FlowLayout API확인
 * FlowLayout() 중앙정렬
Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
FlowLayout(int align) 
Constructs a new FlowLayout with the specified alignment and a default 5-unit horizontal and vertical gap.
FlowLayout(int align, int hgap, int vgap)
Creates a new flow layout manager with the indicated alignment and the indicated horizontal and vertical gaps.
 * 
 * static int	LEFT
This value indicates that each row of components should be left-justified.
static int	RIGHT
This value indicates that each row of components should be right-justified.
 */

public class MyFlowLayout extends JFrame { //FlowLayout-흘러내려감 창을 줄이니 패널이 세로로 정렬됨
	JButton b1,b2,b3,b4;
	JPanel p; // JPanel은 중앙에 위치하는 성질이 있음

	public MyFlowLayout() {
		super("::MyFlowLayout::"); //타이틀 등록
		p=new JPanel();
		this.add(p);
		p.setBackground(Color.white); //패널배경색: 회색에서 흰색으로 바뀌었다
		//p.setLayout(new BorderLayout()); //맨 마지막 버튼 하나만 전체 가득 보인다
		//p.setLayout(new GridLayout(2,2));//화면 가득 2행2열로 배치
		p.setLayout(new FlowLayout(FlowLayout.LEFT)); //왼쪽정렬 //오른쪽정렬은 RIGHT
		
		b1=new JButton("     b1     ");
		b2=new JButton(" b2 ");
		b3=new JButton("     b3     ");
		b4=new JButton(" b4 ");//띄어쓰기하면 패널폭이 넓어짐 탭키는 크기 그대로임
		p.add(b1);// NullPointerException- b1생성 전에 붙이기부터 하니까 붙일 것이 없다고 오류
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		//창닫기 처리- 생성자 끝부분에서 하는게 좋음
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFlowLayout my=new MyFlowLayout();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
