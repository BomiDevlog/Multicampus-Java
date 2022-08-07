package practice;
import java.util.Scanner;

public class WordTest {

	public static void main(String[] args) {
		/*switch~case문 사용
		 * a,e,i,o,u -> 모음
		 * 나머지 -> 자음
		 * 잘못 입력했을 경우 처리
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳을 입력해주세요.=>");
		String str=sc.next();
		char word=str.charAt(0);
		// char wor=sc.next().charAt(0); 한줄로도 가능!
		
		switch (word) {
		case 'a', 'e', 'i','o','u','A','E','I','O','U':
			System.out.println(word+"는 모음입니다.");
			break;
		case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z','B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z' :
			System.out.println(word+"는 자음입니다.");
		break;
		default:
			System.out.println("알파벳이 아닙니다! 다시 입력해주세요!");
			return;
		}
		
		//-------------------------------(강사님풀이 이상해...)
		System.out.println("문자를 입력해주세요.=>");
		String s=sc.next();
		char w=s.charAt(0);
		
		switch (w) {
		case 'a', 'e', 'i','o','u','A','E','I','O','U':
			System.out.println(w+"는 모음입니다.");
			break;
		default:
			System.out.println(w+"는 자음입니다.");
			return;
		}
	

	}

}
