package day05;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		//ArithmeticException 연산오류 : 나누기를 하는데 0으로 나누었다는 내용. 분모가 0이 될 수 없기 때문
		/*for(int i=1;i<=5;i++) {
			int a=50/(i-3);
			System.out.println("a="+a);
		}//for
		
		System.out.println("####매우 중요한 코드####");*/

		/*아래 프로그램에서 발생한 오류를 try~catch절로 처리해보세요
		 * 단)ExceptionTest2에서는 for루프 바깥쪽에서 try~catch로 잡아보고
		 *   ExceptionTest2에서는 for루프 안쪽에서 try~catch로 잡아보고
		 *   "분모가 0이면 안됩니다!!"
		 */
		
		try {
		for(int i=1;i<=5;i++) {
			int a=50/(i-3);
			System.out.println("a="+a);
		}//for
		}catch(ArithmeticException e) {
			System.out.println("연산오류!!: 분모가 0이어선 안됩니다!!");
		}
		System.out.println("####매우 중요한 코드####");
		
		//반복문 밖에서 try catch잡으면 오류잡고 반복끝남
		
	}//

}//
