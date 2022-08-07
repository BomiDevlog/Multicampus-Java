package day10;
/*Map계열- Hashtable, HashMap, Properties
 * - Object유형을 저장할 수 있으며
 * - key와 value를 매핑하여 저장한다.
 * - 데이터가 75% 차면 자동으로 저장 영역을 확대한다.
 * - key값의 중복을 허용하지 않는다.
 * - 무순서
 * - 데이터 저장: Object put(Object key, Object val)
 * - 데이터 추출: Object get(Object key)  || AraayList의 경우 get(int index)였다 차이를 구분
 * 
 * -------
 * List는 index로 관리해서 순차적이고 Map은 index를 사용하지않아서 무순서이다
 * 
 * Hashtable(int initialCapacity) -hashtable은 동기화되어있어서 웹에서 hashmap을 더 많이 씀
 * V	put(K key, V value)
 * */
import java.util.*;
public class HashtableTest {

	public static void main(String[] args) {
		Hashtable<String,Integer> h1=new Hashtable<>();
		//key:String, Value: Integer
		h1.put("생년",2012);
		h1.put("나이", Integer.valueOf(20));
		h1.put("연봉",5000);
		//h1.put("나이", 30); 
		//오류가 나진않지만 나중의 데이터가 기존 데이터를 덮어씀.
		//같은 key값설정으로 인해 기존의 20은 사라지고 30만 데이터저장됨
		
		//Map계열은 검색이 용이하다.
		Integer age=h1.get("나이");
		System.out.println("age: "+age+"세"); 
		//짝을 이루는 값을 반환하니 검색이 쉽다 그러니 key값이 중복되면 안됨
		System.out.println("h1.size(): "+h1.size());// 나이는 갱신된 데이터라서 3개
		
		System.out.println("---^o^---");
		/*Enumeration<K>	keys() : key값들만 Enumeration 객체로 반환함
		 * Set<K>	keySet() : key값들만 Set객체로 반환
		 * Collection<V>	values(): value값들만 반환  */
		
		//Enumeration<K>	keys() : key값들만 Enumeration 객체로 반환함
		//key값들 추출해서 출력한 뒤, value도 같이 출력해보세요
		Enumeration<String> en=h1.keys();
		//while문으로 만들 수도 있다
		for(;en.hasMoreElements();) {
			String key=en.nextElement();
			System.out.println(key+">>"+h1.get(key));
		}
		//Set<K>	keySet() : key값들만 Set객체로 반환
		Set<String> set=h1.keySet();
		for(String ky:set) {
			System.out.println(ky);
		}
		// Collection<V>	values(): value값들만 반환
		Collection<Integer> cl=h1.values();
		for(Integer val : cl) {
			System.out.println(val);
		}
		
		/*boolean	containsKey(Object key) : key값을 포함하고 있으면 true, 없으면 false
		 *boolean	containsValue(Object value) : value값을 가지고 있으면 true, 없으면 false */
		System.out.println(h1.containsKey("생년"));
		System.out.println(h1.containsValue(2013));

	}

}
