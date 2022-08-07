package day03;

public class Test {

	public static void main(String[] args) {

		//연습문제5/ 4-1
		//(1)
		int x=11;
		if(x>10 && x<20)
			System.out.println("##true1");
		//(2)
		char ch='A';
		if(!(ch==' ' || ch=='\t'))
		{
			System.out.println("true2");
		}
		//다른 풀이
		if(ch!=' '&&ch!='\t') {
			System.out.println("공백 아니고 탭도 아님");
		}
		//(3)
		char ch2='x';
		if(ch2=='x'||ch2=='X') {
			System.out.println("xX맞다");
		}
		//(4)
		if(ch>='0'&&ch<='9')
			System.out.println("숫자입니다");
		
		//iftest4참고 5번답
		if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z')) {
			System.out.println("알파벳입니다");
		}
		
		//6번 윤년문제
		int year=2020;
		if((year%400==0)|| (year%4==0 && year%100!=0)) {
			System.out.println(year+"년은 윤년입니다");
		}
		//7번
		
		boolean powerOn=false;
		if(powerOn==false) {
			System.out.println("powerOn은 false");
		}
		if(!powerOn)
			System.out.println("powerOn은 false");
		
				//8번
				//== : 참조형에서는 주소값을 비교한다. 기본자료형에서는 값을 비교
		
		//String str="yes"; //yes나옴
		String str=new String("yes");
		//문자열의 내용값을 비교하는 메소드;
		//boolean equals(Object o): 문자열의 내용이 같으면 true를 반환한다
		//if(str=="yes") { //no나옴
		if(str.equals("yes")) { //OK나옴
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		
		
		
		
		
	}//

}//
