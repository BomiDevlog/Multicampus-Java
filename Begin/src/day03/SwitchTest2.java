package day03;
import java.util.Scanner;


public class SwitchTest2 {

	public static void main(String[] args) {
		
		/* 월(month)을 입력해서 해달 월의 일수(days)를 출력하는 프로그램을 작성하세요
		 * 1,3,5,7,8,10 : 31일
		 * 2 : 28일 
		 * 4,6,9,11 :30일
		 *  월을 스캐너로 입력받아서 출력하라
		 *  switch~case 구문을 이용해서 구현하세요
		 * */ //간단한 문제

		Scanner sc=new Scanner(System.in); //스캐너 하나 생성하기
		System.out.println("월을 입력하세요[1~12]=>"); //입력할 출력문
		int month=sc.nextInt();//변수를 주고
		int days=0; // 월에 따라 일수가 달라짐
		
		//[문제] "1월은 31일까지 있습니다" 형식으로 출력, 이외 숫자는 그런 달은 없습니다 문구
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 :
			days=31; //char는 ''감싸야하고 숫자는 그냥 입력가능
		break;
		case 2 :
			days=28;
		break;
		case 4, 6, 9, 11 :
			days=30;
			break;
		default:
			System.out.println("없는 달 입니다");
			return;
		}
		System.out.println(month+"월은 "+days+"일까지 있습니다");		
		
		
		//===============================================
		
		Scanner si=new Scanner(System.in);
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
	
		
		
		
	}//

}//
