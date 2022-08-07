package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*이벤트 처리 (PPT03 , p.26)
 * [1] 이벤트 소스 (Event Source) J붙은 것들   		|예시로 J Button이라면 . 체크박스라면
 * [2] 이벤트 (Event) 					 		| 			액션이벤트	  아이템이벤트
 * [3] 이벤트 처리자 (Event Handler) 로직.이너클래스로	|
 * 
 */
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 * 이거 다해야함
 */

public class MyGui extends JFrame {
	JPanel p, pN; //기본으로 붙일 p 북쪽에 붙일 pN
	JTextArea ta;
	JButton bR, bG, bB, bExit;
//멤버변수로 선언
	public MyGui() {
		super("::MyGui");
		p=new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		add(p,"Center");
		
		p.setLayout(new BorderLayout());
		pN=new JPanel();//FlowLayout
		pN.setBackground(new Color(180,50,100));//red,green,blue값을 직접 지정. 자줏빛 색을 조합으로 만듬
		p.add(pN,"North");
		
		ta=new JTextArea("안녕");
		p.add(new JScrollPane(ta), "Center"); //찾아보기! 가로값이 고정되어 다음줄로 넘어가는건 뭘까??
		
		bR=new JButton("Red");
		bG=new JButton("Green");
		bB=new JButton("Blue"); 
		bExit=new JButton("Exit");
		
		pN.add(bR);// FlowLayout은 방위지정없이 붙이면 된다
		pN.add(bG);
		pN.add(bB);
		pN.add(bExit);
		
		/*생성자 안에서 이벤트소스와 이벤트핸들러를 연결해줘야 함
		 *  이벤트소스.addXXXListener(이벤트핸들러객체) */
		MyEventHandler handler=new MyEventHandler();
		//MyGui.MyEventHandler handler2=this.new MyEventHandler(); 요로케 해도 되는데 위처럼 간단하게 할 수 있다
		bR.addActionListener(handler); //addActionListener는 마치 현관문조명의 센서를 붙이듯이. 처리해줄 객체를 매개변수로 넣음
		bG.addActionListener(handler);
		bB.addActionListener(handler);
		bExit.addActionListener(handler);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//생성자-------------
	
	//이벤트 핸들러들은 xxxListener 인터페이스 상속받아야함. 이너클래스로 주로 작성한다.
	//void	actionPerformed(ActionEvent e) 자동으로 public붙는다
	class MyEventHandler implements ActionListener{
		
		@Override //@O하고 컨트롤 스페이스바 누르면 자동으로 나옴
		public void	actionPerformed(ActionEvent e) {
			//이벤트가 발생된 객체의 참조값을 얻어보자.
			Object obj=e.getSource();//이벤트소스에 대한 정보를 Object 유형으로 반환
			if(obj==bR) { //Object유형이라서 주소값을 비교해서 결과처리
				ta.setForeground(Color.red);
			}else if(obj==bG) {
				ta.setForeground(Color.green);
			}else if(obj==bB) {
				ta.setForeground(Color.blue);
			}else if(obj==bExit) {
				System.exit(0);//시스템 종료 코드
			}
			
			
			/*ta.setBackground(Color.red);
			ta.setForeground(Color.red);//이벤트 처리 코드
		클릭하는 이벤트를 발생시키면 액션이 발생해서  ta가 레드로 바뀌는 것!*/
			
		}
	}
	
	
	public static void main(String[] args) {
		MyGui my=new MyGui();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
