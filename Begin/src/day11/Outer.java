package day11;

public class Outer {//static못붙임. static변수, static메소드를 가질 수 잇음.
	//그런데 Inner Class의 경우 static붙이면 가능
	
	int a=1;
	static int b=2;
	
	void print() {//만약 같은 클래스에서 이너클래스를 호출할 때.
		Inner i=new Inner();
		System.out.println(i.c);
		
		Outer.Inner oi=this.new Inner();
		System.out.println(oi.c);
	}
	
	class Inner{//Inner Member Class -non-static
		int c=3;
		void sub() {
			System.out.println("sub()*****");
		}
		
	}//Inner//
	
	static class SInner{//static클래스라서 static변수, static메소드를 가질 수 잇음
		int d=4;
		static int e=5; 
		void foo() {
			System.out.println("foo()###");
		}
		static void bar() {
			System.out.println("bar()@@@");
		}
	}//SInner//
	
	//이너클래스는 파일명에 $가 붙음
	

}//Outer//
