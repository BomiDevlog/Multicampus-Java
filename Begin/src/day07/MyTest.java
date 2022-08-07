package day07;

public class MyTest {

	public static void main(String[] args) {
		// MyDemo 클래스의 변수 x,y값을 출력하세요
		
		MyDemo md=new MyDemo();  //객체생성해서 불러내야한다 [객체명.변수]
		System.out.println("md.x: "+md.x);
		
		
		System.out.println("MyDemo.y: "+MyDemo.y); //static을 붙여서 [클래스명.변수]
		//System.out.println(md.y); 출력된다

		
		//MyDemo의 foo(), bar() 메소드 호출하기
		//System.out.println(MyDemo.foo());출력에서 호출하면 오류난다 
		MyDemo.foo(); 
		md.bar();
		
		//MyDemo의 star(),snail() 메소드 호출하고 결과를 출력하세요 
		//반환타입 String으로 받아야함
		
		String s1=MyDemo.snail();
		System.out.println(s1);
		
		String s2=md.star(30);
		System.out.println(s2);
		
		System.out.println(md.star(20));//1회용이라 재사용성이 떨어짐
		
		/*내가 푼 거
		 * md.star(5);
		MyDemo.snail();
		System.out.println("md.star(5): "+md.star(5));
		System.out.println("MyDemo.snail(): "+MyDemo.snail());
		*/
		
		/*#구인 구직 프로그램을 작성한다고 가정합시다

[1] 잡코리아나 사람인 사이트를 살펴보고
해당 프로그램에 필요한 객체를 2개 추출하세요
 ex) 구직자, 구인회사, 헤드헌터,...
회사이름 구직자회사이름 광고 등

[2] 추출한 객체를 class로 구성하세요.
이때  속성은 3개 이상, 메소드는 2개 이상 구성하세요
추상화. 클래스이름을 반드시 의미있게 짓는 연습. 속성을 추출
구직자의 프로필, 희망연봉

[3] 속성은 캡슐화하고, setter와 getter를 구성하세요

[4] 생성자를 구성하되 2개 이상 구성하세요=>오버로딩
this()이용해서 초기화하기

[5] main()메소드에서 해당 객체들을 생성해 테스트 하세요
JopApp 클래스생성==>main()메소드 구성하기

		 * 
		 */
		
	}//

}//
