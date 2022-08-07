package day06;
import java.io.*;
public class PracticeSample {


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
				return fname;

	}
}

