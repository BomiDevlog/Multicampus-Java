package day08;

public class Cafe {

/*OOP
 * [1]추상화
 * [2]캡슐화(은닉화) -private, setter, getter => this.변수
 * [3]다형성
 * -오버로딩(다중정의)
 * 		+-- 생성자 오버로딩 =>this() : 생성자에서만 호출가능, 첫번째 문장
 * 		+-- 메소드 오버로딩 =>this메소드()
 * *this=> static문구에서는 사용불가
 * -오버라이딩(재정의)-메소드 재정의
 * [4]상속성
 */

	public static void main(String[] args) {
		/*밀크 커피 만들기
		 * 설탕 커피 만들기
		 * 블랙커피 만들기
		 * 크림 커피 만들기
		 */
		
		CoffeeMachine cm=new CoffeeMachine(); //가장 먼저 클래스를 소환. 이후로는 생성자니까 간단하게 출력가능
		//밀크 커피
		String s=cm.makeTea(1, 2, 3); //스트링타입 반환이니까 스트링으로
		System.out.println(s);
		
		System.out.println(cm.makeTea(2, 2, 4));//1회용
		
		//설탕 커피
		cm.makeTea(2,1); //void는 메소드만 부르면 된다
		//블랙 커피
		cm.makeTea(1);
		//크림 커피
		//cm.makeTea(2,3); //설탕커피로 나온다. 디폴트인 인트로 잡기때문. 크림은 short로 잡았으니 short 강제형변환을 써줘야한다
		cm.makeTea(2,(short)3);
		
		
		//유자차 //클래스유형이니까 객체를 생성해서 넣어야한다 캡슐화 후에 값을 넣는건 setter 값을 꺼내는건 getter 
		Yuja x=new Yuja();
		//x.yuja=3 [x] 캡슐화했으니까 set으로 입력
		x.setYuja(3);
		x.setSugar(3);
		cm.makeTea(x);//set안해주면 유자값 설탕값이 디폴트 0으로 나옴
		
		
		
		
		
		/*내가 하다가 만거
		Cafe milk1=new Cafe();
		System.out.println(milk1.makeTea(10,5,9));
		
		Cafe sugar1=new Cafe(1,2);
		Cafe black1=new Cafe(1);
		Cafe cream1=new Cafe(2,1);
		Cafe coffe1=new Cafe();
		
		
		System.out.println(milk1.makeTea());
		System.out.println(sugar1.makeTea());
		System.out.println(black1.makeTea());
		System.out.println(cream1.makeTea());*/
		
		/*이창환 (o)
		 System.out.println("밀크커피");
		System.out.println(cm1.makeTea(10,5,9));
		System.out.println();
		
		System.out.println("설탕커피");
		cm1.makeTea(10,4);
		System.out.println();
		
		System.out.println("블랙커피");
		cm1.makeTea(10);
		System.out.println();
		
		System.out.println("크림커피");
		cm1.makeTea((short)1,3);
		System.out.println();*/

		 
		
	}

}
