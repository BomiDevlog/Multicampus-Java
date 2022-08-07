package day09;
//직삼각형: (가로*세로)/2
//Shape추상 클래스를 상속받아 오류없게 메서드 재정의하기
public class Triangle extends Shape{

	@Override
	public void area(int x, int y) {
		int t=(x*y)/2;
		System.out.println("직삼각형 면적: "+t);
	}
}
