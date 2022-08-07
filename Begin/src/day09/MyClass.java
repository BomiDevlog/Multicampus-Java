package day09;
/*MyInter를 상속받아서 에러나지 않게 처리해보세요
 * 인터페이스는 implements로 상속받는다
 * 
 * YourInter도 상속받아 에러나지않게 처리해보세요
 */

public class MyClass implements MyInter, YourInter { //다중상속가능
	
	@Override
	public void demo() { 
		/*추상메소드에서는 생략형이 아니라 자동으로 public이었다
		그래서 생략형 void로 하면 접근지정자의 범위가 줄어 오류난다 
		public을 붙여주어야 제대로 오버라이딩*/
		System.out.println("MyClass's demo()###");
	}
	public int inter1() {
		return 100;
	}
	public void inter2(String s) {//{} 이런식으로필요없어도 구현해야 오류가 없다
		System.out.println(s.toUpperCase());
	}
	
	public static void main(String[] args) { //main 하고 컨트롤+스페이스바하면 메인메소드 구성됨
		//MyInter mi=new MyInter(); [x] 추상메소드는 new로 객세 생성이 안됨
		//인터페이스는 타입 선언은 할 수 있으나 new에서 객체 생성은 할 수 없다.
		MyInter mi=new MyClass();
		YourInter yi=new MyClass();
		
		//demo()
		mi.demo();
		
		//inter1() :2가지 방식
		//mi.inter();[x]
		int num=yi.inter1();
		System.out.println("num: "+num);
		
		System.out.println(((MyClass)mi).inter1());
		
		
		//inter2(): 2가지 방식
		((MyClass)mi).inter2("안녕");
		
		yi.inter2("Good afernoon");
		
		//PI출력해보기
		System.out.println(YourInter.PI); //static이니 클래스명.변수
		
		System.out.println(MyClass.PI);
		
		//MyClass.PI=5.12;[x] final변수는 값을 변경 불가
		
		System.out.println(yi.PI);//static방식은 아니지만 값은 나옴 경고문나옴
		
		
		
		
	}
}
