package day13;
/*FileReader /FileWriter
 * - 2byte(문자) 기반 스트림
 * - 노드 스트림 (파일과 노드 연결)
 */
//FileReader로 읽고 /FileWriter로 내보낼 것
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) 
	throws IOException
	{
		//String fname="C:\\Users\\PC\\git\\firstGit\\Begin\\src\\day13\\FileInputSteamTest.java";
		String fname="C:\\Users\\PC\\git\\firstGit\\Begin\\readme.txt";
		
		File file=new File(fname);
		File file2=new File("C:\\Users\\PC\\git\\firstGit\\Begin\\readme_copy.txt"); //카피가 생기는데 깨진다..
		
		long fsize=file.length();//파일의 크기 반환한다. 파일크기는 인트아니고 롱타입
		System.out.println("파일의 크기: "+fsize+"bytes");
		
		FileReader fr=new FileReader(file);//노드 연결
		FileWriter fw=new FileWriter(file2);
		int n=0;
		while((n=fr.read())!=-1) {
			fw.write(n);
			fw.flush();
			//System.out.write(n);;
			//System.out.flush();
		}
		fr.close();

	}

}
