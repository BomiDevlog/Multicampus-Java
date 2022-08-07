package day07;

public class MyDemo {
	int x=50;
	static int y=70;
	
	//클래스메소드: static 이 붙음
	public static void foo() {
		System.out.println("foo()...");
	}//
	public void bar() {
		System.out.println("bar()...");
	}
	
	public String star(int n) {  //반환타입 String 매개변수 int n 있는 메소드
		String a="";
		for(int i=0;i<n;i++) {
			a+="★";
		}
		return a; //반환타입있으면 마지막에 반환타입으로 반환해야함. 그래서 String 문자열로 반환
	}
	
	public static String snail() { //반환타입있고 매개변수없는 메소드
		return "@@@@";
	}

}//
