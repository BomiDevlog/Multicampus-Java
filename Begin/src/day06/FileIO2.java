package day06;

import java.io.*;

//throws로 발생한 예외를 처리하세요
public class FileIO2 {

	public static void main(String[] args) {
		//파일명을 명령줄 인수로 받을 것
		
		if(args.length!=1) {
			System.out.println("명령줄 인수로 읽을 파일명을 입력하세요!");
			System.out.println("[예] C:/myjava.day01/Hello.java");
			return;
		}
		
		String fileName=args[0];
		System.out.println("읽을 파일명: "+fileName);
		try {
			String contents=FileIO2.reading(fileName); //클래스명이니 static메소드임. 반환타입은 String/매개변수 fname으로 설정
		//throws에서 던진 예외가 여기로 올라와서 에러인 것. 그래서 또 throws로 넘기던가 try catch로 예외처리해야함
			System.out.println(contents);
		}catch(IOException e) {
			System.out.println("파일 읽는 중 예외 발생: "+e.getMessage());
		}
		
		//Run configuration에서 arguments에서 상대경로 입력해봄. src/day06/FileIO.java
		//클래스의 오른마우스에 properties하면 저장경로가 나온다 절대경로로 입력하는 방법.

	}//
	/*파일을 읽어서 파일 내용을 문자열로 반환하는 메소드
	 */
	
	public static String reading(String fname) 
	throws FileNotFoundException, IOException
	{
		FileReader fr=null; //파일을 읽어주는 클래스 FileReader는 char타입을 받는다
		
		char[] data=new char[1000];
		
		fr=new FileReader(fname);
		//파일과 노드 연결
		
		fr.read(data, 0, 1000);
		//파일을 읽어서 char타입 배열 data에 담아준다
		
		fr.close();
		//노드 연결 끊기
		
		//파일 내용은 data배열에 담긴다==>문자열로 만든다
		String contents=new String(data);
		
		return contents;
		
		//저장하면 컴파일 된다 오류없는데 빨간줄일 때 저장해서 다시 확인
		
	}//

}//
