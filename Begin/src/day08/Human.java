package day08;
//부모 클래스(Super class, Base class)
public class Human { //상속받은게 없는건 묵시적으로 extends Object 하고 있음 (Object는 클래스계의 단군)
	//캡슐화 생략하고 진행
	String name;
	int height;
	
	//초기값을 하나 줄것. 세더역학. 기본생성자는 하나 만들어두기.
	public Human() {
		this("아무개", 155); //아래의 생성자를 불러온 것. 이름과 키
	}
	public Human(String n, int h) {
		name=n;
		height=h;
	}
	
	public String getInfo() {
		return "이름: "+name+"\n키: "+height;
	}

}
