package my.yourpack;

//import my.mypack.AAA; [o]
import my.mypack.*;
//서로 다른 패키지에 있으면 import문을 사용해서 호출해야한다. import안하면 오류!
//import my.mypack.BBB;[x] =>접근을 못함
public class FFF {

	public static void main(String[] args) {
		//*AAA의 funcA()메소드를 호출해보세요
		
		AAA x=new AAA();
		x.funcA();
		//public 클래스라서 어디서든 접근 가능
		
		//* BBB의 funcB()메소드를 호출해보세요
		
		//BBB y=new BBB();
		//y.funcB();
		//생략형 접근지정자를 가진 클래스라서 같은 패키지에서만 접근 가능
		
	} //Edit plus 수업 참고하세용~

}
