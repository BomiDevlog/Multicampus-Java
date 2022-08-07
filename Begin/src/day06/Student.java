package day06;

public class Student {
	
	int classNum;
	String name;
	String phoneNum;
	
	public void studentInfo() {
		System.out.println("---Student정보---");
		System.out.println("이름: "+name);
		System.out.println("학번: "+classNum);
		System.out.println("연락처: "+phoneNum);
	}
	
	public String studentGrade(int score) { 
		String str=name+"의 학점은 "+score+"점입니다";
		return str;
		
		
	}
	

}

/*박지혜
 * public class Student {
	int numb;
	String name;
	int grade;//
	int smartph;
	
	public void showInfo() {
		System.out.println("--------학생 정보---------");
		System.out.println("학생 이름: "+name);
		System.out.println("학년: "+grade);
		System.out.println("연락처: "+smartph);
	}

 *정서현
 * public class Student {
	int no;
	String name;
	String major;
	int phone;

	public void StudentInfo() {
		System.out.println("---- 학생정보 ----");
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+no);
		System.out.println("전공 : "+major);
		System.out.println("연락처 : "+phone);
		System.out.println("");

	}
	
	public void status() {
		System.out.println(name+" 학생은 공부 중입니다.");
	}
	
}
강시안
public class Student {
	int num;
	String name;
	String department;
	
	public void showInfo2() {
		System.out.println("-----Student정보-----");
		System.out.println("학번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("학과 : "+department);
	}
	public String existAt(int inform) {
		String str=name+"학생의 학번은 "+num+", 학과는"+department+"입니다.";
		return str;
	}
	
	public void study(String type, int time) {
		switch(type) {
		case "전공필수":
			System.out.println("전공필수: "+time+"시간");
			break;
		default:
			System.out.println("교양필수: "+time+"시간");
		}
	}
}


 */
