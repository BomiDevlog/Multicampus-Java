package day06;

import java.io.*;
//java.io.FileReader;

/*상속관계
 * Exception
 * 	+-------------IOException
 *  				+-------------------FileNotFoundException 
 */

//try~ catch로 발생한 예외를 처리하세요

public class FileIO {

	public static void main(String[] args) {
		//파일명을 명령줄 인수로 받을 것
		
		if(args.length!=1) {
			System.out.println("명령줄 인수로 읽을 파일명을 입력하세요!");
			System.out.println("[예] C:/myjava.day01/Hello.java");
			return;
		}
		
		String fileName=args[0];
		System.out.println("읽을 파일명: "+fileName);
		String contents=FileIO.reading(fileName); //클래스명이니 static메소드임. 반환타입은 String/매개변수 fname으로 설정
		System.out.println(contents);
		
		

	}//
	/*파일을 읽어서 파일 내용을 문자열로 반환하는 메소드
	 */
	
	public static String reading(String fname) 
	{
		FileReader fr=null; //파일을 읽어주는 클래스(스트림) FileReader는 char타입을 받는다
		char[] data=new char[1000];
		
		try {
		fr=new FileReader(fname); //FileNotFoundException 
		//파일과 노드 연결 //파일을 읽을 준비
		fr.read(data, 0, 1000); //IOException //변수명,첫인덱스,끝인덱스.//읽을 내용
		//파일을 읽어서 char타입 배열 data에 담아준다 //코드에서 설정한 1000자를 읽어줌
		fr.close();//IOException
		//노드 연결 끊기
		//파일 내용은 data배열에 담긴다==>문자열로 만든다
		String contents=new String(data);
		return contents; //정상적으로 읽었을때 여기서 마무리
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다!");
		}catch(IOException e) {
			System.out.println("char타입 배열이 아닙니다!(입출력 에러)");
		}catch(Exception e) {
			System.out.println("기타 오류 발생!"+e.getMessage());
		}
		return fname;//리턴문이 없으면 에러//예외발생했을 때 여기서 마무리
		
		//클래스의 오른마우스에 properties하면 저장경로가 나온다
		
		
		/*정서현
		 * public static String reading(String fname)
	{
		try{
			FileReader fr=null;
			
			char[] data = new char[1000];
			
			fr = new FileReader(fname);	//FileNotFoundException 발생
			//파일과 노드 연결
			
			fr.read(data, 0, 1000);		//IOException 발생
			//파일을 읽어서 char타입 배열 data에 담아준다
			
			fr.close();
			//노드 연결 끊기
			
			//파일 내용은 data 배열에 담긴다. ==> 문자열로 만들자
			String contents = new String(data);
			
			return contents;
		} catch(FileNotFoundException e) {
			System.out.println("찾을 수 없는 파일입니다.");
		} catch(IOException e) {
			System.out.println("IOException");
		}
		return fname;
		
	}

		 * 
		 */
		/*박지혜
		 * public static String reading(String fname)
	{
		FileReader fr=null; //FileNotFoundException (스트림)
		
		char[] data=new char[1000];
		try {
			fr=new FileReader(fname);
			//파일과 노드 연결
			
			fr.read(data, 0, 1000); //IOException
			//파일을 읽어서 char타입 배열 data에 담아준다.
			
			fr.close(); //IOException
			//노드 연결 끊기.
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println("char타입 배열이 아닙니다");
		}catch(Exception e) {
			System.out.println("기타 오류 발생");
		}
		
		//파일 내용은 data배열에 담긴다. ==> 문자열로 만들자
		String contents=new String(data);
		
		return contents;

		 * 
		 */
		
		
	}//

}//
