package day08practice;//[연습문제8.문제7]

class A4{
	public String toString() {
		return "4";
	}
}
class B4 extends A4{
	public String toString() {
		return super.toString()+"3";
	}
}

public class Text2 {

	public static void main(String[] args) {
		System.out.println(new B4());

	}

}
