package day07;

public class Person {
	//Person has a name, age... //캡슐화는 생략하고 진행하겠다
	
	String name;
	int age;
	//생성자(Constructor): 객체를 생성할 때 호출되는 메소드의 일종 //(특별한 메소드)
	/*-규칙
	 * <1> 생성자 이름은 클래스 이름과 동일하게 지어야한다.
	 * <2> 반환타입을 명시하지 않는다. (void 안씀)
	 * <3> 역할: 멤버변수 값을 초기화하는 일을 주로 한다.
	 * public 생성자명() {   //접근지정자 public쓰고 생성자쓰고 괄호열고닫고 중괄호하고.
	 * 
	 * }
	 */
	public Person() { //기본생성자(default constructor) //매개변수를 받아들이지않는것을 기본생성자라고 한다 //매개변수 0개//매개변수는 소괄호사이에 뭔가넣는걸 말함
		name="아무개";
		age=1;
		//멤버변수 초기화해서 값을 지정해줌
	}
	//동일한 이름의 생성자를 다수 만들수 있다
	public Person(String name) {//인자생성자(constructor using fields) :fields(변수)를 받아들이니까. //매개변수 1개
		this.name=name;//값을 또 초기화해본다
		age=10; //언급하지않으면 직접 값을 지정해야함 //멤버변수앞에 this.붙인다
	}
	
	public Person(int age) {//인자생성자 //매개변수 1개
		name="최양";
		this.age=age; 
	}
	
	public Person(String name, int age) {//인자생성자//매개변수 2개
		this.name=name;//값을 또 초기화해본다
		this.age=age;
	}
	
	public Person(int age, String name) {//순서바꿔서 매개변수 2개
		this.name=name;
		this.age=age;
	}
	
	
	//동일한 이름으로 여러 메소드를 구성=>오버로딩
	//규칙: 매개변수를 다르게 만들어야한다
	
	/*오버로딩이란?
	 * - 동일한 메소드 이름을 여러 개 구성하는 것 (다중정의, 중복정의)
	 * - 매개변수의 자료형이 다르거나, 갯수가 다르거나, 순서를 다르게 구성해야 한다. (완전히 똑같이 중복되면 에러)
	 * - 반환타입은 달라도 되고 같아도 된다.(신경쓰지 않음.)
	 * 
	 */
	
	/*c의 경우
	 * 같은 이름을 못쓴다 (같은 기능이더라도) (그래서 이름 확인하는데 시간 소요.)
	 * int a(){
	 * 
	 * }
	 * void b(){
	 * 
	 * }
	 * 
	 * 객체지향 OOP(예.자바)으ㅏㅣ 경우 같은이름을 여러구성으로 오버로딩 가능
	 * int a(){}
	 * int a(byte b){}
	 * void a(String s){}
	 */

}//
