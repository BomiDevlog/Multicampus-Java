package day06;
import java.io.*; //import입력하면 IOException없어짐

public class ExceptionTest2 {

	//[1] 직접 Handle해서 예외처리하는 방법
	public static void input()
	{
		//IOException : 컴파일 타입 에외
		try {
		//int n=System.in.read(); //스캐너가 없을 때 입력값을 쓰던 방식 //1byte만 받기때문에 abc입력해도 첫글자만 반환해서 int로 아스키코드값 n:97
			char n=(char)System.in.read(); //char로 형변환하여 문자그대로 n:a //abc해도 n:a
			System.out.println("n: "+n);
		}catch(IOException e) {
			System.out.println("입출력 에러 발생"+e);
		}
		
	}//-------------------------------------------
	//[2] Declare해서 예외처리하는 방법
	//=> sub() 메소드를 호출한 쪽으로 예외 처리를 넘긴다.
	//try~catch가 직접 해결하지만, 떄떄로 여러 프로그램이 연결되어있을 때 client에게 보여주려고 throws절로 해서 넘기다가 최초였던 프로그램에서 try~catch로 잡음
	public static void sub() throws IOException
	
	{
	int n=System.in.read(); 
	System.out.println("n: "+n); //형변환 안해서 아스키코드로 나옴
	}
	
	
	
	public static void main(String[] args) throws IOException {
		//input()메소드 호출해보기 //static이고 void니까 [클래스명.메소드]
		System.out.println("입력하세요=>");
		ExceptionTest2.input(); //에러없음
		
		//sub()메소드 호출해보기
		ExceptionTest2.sub(); //에러남. 호출한 쪽으로 IOException이 날라왔기때문에. 결국 또 throws로 넘기던가 아예 try~catch로 잡아야함
		//throws로 declare하면 에러 없어짐. 메인을 호출한 JVM에 에러가 넘어감(즉, throws절은 예외가 제대로 처리되지않음)
		
		

	}//

}//
