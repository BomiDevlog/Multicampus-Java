package day09;

class SuperDemo{
	void sub() {
		System.out.println("SuperDemo's sub()");
	}
	final void bar() {
		System.out.println("SuperDemo's bar()");
	}
}

class SubDemo extends SuperDemo{
	//sub()오버라이딩 하기
	@Override
	void sub() {
		System.out.println("sub() #####");
	}
	
	//bar() 오버라이딩 하기
	/*@Override
	void bar() {
		System.out.println("bar() @@@@@");
	}
	final+method : 오버라이딩을 할 수 없다.
	상속받아서 가지는 것은 가능할 뿐. 오버라이딩은 불가. 상속받았으니 메인에서 호출은 가능
	*/
}

public class FinalTest2 {

	public static void main(String[] args) {
		//sub(), bar() 호출해보기
		SuperDemo sd=new SuperDemo(); //어느 클래스에 있는지 방 문 똑똑
		sd.sub(); //그 방에 있는 메소드를 호출해요
		sd.bar();
		
		//SubDemo의 sub() 호출해보기
		SubDemo sb=new SubDemo();
		sb.sub(); //재정의 o(오버라이딩)
		sb.bar(); //재정의 x(그대로 호출)

	}

}
