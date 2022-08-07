package day07multicampus;

import java.util.Scanner;

public class Teacher {
	
	int no;//교번
	String name;//이름
	String subject;//담당 과목
	String phone; //연락처
	
	//showInfo()
	
	//inputInfo()
	
	
	/* 학생 정보를 출력하는 메소드 */
	public void showInfo() {
		//System.out.println();//syso + 컨트롤키 + 스페이스바(출력문 단축키)
		System.out.println("---- 교사 정보 ----");
		System.out.println("교 번 : "+no);
		System.out.println("이 름 : "+name);
		System.out.println("과 목 : "+subject);
		System.out.println("연락처 : "+phone);

	}
	
	/*학생 정보를 입력받는 메소드*/
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("교번을 입력하십시오.=>");
		no=sc.nextInt();
		
		System.out.println("이름을 입력하십시오.=>");
		name=sc.next();
		
		System.out.println("과목을 입력하십시오.=>");
		subject=sc.next();
		
		System.out.println("연락처를 입력하십시오.=>");
		phone=sc.next();

}
	}
