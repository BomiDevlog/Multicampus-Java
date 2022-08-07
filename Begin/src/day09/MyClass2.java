package day09;

interface Inter1{
	void a();
}

interface Inter2{
	String b();
}

abstract class AbsClass{
	abstract void c();
}
/*인터페이스가 인터페이스를 상속받을 때는 extends로 상속받고, 다중 상속도 가능하다*/
interface HisInter extends Inter1, Inter2{
	String STR="Hello";
}
/*[1] MyClass2가 AbsClass와 HisInter를 상속받도록 하세요
 * 	  에러없게 처리하세요 */

public class MyClass2 extends AbsClass implements HisInter  {
	//extends를 먼저 쓰고 implements를 나중에 쓴다
	//추상클래스는 extends 인터페이스는 implements로 상속받는다
	@Override
	void c() {
		System.out.println("c()@@@");
	}
	
	public void a() {
		System.out.println("a()###");
	}
	public  String b() {
		return "b()$$$"; //반환타입String에 맞게 return으로 반환
	}

	public static void main(String[] args) {
		/*[2] MyClass2타입의 객체 생성해서 메서드 각각 호출하고 STR값 출력해보기 */
		MyClass2 mc=new MyClass2();
		mc.a();
		mc.c(); //void니까 메소드를 불러주면 출력됨
		System.out.println(mc.b()); //반환타입이 있으니 반환타입에 맞게 해주던가 출력문에서 바로 출력.
		//mc.b(); 안나옴
		
		
		System.out.println("STR: "+STR); //?
		
		
		
		System.out.println("===========");
		/*[3] HisInter타입의 변수 선언하고 MyClass객체 생성해서 메서드 각각 호출하고 STR값 출력해보기 */
		HisInter hi=new MyClass2();
		hi.a();
		System.out.println(hi.b());
		
		System.out.println(HisInter.STR);
		System.out.println(MyClass2.STR);
		
		//c()는 안됨. HisInter에 있는 것이 아니라 접근 불가. 하려면 형변환해야한다.
		((MyClass2)hi).c();
		
		
		
		System.out.println("===========");
		/*[3] AbsClass타입의 변수 선언하고 MyClass객체 생성해서 메서드 각각 호출하고 STR값 출력해보기 */
		AbsClass ac=new MyClass2();
		ac.c();
		
		((MyClass2)ac).a();
		System.out.println(((MyClass2)ac).b());
		
		//System.out.println(AbsClass.STR); [x]
		System.out.println(MyClass2.STR);
	
	}

}
