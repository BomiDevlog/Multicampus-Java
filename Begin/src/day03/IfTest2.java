package day03;
//java.util.Scanner 클래스를 이용해서 입력받아보자
import java.util.Scanner;
/* if(조건식){
 *	실행문
 *}else{
 *	실행문
 *}
 * -----------------
 * 다중 if ~ else if~else if~~else
 */

public class IfTest2  {
	
		public static void main(String[] args) {
			
	//Scanner: 클래스형(참조형)=>new 연산자를 이용해서 객체를 생성해서 사용해야 한다ㅏ
	Scanner sc=new Scanner(System.in); //in입력하면 모양이 변한다
	//System.out : 출력
	//System.in : 입력
	System.out.println("정수를 입력하세요=>");
	int input =sc.nextInt(); //정수를 입력받아서 사용자 입력한 값을 반환 한다 //소수를 입력하면 에러
	//nextFloat(), nextDouble(), nextLong()
	System.out.println("input: "+input); //결과값 input: 500
	System.out.println("The end~~~");
	
	
	//[예제] input값이 짝수이면 "짝수입니다"를 출력하는 문장을 if문으로 작성해보세요
	// 나누기/가아니고 %가 0이면 짝수 1이면 홀수라는 조건 설정
	if (input%2==0) {
		System.out.println(input+"짝수입니다."); 
	}else
		System.out.println(input+"은 홀수입니다");
	System.out.println("The end~~~"); //조건과 상관없이 실행
	
	
	
	//******************************************************
	Scanner si=new Scanner(System.in);
	System.out.println("정수를 입력=>");
	int input2 =si.nextInt();
	System.out.println("input2="+input2);
	
	if(input2%2==1) {
		System.out.println(input2+"은 홀수");
	}else {
		System.out.println(input2+"은 짝수");
	}
 
	
	
		}


}
