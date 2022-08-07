package day12;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

class MyJPanel extends JPanel{
	
	//컨테이너의 바깥 여백을 주는 메서드를 오버라이딩하자
	@Override
	public Insets getInsets () { //Insets 객체를 반환해야함
		Insets in=new  Insets(10,10,10,10);//top,left,bottom.right 반시계방항 //컨트롤 스페이스바 누르면 생성자가 나온다
		return in;
	}
	
}//

public class SearchEngine extends JFrame{
	JPanel p=new MyJPanel();//FlowLayout=>GridLayout변경 //My를 써주어야 위에서 만든 간격이 적용된다!!
	JButton[] bt=new JButton[4];//버튼을 저장할 공간 4개를 확보. 아직 저장하지않았으니 index 0123에는 null값.
	String [] str= {"Naver","Google","Daum","Yahoo"}; //배열에 들어갈 값

	public SearchEngine() {
		super("::SearchEngine::");
		add(p,"Center");
		
		//Grid Layout(int row, int col, int hgap, int vgap) :행 열 수직간격 수평간격
		p.setLayout(new GridLayout(2,2,10,10));//2행2열 그리드레이아웃 
		
		for(int i=0; i<bt.length;i++) {
			bt[i]=new JButton(str[i]);
			p.add(bt[i]);
		}
		
		//버튼에 대한 이벤트 처리를 anonymous class로 해보자
		bt[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[0].setBackground(Color.green);
				setTitle(str[0]+"버튼을 눌렀군요"); //타이틀 변경
			}
		});
		//ActionListener는 인터페이스라서 new할 수 없고 오류나는데, {}해서 이름없는 로컬이너클래스를 활용함.
		/*day11의 MyGui경우 전체적인 이벤트처리를 경우에 따라 진행
		 * 이번 경우는 다소 비효율적이지만, 개별적이고 특수한 전용 이벤트 처리를 해주는 효과가 있다. 		 */
		
		//bt[1] =>  구글, 배경색 노란색으로 변경
		bt[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[1].setBackground(Color.yellow);
				setTitle(str[1]+"버튼을 눌렀군요");
			}
		});
		
		//두가지 방식으로 개별적인 이벤트처리
		bt[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();//이벤트가 발생된 객체
				String cmd=e.getActionCommand();//이벤트소스의 라벨문자열을 반환한다.
				setTitle(cmd);//Daum이라고 바뀜
				((JButton)obj).setBackground(Color.pink); //부모타입 Object로는 setBackground를 못쓰니까  bt의 자료유형인 JButton으로 형변환
			}
		});
		bt[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();
				String cmd=e.getActionCommand();
				setTitle(cmd);
				((JButton)obj).setBackground(Color.magenta);			}
		});
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SearchEngine my=new SearchEngine();
		my.setSize(500,500);
		my.setVisible(true);
		

	}

}
