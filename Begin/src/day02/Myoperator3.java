package day02;

public class Myoperator3 {
	
	public static void main(String[] args) {
		System.out.println("6. 조건연산자(삼항연산자)----"); //자주 쓰인다
		/* 변수 선언문 =(조건식)? 값1:값2; // 값1이 아니면 값2를 대입해줘라 는 내용
		 * => 조건식이 true이면 값1을 변수에 대입해주고,
		 *          false이면 값2를 변수에 대입해준다
		 * 이때 주의! 변수와 값1, 값2는 같은 자료형이어야 한다(선언문과 변수의 자료형이 동일해야한다)
		 * 
		 */
		//if/else구문은 조건연산자로 변경가능
		
		int a=50;
		int b=60;
		int result=(a>b)?a:b;
		System.out.println("result="+result); //60 //a<b이면 50
		
		//String str=(a>b)? a:b; //인트고 스트링이라 문자열 배합안맞아서 에러
		//System.out.println("str="+str);
		
		String str=(a>b)? a+"":b+""; //+를 넣어서 int(숫자)를 스트링(문자)으로 문자화
		System.out.println("str="+str);  //str=60
		
		System.out.println("7. 할당연산자(연산후 대입연산자)----");
		/* =,+=,-=,*=, /=.%=, >>=, <<=, >>>=, &=. |=, ^=
		 *  */
		
		int i=1;
		i+=3; //i=i+3// 1+3=4 연산 후 대입 (뒤의 수만큼 누적)
		System.out.println("i="+i);
		
		int j=15;
		j-=7; //j=j-7// 15-7=8 연산 후 대입 (뒤의 수만큼 덜어내라)
		System.out.println("j="+j);
		
		int k=24;
		k/=2; // 24/2=12
		System.out.println("k="+k);
		
		k%=5; //12/5=2  나머지2
		System.out.println("k="+k); //k=2
				
		int x=3; //0011
		x^=2; // 0010 =>0001 =>10진수 바꾸면 x=1
		System.out.println("x="+x);
		//^ (xor연산자) : 두 비트가 서로 다르면 1, 같으면 0
		
		
		
	}

}
