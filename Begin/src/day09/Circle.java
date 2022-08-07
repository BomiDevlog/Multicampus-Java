package day09;
//원
public abstract class Circle extends Shape {

	/*원은 반지름으로 면적구하기때문에 
	 * 변수 2개인 abstrac 상속이 아니라 클래스를 abstract로 만든다
	 * public void area(int a, int b) {} [x]
	 */
	
	public static final double PI =3.14;//상수 (public static final을 같이 붙인다)
}
