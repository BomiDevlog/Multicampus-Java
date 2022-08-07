package day04;

public class DoWhileTest {

	public static void main(String[] args) {

		/*do~while문
		 * 
		 * 변수 선언문;
		 * do{
		 * 		실행문;
		 * 		증감식;
		 * }while(조건식);
		 * 
		 * while문의 경우 조건식이 true이면 반복실행한다. 그렇지만,
		 * do~while문의 경우 조건식이 false일지라도 한 번은 실행하고 루프문을 벗어난다.
		 * 						true이면 반복 실행한다. 
		 * 
		 */
		
		
		int a=5;
		do {
			System.out.println("Hi: "+a);
			a--;
		}while(a>2);
		System.out.println("The End"+a); //a=2가 됨
		
		//a=5는 true니까 Hi5,4,3까지 실행. a=1은 false인데 hi 1으로 한번 실행
		
		int b=0;
		do {
			System.out.println("Java: "+b);
			b-=10;
		}while(b>0);
		System.out.println("The End"+b); //b=-10이 됨
		//false인데 1번 실행됨 Java: 0  The End
		
		
		
		
		
		
		
		
		
	}//

}//
