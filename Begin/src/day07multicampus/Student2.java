package day07multicampus;
import java.util.*;
/*학사관리 프로그램에서 사용하는 학생 클래스*/
public class Student2 {
	
	private int no;
	private String name;
	private String major;
	private String phone;
	
	//setter
	public void setNo(int no) {
		this.no=no; //this안붙이면 0 null나옴
	}
			//멤버변수와 지역변수의 이름이 동일할 경우
			//지역변수가 우선권이 있다.
			//이럴 때 멤버변수와 지역변수를 구분하기 위해
			//멤버변수 앞에는 this. 을 붙인다
			//this: 자기자신의 객체(instance)를 참조할 때ㅏ 사용하는 키워드
	public void setName(String name) {
		this.name=name;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	//getter
	public int getNo() {
		return no; //이름이 충돌되지않으니 그대로씀 의미는 this.no라는 멤버변수를 지칭한다
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getPhone() {
		return phone;
	}
	
	public void showInfo() {//컨트롤 알트 방향키아래 =그대로 복사
		System.out.println("------학생정보-------");
		System.out.println("학번: "+no);
		System.out.println("이름: "+name);
		System.out.println("전공: "+major);
	} 
	
	/*김현섭
	 * public void setNo(int a)
{
	no = a;
}

public void setName(String a)
{
	name = a;
}

public void setMajor(String a)
{
	major = a;
}

public int getNo() {
	return no;
}

public String getName() {
	return name;
}

public String getMajor() {
	return major;
}

	 * 정수현
	 * public void setNo(int n) {
	
	no=n;
}
public void setName(String a) {
	
	name=a;
}

public void setMajor(String m) {
	
	major=m;
	
}

public int getNo(){
	
	return no;
}
public String getName(){
	
	return name;
}

public String getMajor() {
	
	return major;
}

	 * 박지혜
	 * private int no;
private String name;
private String major;

//setter
public void setNo(int n) {
	no=n;
}

public void setName(String m) {
	name=m;
}
public void setMajor(String j) {
	major=j;
}

//getter
public int getNo() {
	return no;
}
public String getName() {
	return name;
}
public String getmajor() {
	return major;
}

추동헌
private int no;
private char name;
private char major;

public void setno(int a) {
	no=a;
}
public void setname(char s) {
	name=s;
}
public void setmajor(char b) {
	major=b;
}
public int getno() {
	return no;
}
public char getname() {
	return name;
}
public char getmajor() {
	return major;

이진열
public class Student {
private int no;
private String name;
private String major;

//Setter
public void setNo(int i) {
	no=i;
}
public void setName(String n) {
	name=n;
}
public void setMajor(String m) {
	major=m;
}

//Getter
public int getNo() {
	return no;
}
public String getName() {
	return name;
}
public String getMajor() {
	return major;
}

}

	 */
	

}//
