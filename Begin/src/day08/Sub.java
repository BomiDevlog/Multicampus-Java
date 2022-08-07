package day08;
//자식클래스: sub class, derived class
public class Sub extends Super {
	int b=30;
	int c=40;
	
	@Override //annotation을 붙여 오버라이드에 대해 문법적으로 틀린게 있는지 알려줌
	public void func(){//부모의 func를 오버라이드 
		System.out.println("func() #####");
	}
	
	//Overload
	public String func(int a) {
		return "func(): a="+a;
	}

}//
