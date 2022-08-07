package day10;
import java.util.*; 
/*java.util.List 계열 => 파이썬의 경우 list []
 * index로 관리, 데이터를 순차적으로 입력한 순서대로 기억
 */
public class VectorTest2 {

	public static void main(String[] args) {
		//[1] Student 객체를 3개 생성하세요
		Student s1=new Student(1,"김철수"); //여기서 값을 넣어주는게 포인트!
		Student s2=new Student(2,"이영희");
		Student s3=new Student(3,"홍길동");
		
		//[2] Student를 저장할 Vector를 생성하세요
		//Vector<Student> v=new Vector<>(); 이대로 해도 되고 초기용량을 주어도 된다
		Vector<Student> v=new Vector<>(5,3);
		
		//[3] 벡터에 학생객체 3개를 저장하세요
		v.add(s1);
		v.addElement(s2);
		v.add(s3);
		System.out.println("v.size(): "+v.size());
		//[4] for루프 이용해서 벡터에 저장된 학생의 정보(학번, 이름)를 출력하세요
		
		//정하운
		for(Student a : v) {
			System.out.println("학번 : "+a.getId()+", 이름 : "+a.getName());  
			//학번과 이름을 호출해주는게 포인트
			//출력에 a, a.toString()하면 해시코드 나옴
		}
		
		/* 틀림. 해시코드가 나옴
		for(int i=0; i<v.size();i++) {
			System.out.println(v.get(i));
			
		}
		System.out.println();*/
		
		System.out.println("============");

		/*API: java.util => Vector => Method Summary
		 * firstElement(),lastElement(),get(int index), remove(int index),remove(Object o) 등 다양한 기능들
		
		 *public Enumeration<E> elements() 초반에 많이 썼는데
		 *Iterator<E>	iterator() 요즘엔 이걸 많이 씀
		 */
		/*Enumeration<E> elements()
		 * : 벡터에 저장된 객체들을 한꺼번에 꺼내오고자 할 때 사용.
		 * Enumeration과 Iterator인터페이스는 객체들을 집합체로
		 * 관리하도록 해주는 인터페이스이다.
		 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
		 * 처리할 수 있는 메소드를 제공한다.
		 * # Enumeration의 경우**********************************
		 * 	- boolean hasMoreElements() : 논리적 커서(첫번째 요소 직전에
		 * 				위치) 이후에 요소들이 있는지 물어서 있으면true
		 * 				없으면 false를 반환
		 *  - E nextElement(): 논리적 커서를 다음 요소로 이동하고
		 *  			현재 가리키고 있는 요소를 반환한다.
		 * # Iterator의 경우**************************************
		 * 	- boolean hasNext()
		 *  - E next() 
		 * */
		
		Enumeration<Student> en=v.elements(); //Generic을 써야한다 Enumeration집합체에 Student가 들어간거
		
		while(en.hasMoreElements()) {
			Student e=en.nextElement();//Student가 반환됨
			System.out.println(e.getName()+": "+e.getId());
		}//반복문 o
		System.out.println("************");
		while(en.hasMoreElements()) {
			Student e=en.nextElement();
			System.out.println(e.getName()+": "+e.getId());
		} //같은 코드임 그러나 이미 커서에서 모든 요소를 가르켜서 더이상 반복문 x
		
		//Iterator<E>	iterator()메서드 이용해서
		//v에 저장된 학생들의 이름을 모두 출력하세요
		Iterator<Student> it=v.iterator();
		while(it.hasNext()) {
			Student i=it.next();
			System.out.println(i.getName()+": "+i.getId());
		}
		
		//clear(), removeAll() : 모든 요소를 삭제한다
		v.clear();
		System.out.println("데이터 삭제 후--------");
		it=v.iterator();
		for(;it.hasNext();) {
			Student i=it.next();
			System.out.println(i.getName());
		} 
		//데이터 없어서 출력없음

		
	}

}
