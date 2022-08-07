package day12;
/*사용자 정의 예외 클래스 만들기
 * [1] Exception을 상속받는다
 * [2] 생성자를 구성해서 생성자 안에서 super("예외메시지")를 호출해서 예외 메시지를 등록한다.
 */

public class NotSupportedNameException extends Exception { //[1]

	public NotSupportedNameException() {//[2]
		super("NotSupportedNameException");//예외 메시지 등록
	}
	public NotSupportedNameException(String msg){ //생성자 오버로드
		super(msg);
	}

}/////////// 첫 단계 / 아직 메모리에 올려 사용하는 단계는 하지 않음

