package day10;
import javax.swing.*;
import java.awt.*;

public class MyBorderLayout extends JFrame {

	JButton[] bt=new JButton[5]; //배열로 저장
	JPanel p=new JPanel();
	
	public MyBorderLayout() {
		super("::MyBorderLayout::");
		add(p);
		p.setLayout(new BorderLayout());
		//add()할 때 동,서,남,북,중앙 지역을 지정해서 붙여야 한다
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton("b"+(i+1));
			//p.add(bt[i]); 지정하지않고 이렇게하면 마지막버튼이 화면에 가득찬다
		}
		p.add(bt[0],"North");
		p.add(bt[1],"South");
		p.add(bt[2],"West");
		p.add(bt[3],"East");
		p.add(bt[4],"Center");
		//영역을 지정하지않으면 "Center"에 붙는다. 디폴트가 중앙
		//남북은 높이 고정이고 가로폭이 가변적. 동서는 가로폭이 고정이고 높이가 가변적.
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창닫기 처리
	}

	public static void main(String[] args) {
		MyBorderLayout my=new MyBorderLayout();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
