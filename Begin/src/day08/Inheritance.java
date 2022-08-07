package day08;
/*상속성(Inheritance)
 * 부모 클래스
 * 자식 클래스 extends 부모클래스
 * =>부모클래스가 가진 멤버변수, 메소드를 자식클래스에서 그대로 물려받아 쓸 수 있다.//유사한 기능을 가짐
 * 상속은 "is a" 관계가 성립해야 한다.
 * 자바는 1개의 클래스만 상속받을 수 있다.(단일 상속)
 * cf. C++(다중상속 가능)
 */
/*Human (has a 관계를 분석한다)
 * -name (o)
 * -height (o)
 *-power(x)// 일반화할 수 없음 히어로의 특성
 * +getInfo() //+는 public 접근지정자의 메소드
 * ----------------
 * Superman extends Human
 * -power
 *-----------------
 *Aquaman extends Human
 * -speed
 */

public class Inheritance {

	public static void main(String[] args) {
		//Human객체 상속
		Human h1=new Human("홍길동", 177);
		//h1의 정보 출력하기 => getInfo()이용하기
		//System.out.println(h1.getInfo());
		String s=h1.getInfo();
		System.out.println(s);
		
		//슈퍼맨 객체 생성해서 이름, 키, 초능력 값을 할당하고 정보 출력하기 => getInfo()이용하기
		Superman s1=new Superman(); //생성자안만들었으니 기본생성자로 해야함
		//Aquaman a1=new Aquaman("황금", 191, 120); 이러면 에러남
		s1.name="강철";
		s1.height=180;
		s1.power=500; //초능력 스피드가 출력되지않음 human에 없었으니까//그래서 메소드 오버라이딩이 필요
		System.out.println(s1.getInfo());
		
		//아쿠아맨 객체 생성해서 이름, 키, 초능력 값을 할당하고 정보 출력하기 => getInfo()이용하기
		Aquaman a1=new Aquaman();
		a1.name="황금";
		a1.height=191;
		a1.speed=120.123;
		System.out.println(a1.getInfo());
		
		//슈퍼맨 객체 1개 더 생성해서 이름, 키, 초능력 주고 제목을 가진 슈퍼맨 정보 출력
		
		System.out.println(s1.getInfo("--슈퍼맨의 정보--"));
		//제목을 가진 슈퍼맨 정보 출력하기 => 초능력 100충전해서 출력하기
		s1.getInfo("--슈퍼맨 파워 업--", 100); //파워600
		//제목을 가진 슈퍼맨 정보 출력하기 => 초능력 100충전해서 출력하기
		Superman s2=new Superman("울트라 슈퍼맨", 166, 2000); 
		s2.getInfo("--슈퍼맨 파워 다운--", -500); //파워1500
		
		
		/*정하운
		 * //슈퍼맨 객체 1개 더 생성해서 이름, 키, 초능력 주고
		//제목을 가진 슈퍼맨 정보 출력하기
		Superman s2 = new Superman();
		System.out.println(s1.getInfo("--슈퍼맨의 정보--")
				);
		//제목을 가진 슈퍼맨 정보 출력하기 => 초능력 100충전해서 출력하기
		s1.getInfo("--슈퍼맨 파워 업--", 100);

		 */

	}//
	

}//
