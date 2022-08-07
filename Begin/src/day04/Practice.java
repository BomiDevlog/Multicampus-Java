package day04;

public class Practice {

	public static void main(String[] args) {

		
		int age;
		age=28;
		System.out.println("age="+age);
		
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal+bVal); // 자료형이 달라도 덧셈가능!
		
		char ch1='Z';
		System.out.println(ch1);  //그대로 A
		System.out.println((int)ch1); //아스키코드 65 숫자화
		
		char ch2=38; //
		System.out.println(ch2); //char라서 홑따옴표없으면 숫자가 아닌 아스키코드값으로 이해함 B
		System.out.println((int)ch2); //아스키코드로해석해 다시 66숫자
		
		char ch3='9';
		System.out.println(ch3);//홑따옴표해서 문자그대로 출력
		System.out.println((int)ch3); //54 아스키코드값으로 해석해서 문자의 정수
		
		int ch4=97;
		System.out.println(ch4);
		System.out.println((char)ch4); //아스키코드로 해석한 문자값
		
		
		
		
		String regNo="220703-2222222";
		System.out.println(regNo);
		
		char ch=' '; //공백불가 스페이스바 해야함
		String str=""; //공백만해도됨
		
		
	}

}
