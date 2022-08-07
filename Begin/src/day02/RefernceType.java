package day02;
import java.util.Date;

public class RefernceType {
	
	public static void main(String[] args) {
		System.out.println("--참조형(refernce type)-------");
		/*[1] 클래스형 : String, Date...
		 * [2] 인터페이스형
		 * [3] 배열: String[], int[]...
		 * 참조형은 반드시 new 연산자로 객체를 생성해서 사용해야 한다
		 * 단, 예외가 있다. String의 경우 자주 사용되는 유형이므로
		 * 기본 자료형처럼 문자열 값(literal 리터럴)을 직접 할당할 수 있다.
		*/
		
		//참조형은 반드시 new 연산자로 객체를 생성해서 사용해야 한다
		String s1=new String("Java");
		System.out.println("s1="+s1);
		//java.util패키지라서 import를 안쓰면 오류
		Date today =new Date();//참조형의 클래스형 //날짜를 직접 입력하는게 아니라 정보를 참조//변수(today)가 객체의 정보(new Date)를 가리킨다
		System.out.println("today="+today);
		
		//기본 자료형처럼 (new를 안 쓰고) 직접 리터럴 할당
		String s2="Hello";
		System.out.println("s2="+s2); 
		System.out.println(s2.toUpperCase()); //대문자 투어퍼케이스
		System.out.println(s2.toLowerCase()); //소문자 투 로워케이스
		/*기본자료형: 주로 연산에 사용된다
		 * 참조형 : [데이터(변수) + 기능(메소드) ] 
		 * 	 */
		
		//문자열과 연산의 주의사항
		int a=20;
		int b=30;
		System.out.println(a+b+"<=합"); //50<=합 //기본자료형의 연산하고나서 문자열 배합
		System.out.println("합=>"+a+b);//합=>2030//문자열 먼저 배합하면 전부 문자열 배합
		System.out.println("합=>"+(a+b));//합=>50// 문자열 후에 연산하려면 소괄호함
		
	}

}
