package day06;
/*
 * try{
 * }catch(){
 * 
 * }finally{
 *  }
 * 		finally블럭은 반드시 한 번은 수행되는 블럭이다.
 * 		뒤에 return문이 오더라도 한 번은 수행하고 제어권을 넘긴다. (중요코드는 finally문을 이용하자!) 
 * 		단, 예외가 있다. 시스템 종료 코드(System.exit(0);)가 있을 경우는 finally블럭이 실행되지 않음.
 *
 */

public class ExceptionTest {

	public static void main(String[] args) {

		
		try {
		//int num=args[0]; //스트링 타입이라 인트에 바로 넣어주면 에러
		int num=Integer.parseInt(args[0]); //인티저는 정수로 만들어준다
		System.out.println(50/num); 
		//명령줄인수를 안해서 배열오류  ArrayIndexOutOfBoundsException ~>Run configurations에서 arguments값입력하면 콘솔창 작동
		// 문자열 a 입력하면 NumberFormatException
		// 0입력하면 ArithmeticException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("##명령줄 인수를 1개 입력해주십시오##");
		}catch(NumberFormatException e) {
			System.out.println("##문자가 아닌 숫자를 입력해주십시오##");
			return; //main을 호출한 JVM으로 돌아가기때문에 프로그램이 종료됨 //finally 안하면 리턴되어 중요코드가 실행안됨!// return~> finally블럭 실행
		}catch(ArithmeticException e) {
				System.out.println("##0이 아닌 숫자를 입력해주십시오(분모가 0이 되어선 안됩니다)##");	
				System.exit(0);//시스템 종료 ~> finally 블럭 실행안됨 //System.exit(3),(-12) 등 사이숫자를 바꿔줘도 시스템종료 
		}catch(Exception e) {
			System.out.println("##기타 오류 발생##"+e.getMessage());
			//String getMessage(): 예외 메시지를 문자열로 반환한다. 디버그할 때 출력하여 사용.
		}finally {
			System.out.println("##반드시 실행되어야 할 코드입니다##"); //문자열 입력했을 때, 리턴이 있어도 중요코드 실행
		}
		System.out.println("The End~~~"); //리턴에 의해 실행안됨.
		
		
		
		
		
		
		
		
		
		
		
	}//

}//
