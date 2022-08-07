package day06;

//인사 관리 프로그램
public class ERP_App {

	public static void main(String[] args) {
		//객체 생성v//Object(현실 세계에 있는 객체)=> 메모리에 올라간 객체(Object)
		Employee e1=new Employee();//객체(object, instance)
		e1.no=1;//객체명.변수로 이름정해서 값을 넣어줌
		e1.name="김사원";
		e1.salary=500;
		e1.dept="기획부";
		e1.indate=new java.util.Date();
		
		e1.work("기획");
		
		int year_sal=e1.receive_sal();
		System.out.println("연봉: "+year_sal);
		
		System.out.println(e1.indate);
	

	}//

}//
