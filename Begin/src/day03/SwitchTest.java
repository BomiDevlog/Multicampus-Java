package day03;
/* Switch ~ case 문 :
 * 
 * switch() 괄호 안에 들어가는 값, 변수, 수식 ==> int이하의 자료형 또는 String만 사용가능하다 
 * 						(byte short char int String 가능) (long float double 안됨)
 * 
 * switch(값| 수식| 변수){
 * 		case 값1:
 * 			실행문;
 * 			break;
 * 		case 값2:
 * 			실행문;
 * 			break;
 * 		...
 * 		default:
 * 			실행문;
 * }  //중괄호 사이를 스위치블럭이라고 한다
 * 
 */

import java.util.*;
public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("연산자를 입력하세요[+,-,*,/]=>");
		String operation=sc.next();
		
		
		/*  char oper='+';//+일때 result=8//-일때 -2//*일 때 15// /일때 0// 
		int a=3;
		int b=5;
		int result=0;
		switch(oper) {
		case '+': //케이스 ㅇㅇ인 경우라면/ 이라고 읽음
			result=a+b;
			break; //여기를 주석처리하면. oper을 +로 주어도 그 다음 경우까지수행해서 -경우를 수행해서 결과값-2가나옴//switch구문에서 break는 같이 나옴
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break; //case인 경우를 만나면 중괄호를 이탈해서 (디폴트내용안하고) 바로 다음 결과로.
		case '/':
			result=a/b;
			break;
		default:
			System.out.println("없는 연산자입니다.");
		}
		System.out.println("result: "+result);*/ 
		
		char oper=operation.charAt(0);
		System.out.println("정수 1 입력=>");
		int a=sc.nextInt();
		
		System.out.println("정수 2 입력=>");
		int b=sc.nextInt();
		
		int result=0;
		switch(oper) {
		case '+': 
			result=a+b;
			break; 
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break; 
		case '/':
			result=a/b;
			break; //소속된 블럭{}을 이탈한다(벗어난다)
		default:
			System.out.println("없는 연산자입니다.");
			return; //보조 제어문// return: 제어 흐름을 되돌린다. return을 갖는 메소드 (여기서는 main())을 호출한 쪽으로 돌아간다
										//main을 호출하는건 JVM. 여기로 돌아간다는 건 끝난다는 뜻이다?
		}
		System.out.println(a+operation+b+"="+result);
		
		
		/* 리턴을 했을 때 
		 * 연산자를 입력하세요[+,-,*,/]=>%
		정수 1 입력=>
		1
		정수 2 입력=>
		2
		없는 연산자입니다.
		
		 */
		
		/*연산자를 입력하세요[+,-,*,/]=>
		<<
		정수 1 입력=>

		1
		정수 2 입력=>
		2
		없는 연산자입니다.
		1<<=0
		*/
//================================================================================
		Scanner si=new Scanner(System.in); //스캐너를 쓰겠습니다
		System.out.println("연산자를 입력[+,-,*,/]=>"); //두줄씩 세트 
		String input=si.next();//input입력
		
		char in=input.charAt(0);//첫글자를 따겠습니다 //input에서 첫글자in
		System.out.println("정수1 입력=>"); //a값
		int a2=si.nextInt();
		
		System.out.println("정수2 입력=>");//b값
		int b2=si.nextInt();
		
		int result2=0;//레절드 기본값
		switch(in) {
		case '+' :
			result2=a2+b2; //스위치 in이 +라면 레절트는 이렇게 계싼
			break;
		case '-' :
			result2=a2-b2;
		break;
		case '*' :
			result2=a2*b2;
		break;
		case '/' :
			result2=a2/b2;
			break;
		default:
			System.out.println("없는 연산자");
			return;
		}
		System.out.println(a2+input+b2+"="+result2);
		



	}///main

}////
