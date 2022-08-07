package day05;
import java.io.*; 
public class PracticeSample {
	public static void input() 
	{
		//IOException : 컴파일 타임 예외
		try {
			//int n=System.in.read();
			char n=(char)System.in.read();
			System.out.println("n: "+n);
		}catch(IOException e) {
			System.out.println("입출력 에러 발생: "+e);
		}
	}//---------------------------
}