package day11;
import java.util.*;
/*Set 계열
 *  - 순서를 기억하지 않는다 (index로 관리하지 않음)
 *  - 데이터 중복을 허용하지 않는다
 *  - 구현 클래스 : HashSet, TreeSet...
 *  - HashSet은 객체를 저장하기 전에 객체의 hashCode()를 호출해서
 *    해시코드를 얻어낸다. 그리고 이미 저장되어 있는 객체들의 해시코드와 비교한다.
 *    만약 동일한 해시코드가 있다면, 다시 equals()메서드로 두 객체를 비교해서
 *    true가 나오면 동일한 객체로 판단하고 중복저장을 하지 않는다.
 * 
 */
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		//boolean	add(E e): 데이터저장할 때
		set.add("Java");
		set.add("HTML");
		set.add("CSS");
		set.add("Python");
		set.add("MySQL");
		set.add("Java"); //데이터중복을 허용하지않기에 카운트되지않음 맨나중데이터가 덮어씀. 데이터 5개로 인식
		System.out.println("set.size(): "+set.size());
		
		/*API: java.util =>Class HashSet
		 * boolean	contains(Object o) 어떤 값을 가지고 있으면 true
		 * 생성자에 안보이면 상속받은 메소드에 찾아봐
		 */
		
		//Iterator<E>	iterator() : 데이터 꺼내기 //get없음. 
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String val=it.next();
			System.out.println(val);
		} 
		//저장한 순서랑 상관없이 출력됨
		
		//remove() : 데이터 지우기
		set.remove("CSS"); 
		System.out.println("제거 후 set.size(): "+set.size());
		
		for(String str:set)
			System.out.println(str);
		
		//clear(), removeAll(): 모두 지우기
		set.clear();
		System.out.println("전체 제거 후 set.size(): "+set.size());
	
	}

}
