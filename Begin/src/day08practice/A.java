package day08practice;
//[연습문제8.문제3]
class A {
	public int getNumber(int a) {
		return a+1;
	}
}

class B extends A{
	public int getNumber(int a) {
		return a+2; 
	}
	
	public static void main(String[] args) {
		A a=new B();
		System.out.println(a.getNumber(0));

	}

}
//오버로딩되어 B의 getNuber로 작동해 답2