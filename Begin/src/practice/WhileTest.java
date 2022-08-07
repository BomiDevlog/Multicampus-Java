package practice;
import java.util.*;
public class WhileTest {

	public static void main(String[] args) {
		/*While문을 이용
		 *  정수를 입력 받는다 -> 개수 제한 X
		 *   0 을 입력하면 입력 종료
		 *    입력한 수의 개수를 출력
		 *     입력한 수의 평균을 출력
		 *      1 2 2 0  -> 개수 : 3개   평균 1.66… (평균값)

		 * 
		 */
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		int sum=0;
		while (true) {
			System.out.println("정수를 입력하세요=>");
			int input=sc.nextInt();
			if (input==0) {
				System.out.println("게임을 종료합니다.Thank you!");
				break;
			}
			count++;
			sum+=input;
			System.out.println("총 게임 횟수: "+count+"회");
			System.out.println("전체 input 평균값: "+sum/count);
		}
		
		
		
	}//

}//
