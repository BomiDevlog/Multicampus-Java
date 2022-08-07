package day12;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/** 문서화주석-클래스앞에, 메소드 앞에 붙일 것.
 * 퐁씨 성을 가진 사람들이 이용할 수 있는 애플리케이션
 * 작성자: 홍길동
 * 작성일: 22-07-19
 * 버전: 1.1
 */
public class PongApp extends JFrame {
	
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta;
	
	JLabel lb;
	JTextField tfName;
	JButton btAdd, btSave;

	public PongApp() {
		super("::PongApp::");
		add(p,"Center");
		p.setLayout(new BorderLayout());
		
		p.add(pN,"North");
		pN.setBackground(Color.cyan);
		
		p.add(new JScrollPane(ta=new JTextArea()),"Center");
		
		lb=new JLabel("이  름 : ");
		tfName=new JTextField(20);
		btAdd=new JButton("등  록");
		btSave=new JButton("저  장");
		
		//리스너 부착
		MyEventHandler handler=new MyEventHandler();
		btAdd.addActionListener(handler);
		btSave.addActionListener(handler);
		tfName.addActionListener(handler);//입력 후 엔터치면 ActionEvent발생
		
		pN.add(lb);
		pN.add(tfName);
		pN.add(btAdd);
		pN.add(btSave);
		
		setSize(500,700);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//--
	/*API 문서 만들기: 비긴말고 프로젝트를 새로 만들기 프로젝트선택하고 Export 검색창에 javadoc 
	 * 이렇게 만들어진 doc를 제출!
	 */
	/** 버튼에 대한 이벤트를 처리하는 클래스 */
	class MyEventHandler implements ActionListener{//2개니까 이너클래스로 이벤트 처리
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();//이벤트가 발생한 객체의 주소값을 얻어옴
			if(obj==btAdd || obj==tfName) {//등록버튼을 누르거나 엔터를 치거나.
				//setTitle("add");
				//[1]tfName에 입력한 값을 얻어오기 : public String getText()
				String name=tfName.getText();
				//System.out.println(name); 콘솔창 확인
				name=name.trim();//앞뒤 공백 제거해서 재할당. 공백이 성이 되면 안되니까
				try {
					//[2]입력한 값의 '성'을 추출하여 '퐁'씨면 "xxx님 환영합니다"를 타이틀에 추출하기
					//[3]tfName에서 얻어온 값을 ta에 붙이기 : public void setText(String t)
					char fname=name.charAt(0);
					if(fname=='퐁') {
						setTitle(name+"님 환영합니다!");
						//ta.setText(name); //ta에 이름이 뜨지만 쌓이지않고 자꾸 갱신되서 다른 기능을 쓸 것
						ta.append(name+"\n");//줄바꿈안하면 옆으로 붙어서 이어진다.
					}else if(fname=='콩') {
						//사용자 정의 예외 객체를 발생시킨다 ==>throw new 예외객체(); *사용자 정의 예외 클래스NotSupportedNameException을 이용해보기
						//예외가 발생이 되면 해당 예외를try~catch해야한다.
						throw new NotSupportedNameException("콩씨는 절대로 등록할 수 없음!!");
					}else {
						throw new NotSupportedNameException("퐁씨가 아닌 성씨분들은 이용에 제한이 있습니다");						
					}
				}catch(NotSupportedNameException ex) {
					String msg=ex.getMessage();
					setTitle(msg);
					//메시지박스 띄우기 showInputDialLog 입력박스
					JOptionPane.showMessageDialog(p,msg);//패널p에 메시지박스를 띄우겠다는 의미
					
				}finally {
					tfName.setText("");// 이름칸이 지워짐 근데 포커스가 사라짐
					tfName.requestFocus();//입력포커스 주기
				}
				//아무것도 안치니까 StringIndexOutOfBoundsException나온당
				//엔터치면 등록되는 것도 액션이벤트

			}else if(obj==btSave) {
				//setTitle("save");
				String content=ta.getText();
				if(content.trim().isEmpty()) {//내용이 없다면(공백제거 후 완전히 내용이 없는 것이면)
					//JOptionPane.showInputDialog(e)//입력창나옴 검색할때
					JOptionPane.showMessageDialog(p, "저장할 내용이 없어요");
					return;
				}
				//내용이 있다면
				String fileName="C:\\Users\\PC\\git\\firstGit\\Begin\\PongList.txt";
				try {
				FileWriter fw=new FileWriter(fileName); //FileNotFoundExceiption생긴다
				fw.write(content);
				fw.flush();
				fw.close();
				setTitle(fileName+"에 저장 완료!");
				}catch(IOException ex) {
					setTitle("파일 쓰기 중 에러: "+ex.getMessage());
				}
			}
			
		}//기본틀 잡고 리스너 붙이고 그다음에 내용 구성
	}///

	public static void main(String[] args) {
		new PongApp();

	}

}
