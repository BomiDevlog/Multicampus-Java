package practice;
import java.util.Scanner;
public class SeasonTest {

	public static void main(String[] args) {
		/*switch~case문 사용
		 * 12,1,2 -> 겨울
		 * 3,4,5 -> 봄
		 * 6,7,8 -> 여름
		 * 9,10,11 -> 가을
		 * 잘못 입력했을 경우 처리
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("몇 월의 계절을 알고 싶으신가요?[1~12]=>");
		int season =sc.nextInt();
		
		;
		switch(season) {
		case 12,1,2:
			System.out.println("지금은 추운 \'겨울\'입니다");
			break;
		case 3,4,5:
			System.out.println("지금은 따뜻한 \'봄\'입니다");
			break;
		case 6,7,8:
			System.out.println("지금은 무더운 \'여름\'입니다");
			break;
		case 9,10,11:
			System.out.println("지금은 풍성한 \'가을\'입니다");
			break;
		default:
			System.out.println("몇 월인지 다시 확인해주세요");
			return;
		}

	}//

}//
