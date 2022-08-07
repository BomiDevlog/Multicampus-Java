package day13;
import java.io.*;
/*FileInputStream
 * - 1 byte기반 스트림
 * - Node 스트림 => 파일과 노드 연결한다
 * - 이미지, 멀티미디어, 바이너리 파일 등을 읽을 때 사용한다.
 * 
 * byte배열에 담아 읽고 쓰세요
 * [실습] myicon.PNG파일을 카피해서 c:/myjava/copy.PNG로 내보내기
 */

public class FileInputSteamTest2 {

	public static void main(String[] args) throws IOException
	{
		//String fileName="C:\\Users\\PC\\git\\firstGit\\Begin\\src\\day13\\InputSteamTest.java";
		//String fileName2="C:\\Users\\PC\\git\\firstGit\\Begin\\src\\day13\\InputStreamTest_Copy.txt"; //복사할 경로
		String fileName="C:\\Users\\PC\\git\\firstGit\\Begin\\myicon.png";
		String fileName2="C:\\Users\\PC\\git\\firstGit\\Begin\\copy.png";
		//파일과 노드 연결
		FileInputStream fis=new FileInputStream(fileName);
		FileOutputStream fos=new FileOutputStream(fileName2);//복사한 파일의 목적지
		int n=0;
		int cnt=0, total=0;
		byte[] arr=new byte[1024];
		
		while((n=fis.read(arr))!=-1){//n: 파일 데이터가 담긴다
			//파일의 끝에 도달하면 -1을 반환한다
			//System.out.write(arr,0,n);
			//System.out.flush();
			fos.write(arr,0,n);
			fos.flush();
			
			cnt++;
			total+=n;
		}
		System.out.println("총 파일의 크기: "+total+"bytes");
		System.out.println(fileName2+"에 카피 완료!");
		fis.close();
		fos.close();
		System.out.close();//노드 닫음

	}

}
/*
 * String fileName = "src/day13/InputStreamTest.java";
		//파일과 노드 연결.
		FileInputStream fis = new FileInputStream(fileName);
		int n = 0;
		int cnt = 0;
		byte[] arr = new byte[100];
		int total = 0;
		while((n=fis.read(arr)) != -1) {	//n: 파일데이터가 담긴다.
			//파일의 끝에 도달하면 -1 을 반환한다.
			System.out.write(arr, 0, n);
			System.out.flush();
			cnt++;
			total += n;
		}
		System.out.println("Entire File Size : "+total+"bytes.");
		fis.close();
		System.out.close();

	}

}

 */

