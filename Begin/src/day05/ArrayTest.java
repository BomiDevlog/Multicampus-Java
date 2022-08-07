package day05;
/* 지난 주 복습
 * 기본자료형(primitive type)
 * -숫자형 (정수형-byte, short int, long),(실수형-float, double)
 * -문자형 char 
 * -논리형
 * 
 * 참조형(reference type)- 클래스형, 인터페이스형, 배열
 * -String(문자열)
 * -Date
 * -Scanner
 * 예) String s=new String(); // String s2="hello"; 예외로 스트링은 값들이 올라가는 리터럴 풀에 올라갈수 있음
 * Date d=new Dant();
 * Scanner sc=new Scanner(); new연산자로 새로운 객체생성해서 사용!
 * 
 * 제어문 
 * -if, if~else, if~else if~else
 * -switch~case 경우가 나뉠때
 * -반복문: for, while, do~while
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		System.out.println("1.-----------------------");
		int a=1; //기본자료형-정수형
		int [] b; //참조형-1차원 배열
		
		/*배열(array) -참조형자료형
		 * [1] 선언
		 * [2] 메모리 할당
		 * [3] 초기화
		 */
		
		//int [] c; //[1]배열 선언 
		int c []; //라고 표기할 수도 있다
		//int c [3]; (x)  자바에서 선언할 때는 괄호를 비워야함
		
		//[2] 메모리 할당 => new 연산자를 이용
		c=new int[3]; // 배열의 크기를 정한다 // stack의 c가 heap공간의 index에 배열됨
		
		//[3] 초기화 : index를 이용해서 데이터를 저장한다
		//			 이 때 index는 0부터 시작한다
		c[0]=10;
		c[1]=20;
		c[2]=30;
		
		System.out.println(c); //배열의 주소값(해시코드값)을 출력
		System.out.println(c[0]); //10
		System.out.println(c[1]); //20
		System.out.println(c[2]); //30
		
		System.out.println("2.-----------------------");
		//[1][2] 선언과 동시에 메모리 할당
		//[3] 초기화
		//사용자가 지정해서 스캐너입력할 때 이 방법을 사용
		
		double arr[]=new double[4]; //[1][2]
		//배열은 초기화를 하지 않으면 디폴트값들이 저장되어 있다.
		
		
		System.out.println("arr[0]="+arr[0]); //0.0
		System.out.println("arr[3]="+arr[3]); //0.0
		
		arr[0]=.897; //소수 0.897
		arr[1]=450e-2; //과학적 지수 표기 4.5
		arr[2]=0x12; //정수값. 16진수 18.0 //정수인데 더블로 프로모션되어 18.0으로 표기
		arr[3]='A';  //char의 문자값 65.0 아스키코드로 해석
		
		for(int i=0;i<4;i++ ) {//index로 사용할 변수 i를 선언하며 0부터 시작한다
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
		/*char 타입의 1차원 배열을 선언하고
		 * 아래와 같은 문자들을 저장하세요
		 * 'J', 'a', 'v', 'a'
		 * for루프를 이용해서 출력해보기
		 */
		
		char ch []=new char[5]; //정확한건 크기 4지정.
		ch[0]='J'; 
		ch[1]='a';
		ch[2]='v';
		ch[3]='a';
		//ch[4] 지정안하면 디폴트값인 '\u0000'가 되어 공백
		
		//배열의 크기를 알 수 있는 속성: length 
		System.out.println("ch.length="+ch.length);
		
		for(int i=0;i<4;i++ ) { //배열할 때는 배열보다 작게 < 해야함  범위를 6이라고하거나 <=라고하면 에러.
			System.out.println("ch["+i+"]="+ch[i]);
		}
		
		System.out.println("3.---------------");
		//[1][2][3] 단계를 한꺼번에 시행. 선언과 동시에 메모리 할당하고 초기값지정.
		//배열에 저장할 값이 정해져있을 때는 이렇게 가능
		
		char [] ch2={'B','y','e'};
		System.out.println("ch.length="+ch2.length);
		
		for(int i=0; i<ch2.length;i++) {
			System.out.println(ch2[i]);
		}
		
		
		

	}//

}// 자바는 클래스 내에 모든 코드를 입력해야 한다. C의 경우에는 클래스 외에도 가능
