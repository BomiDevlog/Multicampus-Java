package day06;
//부동산 관련 앱
//객체: 집, 중개인, 매도자, 매수자, 임대인...
//추상화: 현실세계에 존재하는 객체를 프로그램 세계로 표현하는 것 (세세하게 모든걸 다 표현한게 아니라 어떤 특징적인 것들만 표현해서 추상화. 프로그램에 필요한 특징만 클래스로 옮기니까)
//클래스명: House
//			속성(has a) : 3가지. 방의 개수, 주소(어느지역), 소유주, 화장실 개수..
//			기능(행위): 얼마에 세를 놓다, 얼마에 매도하다, xx에 위치하다...

public class Jikbang {

	public static void main(String[] args) {
		//객체 2개 생성해서 각각 속성값주고
		//메소드들을 호출해보기(showInfo(),existAt(),XXX())
		
		House h1=new House();//객체생성

		House h2=new House();
		
		h1.showInfo();
		h2.showInfo();
		//속성값안주면 디폴드인 0,null나옴
		
		h1.owner="홍길동";
		h1.room=2;
		h1.addr="부산광역시 해운대구";
			
		h2.owner="김영란";
		h2.room=5;
		h2.addr="부산광역시 동래구";
	
		h1.showInfo(); //void는 변수없이 바로 출력가능
		h2.showInfo(); //값이 적용되어 출력
		
		/*
		h1.existAt(100); //컨트롤키 누르고 마우스를 가져가보기. 출력문없어서 출력이 안나옴.
		h2.existAt(200);
		*/
		
		String s1=h1.existAt(100); //반환타입이 string이니 해당타입의 변수로 받아줘야함
		String s2=h2.existAt(200);
		System.out.println(s1);
		System.out.println(s2);
		
		//rent()메소드 호출해보기 //기능이 필요하면 메소드를 호출함
		
		h1.rent("매매",153000);
		h2.rent("전세",82000);
		
		/*OOP 4가지 특징
		 * [1] 추상화 (Abstraction)
		 * [2] 캡슐화(은닉화) (Encapsulation) :private (다른 데서 함부로 접근 못하게 하는 것)(접근할 수 있는 메소드를 만들어줌)
		 * [3] 다형성 (Polymorphism) : 다양한 형태로 객체 접근. 오버로딩 등. 
		 * [4] 상속성(Inheritance) : 부모클래스의 것을 자식클래스가 상속받음
		 * 
		 */
		
		
	}//

}//
