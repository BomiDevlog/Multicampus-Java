package day13;
/*  System.in: InputStream타입
- 1byte 기반 스트림
- 노드 스트림: 키보드와 노드 연결하는 스트림
- public int read() :
  바이트 입력을 리턴하고 입력이 종료(Ctrl+C 또는
   Ctrl+D)되면 -1을 리턴한다.
*/
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		int input=0;
		int count=0;
		System.out.println("입력하세요=>");
		try {
			while(true) {
				input=System.in.read();//컴파일타입 Exception발생해서 예외처리해야함
				//키보드 입력
				System.out.println("input: "+input);
				count++;//몇 바이트 입력 받았는지 센다
				if(input=='x') break;
			}
			System.out.println("총 "+count+"바이트 입력받음");
		}catch(IOException e) {
			e.printStackTrace();
		}
		/* ABCDE(엔터)
			input: 65 :아스키코드로 ABCDE
			input: 66
			input: 67
			input: 68
			input: 69
			input: 13 :두개는 엔터값 \r 캐리지리턴
			input: 10 : 줄바꿈 \n
			윈도우에서는 2개나오고 맥에서는 10만 나옴
		 */

	}

}
