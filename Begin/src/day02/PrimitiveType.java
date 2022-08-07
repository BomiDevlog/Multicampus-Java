package day02;

public class PrimitiveType {
	
	public static void main(String[] args) {
		System.out.println("기본자료형--------------------------");
		System.out.println("");//한 줄 공백이 생김
		// 단축키 사용법 Ctrl + D : 현재 커서행을 삭제
		//Ctrl+S : 저장 => 자동으로 컴파일됨(javac)
		//Ctrl+F11 : 현재 파일을 실행시킴 (콘솔창이 뜬다)(java 실행)
		//Alt + 방향키 위아래 : 현재의 커서행이 위아래로 이동한다
		//엔터로 띄워도 결과값반영안됨
		
		int a=10;
		int b=010;// 정수(8진수) : 8진수는 앞에 0을 접두어로 붙인다 (일의 자리가 0~7) (즉 8진수 010=10진수 8)
		System.out.println("a="+a); 
		System.out.println("b="+b);
		int c=0123; // (8^0x3 + 8^1x2 + 8^2x1)=3+16+64=83
		System.out.println("c="+c);
		
		int d=0x12;// 정수(16진수) : 16진수는 앞에 0x를 접두어로 붙인다
		// 0~15: 0~9 아라비아숫자로 표기, A(10),B(11),C(12),D(13),E(14),F(15)로 표기
		int e=0x2ac; 
		System.out.println("d="+d);//1x16 +2=18
		System.out.println("e="+e);//2x16^2 +10x16^1 + 12x16^0 =512+160+12 =684 //16^2=256
		//프로그램에서 자주 안쓰이지만 아두이노에서 종종 쓰임
		
		char c1='a';
		System.out.println("c1="+c1);
		char c2='0';
		System.out.println("c2="+c2);
		//문자,숫자 그대로 출력
		
		//char c3=c1+c2; //인트로부터 차로 변환할 수 없다고 에러
		//int미만의 자료형(byte, short, char) => 연산에 사용되면 int로 자동변환이 일어난다
		
		//int c3=c1+c2;//아스캣코드의 숫자로 해석해서 더함
		//System.out.println(c3); //char가 int로 변환되고, 아스캣코드값으로 연산계산 a=97, 0=48// 97+48=145
		
		//char c3=(char)(c1+1);//결과값 b 다음 알파벳이 나옴
		char c3=(char)(c2+1);
		System.out.println(c3); //결과값1
		
		double d2=.456E+2;//0.456*10^2
		System.out.println(d2);
		
		
		
	}

}
