package practice;

public class Exercise3_3Kimbomi {

	public static void main(String[] args) {
		/*연습문제 04
		 * [3-3] 아래 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
		 * 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
		 * [Hint] 상황 연산자를 두 번 사용하라. 
		 * 
		 * [실행결과] 양수
		 *  */
		
		int num= 10;
		
		String result=(num>0)? "양수":"음수";
		System.out.println(result);
		
		String result2=(num==0)? "0":"";
		System.out.println(result2);

	}

}
