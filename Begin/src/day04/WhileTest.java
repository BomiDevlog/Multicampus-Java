package day04;
import java.util.*;

public class WhileTest {

	public static void main(String[] args) {

		/*주제어문 세번째. While문
		 * 
		 * 변수선언문
		 * while(조건식)
		 * {
		 * 		실행문;
		 * 		증감식;
		 * }
		 * 
		 * 조건식이 true이면 실행문을 실행한다.
		 * 조건식이 false이면 while블럭을 벗어난다.
		 * 
		 */
		
		int a=1;
		while(a<5) {
			System.out.println("Hello~~"+a);
			a++;
		}//while의 끝 //a=1~4
		System.out.println("The end~~"+a); //a=5
		/////증감식이 없으면 a가 1이니, 항상 트루라서 Hello~~1만 나오며 무한루프
		
		
		//[간단한 문제] int b=10;,  b값이 0보다 클때 까지 반복하며 "Java:"+b 출력하되 감소식은 2만큼 감소시키세요
		
		int b=10;
		while(b>0) {
			System.out.println("Java: "+b);
			b-=2;
		}
		System.out.println("The end: "+b);
		
		
		//[문제1] 구구단의 단을 입력받아서 구구단을 출력하세요. (단, while문 이용)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("구구단 몇 단을 출력할까요=>");
		int dan=sc.nextInt(); 
		
		int in=1;
		while(in<10) {
			System.out.println(dan+"x"+in+"="+dan*in);
			in++;
		}
		//18,2485 등을 입력해도 1~9를 곱한 구구단이 출력됨
		
		//[문제2] 구구단의 전체를 출력해서 while문을 중첩해서 출력하세요
		
	
		
	
		
		//이창환
	
	int j = 2; //단
	int k = 1; //곱
	while(k<10) { //곱하는 1~9
		while(j<10) { //단2~9
			System.out.print(j+" x "+ k + " = "+j*k +"\t ");
			j++; //단수증가
		}
		System.out.println(); //줄바꿈
		j = 2;//단수초기화
		k++; //곱 증가
	}

	/*
	 * int j = 2; 
	 * int k = 1; 
	 * while(k<10) { //바깥에서는 뒤에오는 1~9 
	 *  j = 2; //j값을 다시 초기화해야하는 게 중요포인트 
	 * while(j<10) { //안쪽에서는 앞에오는 2~9 
	 * System.out.print(j+" x "+ k + " = "+j*k +"\t "); j++; }
	 * System.out.println(); 
	 *
	 * k++; 
	 * }
	 */

		
		
		//정유진
		int no1=1;
		while(no1<=9) {
			int no2=2; 
			while(no2<=9) {
			System.out.print(no2+"x"+no1+"="+no1*no2+"\t");
				no2++;
			}System.out.println();
			no1++;
		}System.out.println("끄으읏");

		
		
		//수업 이어서 
		
		//while(true) {
		//	System.out.println("무한 루프 돕니다");
		//}
		
		
		
		
		
		
		
		
		
		
		
	}//main()----------

}//class-----------------
