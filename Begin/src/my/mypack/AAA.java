package my.mypack; 
//패키지선언문: 제일 첫 문장으로 기술해야 한다
//패키지명과 디렉토리명은 대소문자까지 같아야 한다

public class AAA { //public class에 main메소드()를 주는게 일반적
	//public 클래스: 어디서든 접근 가능한 지정자
	
	
	
	public static void main(String [] args) {
		BBB b=new BBB();
		b.funcB();//호출하니 출력됨//같은 패키지라서 잘 호출됨
		
		///funcA호출해보기. static이 없으니 객체생성해서 호출한다
		AAA a=new AAA();
		a.funcA();
	}
	
	public void funcA() {
		System.out.println("AAA");
	}

}
class BBB { //생략형 지정자(default지정자, package지정자): 같은 지정자 내에서만 사용 가능
	
	public void funcB() {
		System.out.println("BBB");//이것만 했을땐 안나옴
	}
	
}
