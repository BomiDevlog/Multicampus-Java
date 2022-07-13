package practice;

public class MultipleTest {

	public static void main(String[] args) {
		/*1~100까지의 정수 중에서
		 * 3 또는 4의 배수의 합을 계산
		 */
		int sum=0;
		for(int i=1;i<101;i++) {
			if(i%3==0 || i%4==0) {
				sum+=i;
			}
		}System.out.println("3 또는 4의 배수의 합"+sum);

	}

}
