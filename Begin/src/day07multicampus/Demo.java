package day07multicampus;

public class Demo {
	
	int x=10;//멤버변수(인스턴스변수)
	double pi=3.14;//멤버변수(인스턴스변수)
	static String STR="Hello";//클래스변수(static변수)
	
	//멤버 메소드(인스턴스 메소드)
	public void sub() {
		this.x=100;
		this.pi=5.78;
		
	}
	
	//클래스 메소드-static메소드
	public static void main(String[] args) {
		//this.x=200;//[x] static메소드 안에서는 this를 사용할 수 없다.
		//Demo객체를 생성해서 값을 바꿔줄 수 있다
		Demo dm=new Demo(); //생성자없는데 기본생성자 부름?!
		dm.x=200;//객체명.변수
		System.out.println("dm.x: "+dm.x); //여기서 바꿔준 x값
		
		dm.sub();
		System.out.println("dm.x: "+dm.x);//sub에서 호출한 x값
		System.out.println("dm.pi: "+dm.pi);//sub에서 호출한 pi값
		
		//STR값을 출력해보기
		System.out.println("Demo.STR: "+Demo.STR); //클래스변수는 [클래스명.변수명]
		System.out.println("Demo.STR: "+dm.STR); // [객체명.변수]가능하지만 권장되진않음 경고표시뜬다
	}
	/*OOP
	 * [1]추상화
	 * [2]캡슐화
	 * [3]다형성
	 * 	<1>오버로딩(Overloading)=>다중정의, 중복정의 (짐을 과적했다는 의미)
	 * 		1)생성자 오버로딩
	 * 		2)메소드 오버로딩
	 * 	<2>오버라이딩(Overriding)=>재정의(상속개념과 함께 사용)
	 * 		-메소드 재정의
	 * [4]상속성
	 */

}//
