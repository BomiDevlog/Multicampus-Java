package day03;

public class IfTest {
	
public static void main(String[] args) {
		
		/*if(조건식){
		 *    실행문;
		 *    실행문;
		 *    실행문;
		 *  }
		 *  
		 *  조건식이 true이면 실행문 실행
		 * 
		 */
		
		int a=3;
		if(a>0) {
			System.out.println("a는 양수입니다"); //true일 때 실행
		System.out.println("The End~~~~"); //조건과 상관없이 실행되는 종료문장
		}
		//중괄호 없을 때. true이면, a는 양수입니다 The End~~~~/ a=-3이라 false이면 The End~~~~
		//중괄효 있을 때, true이면, a는 양수입니다 The End~~~~/ a=-3이면 false라 아무실행안됨
		
		//tab: 들여쓰기
		//shift+tab: 내려쓰기
		//==========================================================
		//연습
		int b=1;
		if(b>0) 
			System.out.println("b는 양수"); //중괄호없어서 true일 때 실행
		System.out.println("끝");//조건과 상관없이 실행되는 종료문장
		
		
}

}
