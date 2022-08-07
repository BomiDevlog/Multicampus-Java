package day08practice; //[연습문제8.문제2]

class C{
	public int getNumber(int c) {
		return c+1;
	}
}

class D extends C{
	public int getNumber(int c, char f) {
		return c+2;
	}

	public static void main(String[] args) {
		D d= new D();
		System.out.println(d.getNumber(0));

	}

}

///답1 