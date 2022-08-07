package day08;
//Polymorphism(다형성)
public class Polymorphism {

	public static void main(String[] args) {
		Human h1=new Human("강철민",171);
		System.out.println(h1.getInfo());
		
		Superman s1=new Superman("이소라",170,600);
		System.out.println(s1.getInfo("---슈퍼맨 정보---"));//변수로 받던지 출력문안에 넣던지
		
		Aquaman a1=new Aquaman("인어공주",144,200);
		System.out.println(a1.getInfo());
		
		//부모 자식의 상속관계가 있을 경우
		//부모타입 참조변수 = new 자식객체();
		/*-부모 타입의 변수를 선언하고 객체는 자식객체로 생성하는 것이 가능하다 ==> 다형성	
		 * 
		 * -이럴 경우 부모타입의 참조변수로 접근할 수 있는 변수나 메소드는 제한이 있다.
		 * 	[1] 부모로부터 물려받는 변수나 메소드는 접근 가능하다.
		 * 	[2] 자식만 갖는 고유한 변수나 메소드는 접근할 수 없다.
		 * 	[3] 단, 오버라이딩한 메소드가 있을 경우는 자식의 것을  우선 적용한다.
		 *  */
		//Superman hs = new Human("이희재",175,300); [x] 자리 바뀌면 안됨 부모가 더 큰 자료유형이다ㅏ.
		//Human hm=new String("Hello");//상속관계일 때만 가능
		Human hs = new Superman("이희재",175,300); //자료유형은 부모타입, 객체는 자식타입 (o 가능)  //현업에서 99퍼로 많이 쓰는 방식이니 정확하게 숙지해둘 것!!!//개체가 바뀌어도 코드 수정이 더 적어서. 특히 데이터베이터관련.
		System.out.println("hs.name: "+hs.name);
		System.out.println("hs.height: "+hs.height);
		//System.out.println("hs.power: "+hs.power); [x] 부모타입 변수로는 접근할 수 없음
		System.out.println("s1.power: "+s1.power);//[o]
		System.out.println(hs.getInfo()); //오버라이딩된거라서 power까지 기재된 내용이 출력됨!
		//재정의한 메소드의 경우 hs로 호출하면 자식의 것이 우선 적용된다!!
		
		//System.out.println("hs.power: "+hs.power); [x]//해시코드 나와서 이렇게 안쓰는데 가끔 쓴다
		//System.out.println("hs.power: "+(Superman)hs.power);//()보다 .이 순서가 높아서 오류남. 그래서 괄호를 두번해야한다
		System.out.println("((Superman)hs).power: "+((Superman)hs).power); //휴먼타입이었던 hs를 슈퍼맨타입으로 형변환시키니 파워를 출력할 수 있다
		//부모자식의 상속관계가 있을 경우 형변환이 가능하다
		
		//hs참조변수로  "@@@슈퍼맨 정보@@@" 제목을 갖는 getInfo() 호출해서 정보를 출력해보기
		//System.out.println(((Superman)hs).getInfo("@@@슈퍼맨 정보@@@"));//내가 성공한 거
		String info=((Superman)hs).getInfo("@@@슈퍼맨 정보@@@");
		System.out.println(info);
		
		//[문제 1]
		/*Human타입 변수 선언 ha, Aquaman객체를 생성하세요
		 *getInfo()호출하기
		 *name, height, speed 각각 출력해보기
		 */
		Human ha=new Aquaman("박정수",181,420.21);
		
		System.out.println(ha.getInfo()); //스피드 안나옴
		
		System.out.println("haname: "+ha.name);
		System.out.println("ha.height: "+ha.height);
		System.out.println("((Aquaman)ha).speed: "+((Aquaman)ha).speed);
		
		String info2=((Aquaman)ha).getInfo();
		System.out.println(info2); 
		//System.out.println(((Aquaman)ha).getInfo());[o]
		
		System.out.println("*********Q2************");
		//[문제 2] h1, s1, hs, ha객체들을 저장할 배열을 생성하고
		//저장한 뒤에 for루프문 이용해서 배열에 저장된 객체들의 정보를 출력하세요.
		
		Human arr[]= {h1, s1, hs, ha};
		//arr[i]: Human계열의 객체들
		//instanceof 연산자를 이용하면 참조변수가 어떤 클래스의 객체인지 알 수 잇다.
		//참조변수 instanceof 클래스명 : 참조변수가 클래스의 객체이면 true를 반환, 아니면 false를 반환
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Superman) {//arr[i]이 Superman객체 맞아? 라는 물음
				System.out.println(((Superman)arr[i]).getInfo("##슈퍼맨 정보##"+i)); //휴먼타입의 arr을 슈퍼맨으로 형변환해서 제목을 넣어줌
			}else {
			System.out.println("------------------");
			System.out.println(arr[i].getInfo());
			}
		}

		//휴먼, 아쿠아맨, 슈퍼맨을 모두 수용하는 자료유형은 부모인 휴먼! 자료유형이 Human인게 포인트!!
		
		/*김현섭
		 * System.out.println("*********Q2************");
		Human [] arr = {h1,s1,a1,hm,an};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getInfo());

		 */
		
		
	}//

}//
