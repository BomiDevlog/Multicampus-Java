package practice;

public class Practice04Kimbomi {

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
		

		/*[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
		 * 만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
		 * (1)에 알맞은 코드를 넣으시오.
		 */
		
		int num2=456;
		int num3=(int)(num2*0.01)*100;
		System.out.println(num2+"에서 백의 자리 이하를 버리면, "+num3+"이 된다");
		
		
		
		
	}

}
