package day13;
/*InputStreamReader
 * - 2byte(문자) 기반 스트림
 * - 브릿지 스트림 (노드스트림x필터스트림x)
 * - 1byte로 읽어들인 데이터를 2byte로 조합해서 읽어들인다
 * - charset을 맞추는 기능이 있다.
 * 
 * 신문사 기사를 크롤링했는데 깨지면 이걸로 감싸주면 인코딩 맞춰줄수 있음
 */
import java.io.*;
public class InputStreamReaderTest2 {

	public static void main(String[] args) 
	throws IOException
	{
		//String fname="C:\\Users\\PC\\git\\firstGit\\Begin\\src\\day13\\FileInputSteamTest.java";
		String fname="C:\\Users\\PC\\git\\firstGit\\Begin\\readme.txt";//ANSI로 저장 ==>CP949=>EUC-KR 
		
		File file=new File(fname);
		long fsize=file.length();//파일의 크기 반환한다. 파일크기는 인트아니고 롱타입
		System.out.println("파일의 크기: "+fsize+"bytes");
		
		//FileReader fr=new FileReader(file);//노드 연결
		FileInputStream fis=new FileInputStream(file);//노드연결
		InputStreamReader fr=new InputStreamReader(fis,"EUC-KR");//읽고//UTF-8 : properties에서 나옴
		
		OutputStreamWriter ow=new OutputStreamWriter(System.out,"UTF-8");//내보냄 // //이걸 EUC-KR 바꾸면 또 깨짐 //양쪽의 인코드의 캐릭값에 따라 맞춰줌
		int n=0;
		while((n=fr.read())!=-1) {
			ow.write(n);
			ow.flush();
			//System.out.write(n);;
			//System.out.flush();
		}
		fr.close();

	}

}
