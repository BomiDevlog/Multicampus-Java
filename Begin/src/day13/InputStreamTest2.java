package day13;
import java.io.*;
//System.in : 키보드와 노드 연결
//System.out : 콘솔과 노드 연결
public class InputStreamTest2 {

	public static void main(String[] args) 
	throws IOException
	{
		int n=0;//
		int cnt=0;//카운트 센다 바이트수
		System.out.println("입력하세요 => ");
		//달걀(데이터)을 1개씩 이동(1byte씩 이동)
		while((n=System.in.read())!= -1){ //Ctrl+C or Ctrl+D 입력하면 -1을 반환=>강제종료
			//n이 =1이 아닐때 까지 계속 읽으면서 반복문 돌아
			//System.out.println("n: "+n); 아스키코드값
			//System.out.println("n: "+((char)n)); //문자그대로 한글자씩. 엔터는 두칸 비어 나옴/1byte대로 나오는데 한글은 2byte라서 깨짐
			System.out.write(n); //문자그대로 내보냄 한글도 그대로 나옴. 2byte단위로 출력하기때문//Stream쓸땐 write가 더 유용
			cnt++;
		}
		System.out.println(cnt+"bytes 읽음");
		
		System.in.close();
		System.out.close();// 노드연결 후에는 노드를 닫아주어야함/그동안은 안했지만ㅎ

	}

}
