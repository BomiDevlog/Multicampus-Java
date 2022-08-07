package day06;

public class Teacher {
	
	String name;
	
	
	public void teacherInfo() {
		System.out.println("---Teacher정보---");
		System.out.println("이름: "+name);
		
		
	}
	
	public String teacherSubject(String sub) { 
		String str=name+"의 담당 교과는 "+sub+"입니다";
		return str;
	

}
}