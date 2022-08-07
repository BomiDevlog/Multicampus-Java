package day07multicampus;
import java.util.*;
/*학사관리 프로그램에서 사용하는 학생 클래스*/
public class Student {
	
	int no;
	String name;
	String major;
	String phone;
	/* 학생 정보를 출력하는 메소드 */
	public void showInfo() {
		//System.out.println();//syso + 컨트롤키 + 스페이스바(출력문 단축키)
		//System.out.println("---- 학생 정보 ----");
		System.out.println("학 번 : "+no);
		System.out.println("이 름 : "+name);
		System.out.println("전 공 : "+major);
		System.out.println("연락처 : "+phone);

	}
	
	/*학생 정보를 입력받는 메소드*/
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("학번을 입력하십시오.=>");
		no=sc.nextInt();
		
		System.out.println("이름을 입력하십시오.=>");
		name=sc.next();
		
		System.out.println("전공을 입력하십시오.=>");
		major=sc.next();
		
		System.out.println("연락처를 입력하십시오.=>");
		phone=sc.next();
		
	}//
	

}//
