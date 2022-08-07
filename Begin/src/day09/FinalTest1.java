package day09;

class Super {//부모클래스
	void foo() {//생략형 접근지정자
		System.out.println("Super's foo()");
		
	}
}

//final + class : 다른 클래스에서 상속받지 못하도록.
final class Sub extends Super{//자식클래스가 상속받음/ 부모의 foo()를 오버라이드
	@Override
	protected void foo() {//접근지정자는 같거나 범위가 넓은 것으로 상속받을 수 있다 private[x]
		System.out.println("Sub's foo()");
	}
	
}

//final인 Sub를 상속받지 못함
//ex) java.lang.String클래스 => final클래스 => 다른 클래스에서 상속받을 수 없음
public class FinalTest1 //extends Sub 
{

	public static void main(String[] args) {
		

	}

}
