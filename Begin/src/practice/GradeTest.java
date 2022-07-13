package practice;
import java.util.Scanner;
public class GradeTest {

	/*문제
	 * 점수입력 0~100
	 * 학년입력 1~4
	 * 60점 이상 합격 미만 불합격
	 * 4학년은 70이상 합격
	 */

	public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("점수를 입력하세요[0~100]=>");
				float score =sc.nextFloat();
				System.out.println("점수: "+score+"점");
						
				System.out.println("학년을 입력하세요[1~4]=>");
				int year =sc.nextInt();
				System.out.println("학년: "+year+"학년");
						
						
				String pass=""; 
				if ((year==4 && score>=70)||(year!=4 && score>=60)) {     
					pass="합격";
				}else {
					pass="불합격"; 			
				}
				System.out.println("학점: "+pass);
						
						
							


	}//

}//
