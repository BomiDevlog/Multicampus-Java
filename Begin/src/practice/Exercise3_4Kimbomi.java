package practice;

public class Exercise3_4Kimbomi {
	public static void main(String[] args) {
		/*[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
		 * 만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
		 * (1)에 알맞은 코드를 넣으시오.
		 */
		
		int num2=456;
		int num3=(int)(num2*0.01)*100;
		System.out.println(num2+"에서 백의 자리 이하를 버리면, "+num3+"이 됩니다.");
		
		
	}

}
