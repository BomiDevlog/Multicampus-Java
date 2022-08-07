package day11;
import day10.Student;

/*
 * 선생님!!  예를 들어 클래스1에 "학생"이라는 생성자가 있고, 
 * 그안에 학번이란 변수가 있는데 //  
 * 이걸 클래스2에서 "학생1" 생성자로 새로 만들어서 학번값을 넣어줬을 경우/
 * / 클래스3에서 이 "학생1"의 학번값을 가져올수있나요??? 
 * 어제 복습하다가 헷갈려서용 ㅠㅠㅠ
 * 
 * 클래스2에서 생성한 학생1 객체를 어디에서 생성했느냐에 따라 달라요. 
 * 학생1객체가 전역변수면 클래스3에서 가져올 수 있고요
 * 메서드 안에서 생성한 지역변수라면 클래스3에서 가져올 수 없어요

 */


 public class Test{
	 
	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println(t.s1.getName());
		//System.out.println(t.s2.getName()); [x]지역(local)이라 해당 메소드에서만 출력가능
	}
 }
	
	 class Test2 {
			Student s1=new Student(1,"김성실");//멤버(member)
			
			void sub() {
				Student s2=new Student(2, "이똘똘");//지역(local)
				System.out.println(s2.getName());
			}

		}
	

