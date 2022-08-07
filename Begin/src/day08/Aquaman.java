package day08;
//double speed
public class Aquaman extends Human {
	double speed;
	
	public Aquaman() {
		this("수중인간", 160, 789.12);
	}
	public Aquaman(String n, int h, double s) {
		this.name=n;
		this.height=h;
		this.speed=s;
	}
	
	//getInfo() 메소드를 오버라이드 해보세요
	public String getInfo() {
		String info="이름: "+name+"\n키: "+height+"\n초능력: "+speed;
				return info; //변수를 쓰면 출력이나 여러번 활용할 수 있고 리턴에 바로 쓰면 1회용으로.
				//return "이름: "+name+"\n키: "+height+"\n초능력: "+speed; 으로 한줄로 해줄 수 있다.
	}
	
	//getInfo()를 오버로딩 해보기


	
}//
