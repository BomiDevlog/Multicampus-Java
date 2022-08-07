package day10;
import java.util.*;
/*LinkedList : 인접 참조를 링크해서 체인처럼 관리하는 컬렉션
 * 			   데이터를 저장한 후 수시로 데이터를 삽입하거나 삭제, 수정해야 할 경우 적합
 * ArrayList : 순차적으로 데이터를 저장할 때 적합함. 검색할 때 상대적으로 빠름.
 */

public class LinkedTest {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		List<String> list2=new LinkedList<>();
		//ArrayList 데이터 1만건 정도 저장 후 수행시간을 측정해볼 것
		//두 방식의 데이터 중간 삽입의 시간차이를 알아보기 위해
		
		//반복문 전에 시간을 나노타임으로 측정할 것
		long startTime = System.nanoTime();
		for(int i=0;i<1000;i++) {
			list1.add(0, "Hello "+i);//인덱스 추가 할 때 -콘솔창에 역순이 되고
			//list1.add( "Hello "+i); //인덱스 추가 안할때-순차적이 됨
		}
		long endTime=System.nanoTime();
		
		long gapTime=endTime-startTime;
		System.out.println("**ArrayList 걸린 시간: "+gapTime+" ns"); //인덱스 있을때 느림. 근데 인덱스 없으면 더 빠름 
		System.out.println("list1.size(): "+list1.size());
		System.out.println("**********************");
		
		for(String str:list1) {
			System.out.println(str);}
		
		startTime=System.nanoTime();
		for(int i=0;i<1000;i++) {
			list2.add(0, "Hello "+i);//인덱스 추가 할 때
			//계속 0자리에 넣어주니까 Hello0이 가장 뒤로 가고 Hello999가 가장 앞.
			//list2.add( "Hello "+i); //인덱스 추가 안할때
		}
		endTime=System.nanoTime();
		gapTime=endTime-startTime;
		System.out.println("**LinkedList 걸린 시간: "+gapTime+" ns"); //인덱스 추가할 때 훨씬 빠름
		System.out.println("list2.size(): "+list2.size());
		/*
		 * 			 | 순차적으로  | 중간에 추가, 삭제 | 검색
		 * ArrayList | 빠르다		|	느리다		| 빠르다
		 * LinkedList| 느리다		|	빠르다		| 느리다
		 */

	}

}
