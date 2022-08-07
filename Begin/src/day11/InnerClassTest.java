package day11;

public class InnerClassTest {

	public static void main(String[] args) {
		
		//1) Outer클래스의 a,b변수값을 출력하세요
		//2) Inner클래스의 c변수값 출력하고
		//			sub()메소드 호출하기
		//3) SInner클래스의 d 출력
		//			foo(), bar()호출하기

		
		
		//1) Outer클래스의 a,b변수값을 출력하세요
		Outer o1=new Outer();
		System.out.println("o1.a="+o1.a);
		//non-static
		
		System.out.println("Outer.b="+Outer.b);
		//static 변수
		
		//2) Inner클래스의 c변수값 출력하고 sub()메소드 호출하기//non-static
		Outer o2=new Outer();
		Outer.Inner oi=o2.new Inner();
		System.out.println("oi.c="+oi.c);
		oi.sub();
		
		//***다른 풀이***
		Outer.Inner oi2=new Outer().new Inner(); //두줄을 한줄로 줄인것
		oi2.sub();
		
		//3) SInner클래스의 d 출력하고, foo(), bar()호출하기
		//static 이너클래스
		Outer.SInner os=new Outer.SInner(); //non-static 변수
		System.out.println("os.d="+os.d);
				os.foo();//non-static 메소드
		
		System.out.println("Outer.SInner.e"+Outer.SInner.e); //static 변수
		Outer.SInner.bar();//static 메소드

		
		
	}

}
