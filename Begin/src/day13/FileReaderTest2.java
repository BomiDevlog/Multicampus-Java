package day13;
/*FileReader /FileWriter
 * - 2byte(문자) 기반 스트림
 * - 노드 스트림 (파일과 노드 연결)
 */
//FileReader로 읽고 /FileWriter로 내보낼 것
import java.io.*;
public class FileReaderTest2 {
//배열로 데이터
	public static void main(String[] args) 
	throws IOException
	{
		String fname="C:\\Users\\PC\\git\\firstGit\\Begin\\src\\day13\\FileInputSteamTest.java";
		//String fname="C:\\Users\\PC\\git\\firstGit\\Begin\\readme.txt";
		
		File file=new File(fname);
		File file2=new File("C:\\Users\\PC\\git\\firstGit\\Begin\\FileInputSteamTest_copy.txt"); //카피가 생기는데 또 깨진다..
		
		long fsize=file.length();//파일의 크기 반환한다. 파일크기는 인트아니고 롱타입
		System.out.println("파일의 크기: "+fsize+"bytes");
		
		FileReader fr=new FileReader(file);//노드 연결
		//FileWriter fw=new FileWriter(file2);//기존걸 덮어쓴다
		FileWriter fw=new FileWriter(file2, true);//true를 주면 기존 파일 내용을 덮어쓰지 않고 덧붙여쓴다 append처럼.
		int n=0;
		char[] data=new char[1000];//달걀판
		while((n=fr.read(data))!=-1) {
			fw.write(data, 0, n);
			fw.flush();
			//System.out.write(n);;
			//System.out.flush();
		}
		fr.close();

	}

}
