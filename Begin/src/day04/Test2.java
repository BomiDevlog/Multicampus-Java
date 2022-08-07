package day04;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		
		
		//반복문 이용해서 입력값들의 문자를 추출한 뒤, 해당 문자가 숫자 범위가 맞으면 "숫자입니다"
		//한 개라도 숫자가 아닌 문자가 있으면 "숫자가 아닙니다. 다시 입력하세요" 출력하세요
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요=>");
		String value=sc.next();
		char ch=' ';
	    boolean isNumber=true;
		
		for(int i=0;i<value.length();i++) {
			ch=value.charAt(0);
			if(!('0'<=ch && ch<='9')) {
				isNumber=false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
		}else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
			
	

		
	}

}
