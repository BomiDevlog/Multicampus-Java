package day05;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
			try{
				int a=50/(i-3);
			System.out.println("a="+a);
			}catch(ArithmeticException e) {
				System.out.println("연산오류!!: 분모가 0이어선 안됩니다!!");
			}
		}//for  
		System.out.println("####매우 중요한 코드####");
		
		//반복문 안에서 try catch잡으면 오류잡고 계속 반복수행

		//들여쓰기 버릇들이기! 자바는 들여쓰기 안해도 인식하는데 파이썬은 들여쓰기 안하면 오류
		
		
	}//

}//
