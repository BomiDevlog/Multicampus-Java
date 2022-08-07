package day02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double If=1;
		System.out.println(If); //1.0
		
		char ch='A';
		short s=(short)ch; 
		System.out.println(ch); //A
		System.out.println(s);//65  아스키코드
		
		
		//패키지만들어서
		// day03

		//public class IfTest
		
		//public static void main(String[] args) {
		
		/*if(조건식){
		 *    실행문;
		 *    실행문;
		 *    실행문;
		 *  }
		 *  
		 *  조건식이 true이면 실행문 실행
		 * 
		 */
		
		int a=3;
		if(a>0) {
			System.out.println("a는 양수입니다"); //true일 때 실행
		System.out.println("The End~~~~"); //조건과 상관없이 실행되는 종료문장
		}
		//중괄호 없을 때. true이면, a는 양수입니다 The End~~~~/ a=-3이라 false이면 The End~~~~
		//중괄효 있을 때, true이면, a는 양수입니다 The End~~~~/ a=-3이면 false라 아무실행안됨
		
		//tab: 들여쓰기
		//shift+tab: 내려쓰기
		
		
		//--------------------------
		//클래스새로 만들어서
		
		//package day03;
		//java.util.Scanner 클래스를 ㅁ이용해서 입력받아보자
		//import java.util.Scanner;

		//public class IfTest2 {

			//public static void main(String[] args) {
		//Scanner: 클래스형(참조형)=>new 연산자를 이용해서 객체를 생성해서 사용해야 한다ㅏ
		Scanner sc=new Scanner(System.in); //in입력하면 모양이 변한다
		//System.out : 출력
		//System.in : 입력
		System.out.println("정수를 입력하세요=>");
		int input =sc.nextInt(); //정수를 입력받아서 사용자 입력한 값을 반환 한다
		//nextFloat(), nextDouble(), nextLong()
		System.out.println("input: "+input); //결과값 input: 500
		
		
		
		//[예제] input값이 짝수이면 "짝수입니다"를 출력하는 문장을 if문으로 작성해보세요
		System.out.println("The end~~~");//가 작성되도록 만드세요
		
		// 나누기/가아니고 %가 0이면 짝수 1이면 홀수라는 조건 설정
		//if (input%2==0) {
			//System.out.println("input+"짝수입니다."); //true이면 나오고
		//}
		//System.out.println("The end~~~");
		

	}

}
