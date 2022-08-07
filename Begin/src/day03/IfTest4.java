package day03;
import java.util.*;

public class IfTest4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("0~9, 알파벳, 기타 문자를 1자만 입력하세요=>");
		String input=sc.next();
		//String next() : 문자열을 입력받음
		System.out.println("input: "+input); //Test, 5212, @@@ 등 문자배열도 잘 들어옴
		//String 클래스를 가진 메소드:
		/* 
		 * char charAt(int index): 문자열의 특정 index위치의 문자를 추출하여 반환한다
		 * 
		 * "Hello"++
		 * 
		 */
		char ch=input.charAt(0); //문자열의 첫 문자를 추출 
		System.out.println("ch: "+ch);//input: Hello/ ch: H//input: 4519 ch: 4//input: @#$%안녕 ch: @
		
		/*[문제] ch값이 0~9 값이면 "숫자입니다"를 출력
		 * 알파벳 대문자 또는 소문자이면 "알파벳이군요"를 출력
		 * 그 외의 문자는 "기타 문자입니다" 출력
		 */
				
		
		//Editplus에서 아스키코드 값을 찾아서 ch의 조건을 넣는다 //char는 아스키코드로 문자를 숫자로 체크하니까
		/*
		 * if(ch >= 48 && ch <= 57) { 
		 *   System.out.println("숫자입니다"); 
		 * } else if((ch >= 65 && ch <= 90) || (ch>=97 && ch<=122)) { //대문자범위와 소문자범위의 사이를 빼주어야함
		 *   System.out.println("알파벳이군요"); } 
		 *  else { System.out.println("기타 문자입니다"); }
		 */
		//블럭설정 후 Ctrl+Shift+/ :주석처리

		
		if(ch>='0'&& ch<='9') {
			System.out.println("숫자입니다");
		}else if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')) {  //자바는 아스키코드안해도 자동으로 범위설정한다 
			System.out.println("알파벳이군요");
		}else {
			System.out.println("기타 문자입니다");
		}
		
		 
		/*if(ch>='0' && ch<=='9') {
			System.out.println("숫자")
		}else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
			System.out.println("알파벳")
		}else
		*/

		 //---------------------------------------------------------------
		
		Scanner si=new Scanner(System.in);
		System.out.println("숫자나 문자를 입력하세요 특수문자나 문장도 가능");
		String input2=si.next();
		System.out.println("input2="+input2);
		
		char ch2=input2.charAt(0);
		System.out.println("ch2="+ch2);
		
		if(ch>='0' && ch<='9') {
			System.out.println("숫자");
		}else if ((ch>='A'&&ch<='Z')||(ch>='a' &&ch<='z')){
			System.out.println("알파벳 대문자 또는 소문자");
		}else {
			System.out.println("특수문자");
		}
		 



		
		
		
		
		
		
		
		
		
		
		

	}

}
