package day09;
//사각형
public class Rectangle extends Shape{
	
	@Override
	public void area(int x, int y) {
	//오버라이드규칙 메소드이름 매개변수를 부모와 동일하게. 반환타입 void도 유지. 접근지정자 같거나 넓게 public
		int k=x*y;//면적
		System.out.println("사각형 면적: "+k);

	}
}
