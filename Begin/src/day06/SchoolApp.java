package day06;
/*학사관리프로그램 (중요! 나중에 시험!)
 * -객체 추출
 * 		학생, 교사(강사), 행정직원...
 * 		-> class 로 구성하기
 * 		학생=>Student
 * 			속성: 학번, 이름, 학급(학과), 연락처,...
 * 			기능: (학생)정보를 보여주다, 공부하다,...
 * 		교사=>Teacher
 * 			속성:
 * 			기능
 * 		직원=>Staff
 * 			속성
 * 			기능
 */

public class SchoolApp {

	public static void main(String[] args) {
		//학생, 교사, 직원 객체 각각 1개씩 생성해서
		//속성값주고 메소드를 호출해보기!
		
	Student s1=new Student();
	
	s1.name="홍길동";
	s1.phoneNum="01012345678";
	s1.classNum=1234555;
	s1.studentInfo();
	
	String sg1=s1.studentGrade(92); 
	System.out.println(sg1);
	
	Teacher t1=new Teacher();
	
	t1.name="김영란";
	t1.teacherInfo();
	
	
	/*
	String sg1=s1.studentGrade(92); 
	System.out.println(sg1);
	*/

	}//

}//
