package day09;

public class SubCircle extends Circle {
//circle에서 area 재정의안하고 circle자신을 abstract로 만들어서 에러. 
// 결국 어디선가 재정의 해야한다.
	
	public void area (int x, int y) {}
	//필요 없어도, 빈 블럭으로라도 재정의해야한다!(오버라이딩)
	public void area (int r) { //매개변수 1개로 오버로드
		System.out.println("원의 면적: "+(Circle.PI*r*r)); //3.14(파이) x 반지름제곱
	}
}
