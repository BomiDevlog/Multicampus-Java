package day07;

public class Superman {
	//Superman has a name, power(초능력)... //캡슐화해야하는데 생략하고 진행하겠다
	
	String name;
	int height;
	int power;
	
	//기본 생성자
	public Superman() {
		this("슈퍼맨",166,100);  //코드가 간결하고 깔끔해짐
		//this(): 자기자신의 생성자를 호출할 때 사용한다
		//		생성자 안에서만 호출할 수 있으며,
		//		제일 첫번째 문장이어야 한다.
		
		/*name="슈퍼맨";
		height=166;
		power=100;*/
		
	}
	
	//인자생성자 3개(int), (int,int), (String, int, int), (int, String int)
	
	public Superman(String name) {
		this(name,170,200);
		/*this.name = name;
		height=170;
		power=200;*/
	}
	
	public Superman(String name, int height) {
		this(name, height, 300);
		/*this.name=name;
		this.height=height;
		power=300; //this.power라고 써도 됨*/
		
	}
	
	//중복코드 많아서 지저분하니 간략하게 줄일것
	//매개변수가 가장많으니 타겟으로 함 (반드시는 아님)
	//target: 여기서 초기화를 하자
	//this()할 떄 타겟을 할 메소드가 있어야한다
	public Superman(String name, int height, int power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	
	public String getInfo() {
		// 정보를 문자열로 반환하는 메소드를 구성
		String info="이름: "+name+"\n키: "+height+"\n초능력: "+power;
		return info;
	}
	
	
	

}//
