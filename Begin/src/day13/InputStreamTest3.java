package day13;
import java.io.*;
//System.in : 키보드와 노드 연결
//System.out : 콘솔과 노드 연결
public class InputStreamTest3 {

	public static void main(String[] args) 
	throws IOException
	{
		int n=0;
		int cnt=0;//카운트 센다
		System.out.println("입력하세요 => ");
		//데이터를 달걀판(배열)에 담아서 읽고 써보자
		byte[] arr=new byte[6];//달걀판
		int total=0;
		while((n=System.in.read(arr))!= -1){ 
			//배열 arr에 데이터가 담긴다
			//n: 닭걀 개수(읽은 바이트 수)
			//cnt: 반복문횟수
			//System.out.write(n); [x]
			//System.out.write(arr); 배열의 찌꺼기가 출력될 수 있으니 범위설정해줘야한다.
			System.out.write(arr,0,n); //배열에 데이터가 담겨있으니까
			System.out.flush();//스트림에 남아있는 데이터를 밀어내는 메소드
			//Stream에 데이터가 남아 안나오는 경우가 있음 변기물내리듯이. 
			cnt++;
			total+=n;
		}
		//System.out.println(cnt+"bytes 읽음");[x]
		System.out.println(total+"bytes 읽음");
		
		System.in.close();
		System.out.close();

	}

}
