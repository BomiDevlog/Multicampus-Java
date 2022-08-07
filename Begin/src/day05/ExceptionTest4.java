package day05;
/* try블럭 하나에 catch절은 여러 개 올 수 있다.
 * 그러나 이 떄 catch순서를 주의해야 한다.
 * -부모 자식의 상속관계가 있는 예외일 경우
 * 자식을 먼저 catch하고 부모 예외를 나중에 catch해야한다.
 * 
 */

public class ExceptionTest4 {

	public static void main(String[] args) {
		//args : String타입의 배열. 명령줄 인수
		//컴파일 : javac.ExceptionTest4.java
		//실행 : java ExceptionTest4 안녕 잘가
		//						args[0] args[1]
		
		//args를 바꿔줄 수 있다
		//도스창으로 실행확인함 java.day05 ExceptionTest4 안녕 반가워~
		//이클립스에서 Run눌러서 Configurations눌러서 x=arguments에서 입력해주면 콘솔창에 내용이 바뀜
		
		try {
		System.out.println("args[0]="+args[0]); //국어
		System.out.println("args[1]="+args[1]); //영어
		//ArrayIndexOutOfBoundsException: 명령줄을 안주어서 에러
		
		/*}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 입력해야 합니다!");
		} 아래로 위치이동 */
		
		//총 합계점수 구해 출력하세요
		//평균 점수 구해 출력하세요
		//java.lang.Integer클래스==>Wrapper class
		//int(기본자료형)==>Integer
		//public static in parseInt(String s):
		//문자열 s를 정수로 변환시켜 반환해주는 메소드
		//public static int parseInt​(String s) //API는오라클 닷컴에서 찾는다 (파시인트. 인티저 라고 읽음)
		//static이 붙으면 변수이름앞에 클래스명을 붙임
		
		//("총 합계점수="+args[0]+args[1])라고하면 9988 문자처럼 붙어서 나옴 입력값이 String이라서.
		
		int kor=Integer.parseInt(args[0]); 
		int eng=Integer.parseInt(args[1]);
		int sum=kor+eng;
		int avg=sum/args.length;
		
		System.out.println("총 합계점수="+sum);
		System.out.println("평균점수="+avg); //int라서 정수값이고 소수점은 버림. 
		System.out.println(avg/0); //ArithmeticException 연산오류
		//aa bb입력하니 총점은 aabb 문자열결합. 평균점수에서 에러난다 //NumberFormatException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 입력해야 해요!");
		}catch(NumberFormatException e) {
			System.out.println("점수는 숫자로 입력해야 해요!!!"); //상속관계아니라서 순서상관없음
		}catch(Exception e) {  //부모인 Exception을 가장 마지막에. /부모를 가장 앞에 둔다면, 이미 모든 예외처리되서 뒤의 자식내용은 도달할수 없는 블럭이 되어버림
			System.out.println("기타 예상치 못한 예외 발생: "+e);
		}

	}//

}//
