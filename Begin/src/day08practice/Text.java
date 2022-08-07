package day08practice;//[연습문제8.문제6]

class A3 {
public int getVal() {
	return 5;
}
}
class B3 extends A3{
	public int getVal() {
		return 10;
	}
}
public class Text{
	public static void main(String[] args) {
		B3 b=new B3();
		A3 a=(A3)b;
		int x=a.getVal();
		System.out.println(x);

	}

}
