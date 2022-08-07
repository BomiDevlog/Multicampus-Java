package day05;

public class ExceptionTest {

	public static void main(String[] args) {
		/*예외 처리 방법
		 * [1] Handle : try~catch절 사용
		 * [2] Declare : throw절을 사용
		 */
		
		String[] fruits= {"수박", "멜론", "사과", "배"};
		try {
			for(int i=0;i<5;i++) {//인덱스의 범위에 오류를 만들어놓았음. Index 4 out of bounds for length 4
				System.out.println(fruits[i]);
			}//for
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외처리코드를 입력
			System.out.println("배열의 인덱스 범위가 초과되었습니다!!"); //개발자에게 디버그하라고 알려주는 내용으로.
		}
		System.out.println("### 반드시 실행되어야 하는 중요한 코드입니다###"); //try~catch없을때, 오류때문에 실행중단되어 마지막 문장이 출력안됨

	}//

}//
