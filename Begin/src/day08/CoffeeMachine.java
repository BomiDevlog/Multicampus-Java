package day08;

public class CoffeeMachine {
	
//캡슐화해야하는데 생략하고 진행한다
	
	int coffee, sugar, cream; //멤버변수//각각 선언해도 되고 같이 선언해도됨. 변수명이 나오기전까지가 공통. 즉 전부 인트.
	Yuja yj;//새로운 변수를 선언함 자료형Yuja는 클래스이름이고 yj는 변수이름
	/*메소드 오버로딩(다중정의)
	 * -메소드 이름은 동일하게
	 * -매개변수의 자료형이 다르거나, 개수가 다르거나, 순서가 다르게
	 * -반환타입은 같아도 되고 달라도 된다.
	 */
	
	//밀크커피, 블랙커피, 크림커피, 설탕커피 만들다 ==> 메소드/ 객체지향 전에는 메소드 명이 달라야했다
	/*
	public void makeMilkCoffee(int c, int s, int cr) {
		coffee=c;
		sugar=s;
		cream=cr;
	}
	public void makeBlackCoffee(int c) {
		coffee=c;
	}
	public void makeSugarCkoffee(int c, int s) {
		
	}*/
	//재료만 다르고 전부 커피를 조합하는 것인데 메소드가 다른게 복잡함 객체지향은 같은 이름이 가능!!!
	
	public void makeTea(int coffee) { //지역변수 
		this.coffee=coffee;
	System.out.println("블랙 커피 나가요~*^^* 농도: "+this.coffee);
	}
	public void makeTea(int coffee, int sugar) { //동일한 메소드 이름으로 매개변수를 다르게함 =>오버로딩
		this.coffee=coffee;
		this.sugar=sugar;
		int n=this.coffee+this.sugar;
	System.out.println("설탕 커피 나가요~*^^* 농도: "+n);
	}
	// System.out.println("설탕 커피 나가요~*^^* 농도: "+(this.coffee+this.sugar;)); 이렇게 바로 만들어도 된다
	public String makeTea(int coffee, int sugar, int cream) { //maketea라고 하면 다른 메소드된다 대소문자구분
		this.coffee=coffee;
		this.sugar=sugar;
		this.cream=cream;
		String s="밀크 커피 나가요~*^^* 농도: "+(this.coffee+this.sugar+this.cream);//소괄호 묶어서 더해야한다
		return s;// 반환타입있으니 마지막엔 String타입으로 return반환하며 마무리
	}
	//크림커피 메소드 구성해보기
	//public void makeTea(int coffee, int cream) { //인트 2개짜리가 이미 있어서 오류난다 아예 값을 박아주던가 자료유형을 다르게 해보면 된다 
	public void makeTea(int coffee, short cream) { 
		this.coffee=coffee;
		this.cream=cream;
		int crm=this.coffee+this.sugar;
		System.out.println("크림 커피 나가요~*^^* 농도: "+crm);
	}
	public int makeTea(short cream, int coffee) {
		this.makeTea(coffee,cream); //this.메소드(): 자기자신의 메소드를 호출할 때 사용
		System.out.println("크림 커피 나가요~*^^* 농도: "+(this.coffee+this.cream));
		return (this.coffee+this.cream);
	}
	
	/*김현섭
	 * public void makeTea() {
		coffee = 1;
		sugar = 1;
		cream = 2;
	}

	 */
	
	//유자차 메소드 구성해보기 1새로운 변수 yj 위에서 선언하고와서 진행
	public void makeTea(Yuja y) { //여기 수정해야함 뭔가 놓쳤음
		this.yj =y;
	System.out.println("[신메뉴] 유자차 나왔어요!");
	System.out.println("유자: "+yj.getYuja());
	System.out.println("설탕: "+yj.getSugar());	
	}
	
	//클래스에 메인 붙이는 것과 아닌것의 차이가 뭔가요? //main 붙어야 콘솔창에 런(독립적으로 실행) 되고. 다른 메소드는 콘솔에 실행안되니까 메인에서 호출해야함


}//
