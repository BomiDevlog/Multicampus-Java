package day07multicampus;

public class Staff2 {
	
	private int no;//사번
	private String name;//이름          //멤버변수(인스턴스변수)
	private String dept;//소속부서
	private String phone; //연락처

	public int getNo() {
		return no;
	}


	public void setNo(int no) { //멤버변수와 지역변수는 이름이 중복될수 있다. 해당 지역에서는 지역변수가 우선이기에 지역변수로 해석한다. 그래서 값할당을 못받는 경우를 막기위해 멤버변수앞에 this. 을붙여 구별한다
		this.no = no;
		//해석하면 멤버변수no=지역변수no로 값을 할당하라는 의미
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public void showInfo() {//컨트롤 알트 방향키아래 =그대로 복사
		System.out.println("------직원정보-------");
		System.out.println("사번: "+no);
		System.out.println("이름: "+name);
		System.out.println("부서: "+dept);
	
	
//소스에 제너레이트 게더 세더 만들수 있다!!
	
	
	
	/*//setter 
	public void setNo(int n) {
		no=n;
	}
	public void setName(String na) {
		name=na;
	}
	public void setDept(String de) {
		dept=de;
	}
	public void setPhone(String ph) {
		phone=ph;
	}
	
	//getter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getPhone() {
		return phone;
	}*/
	
	
	} 
}//
