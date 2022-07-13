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
		int month =sc.nextInt();
		
		System.out.print(month+"월의 계절은 ");
		switch(month) {
		case 12,1,2:
			System.out.println("추운 \'겨울\'입니다");
			break;
		case 3,4,5:
			System.out.println("따뜻한 \'봄\'입니다");
			break;
		case 6,7,8:
			System.out.println("무더운 \'여름\'입니다");
			break;
		case 9,10,11:
			System.out.println("풍성한 \'가을\'입니다");
			break;
		default:
			System.out.println("몇 월인지 다시 확인해주세요");
			return;
		}
		
		/*
		 * Scanner si=new Scanner(System.in);
		System.out.println("월을 입력[1~12]=>");
		int month2=si.nextInt();
		
		int days2=0; //''로 감싸면 문자가 되니까. 인트 숫자일 때는 홑따옴표안함. char일땐 꼭 홑따옴표
		switch (month) {
		case 1,3,5,7,8,10 :
			days2=31;
		break;
		case 2 :
			days2=28;
		break;
		case 4,6,9,11 :
			days2=30;
		break;
		default :
			System.out.println("없는 달");
		return;
		}
		System.out.println(month2+"월은 "+days2+"일까지 있습니다~");
	
		 */

	}//

}//
