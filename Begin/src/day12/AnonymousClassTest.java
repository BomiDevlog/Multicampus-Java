package day12;

class MyObject extends Object{ //extends Object 는 생략해도 묵시적으로 상속받음
	@Override
	public String toString() {
		return "I am My Object";
	}
}//

public class AnonymousClassTest {

	
	public static void main(String[] args) {
		
		Object o1=new Object();
		Object o2=new Object() { //이름없는 로컬 이너클레스, 객체 생성문 뒤에 {}를 붙혀 만든다.

			//{} 이것이 이름없는 로컬 이너 클래스(AnonymousClass)- 클래스를 별도로 만들지않고 간단하게 처리가능한 장점
			@Override
			public String toString() {
				return "Anonymous Object";
			}
		}; //<-세미콜론 있어야함
		//<-- ㄴ이름없는 클래스 , 일회용으로 클래스를 상속받는다.
		

		System.out.println(o1);
		System.out.println(o1.toString()); //해시코드 출력
		
		Object o3=new MyObject();//클래스를 부름
		System.out.println(o3); //재정의하여 오버라이드한 메서드 출력/I am My Object
		System.out.println(o3.toString());
		
		System.out.println(o2);//재정의하여 오버라이드한 메서드 출력 /Anonymous Object
		System.out.println(o2.toString());
	

	}

}
