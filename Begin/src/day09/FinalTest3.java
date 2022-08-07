package day09;
/*final + 변수 : 값 할당을 할 수 없게 함
 * 				public static final을 함께 사용한다.*/
class MyFinal{
	final public static int NONE=1;//상수
						int x=2;//변수
						
}
public class FinalTest3 {

	public static void main(String[] args) {
		//MyFinal의 x, NONE 변수 값을 출력하세요
		
		System.out.println(MyFinal.NONE);
		//[클래스명.변수명] static이 붙으면 앞에 클래스명을 붙여 바로 호출(출력)해야한다
		
		//[객체명.변수명] static이 아니면 객체생성해야 한다 
		MyFinal my=new MyFinal();
		System.out.println(my.x);
		
		//MyFinal.NONE=10; [x] final변수이므로 값을 변경할 수 없다
		System.out.println(MyFinal.NONE); //상수값이 출력
		
		my.x=10;
		System.out.println(my.x);

	}

}
