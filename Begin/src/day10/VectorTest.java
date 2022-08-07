package day10;
import java.util.*;
import javax.swing.*;
/*java Collection Framework
 *  - Collection : 객체를 수집해서 저장하는 역할
 *  - 사용 방법을 미리 정해놓은 라이브러리를 의미
 *  -Vector, ArrayList, Hashtable, HashMap, HashSet, TreeSet...
 *  
 *  //Vector : 채팅에서 접속자들의 통신관리 등에 사용, 여러개의 thread 동시접속할 때 체계적인 관리
 *  //ArrayList :  주로 웹에서 사용, Vector보다 가벼워서 더 빠른 정보처리.
 *  
 *  #Vector
 *  - Collection-List계열
 *  - 입력 순서를 기억한다
 *  - 데이터 중복 저장 가능
 *  - 유사 클래스: ArrayList
 * 
 */
public class VectorTest {

	public static void main(String[] args) {
		// jdk1.4 이전 버전
		//Vector v=new Vector(); //[가능하지만 잠시 슬래쉬] 초기용량: 10개, 가득차면 2배로 저장공간을 늘린다.
		Vector v=new Vector(5,3);// 초기용량: 5, 증가치: 3
		System.out.println("벡터 v의 현재 용량: "+v.capacity());//얼마나 저장할수 있는지 저장공간. 데이터베이스의 공간용량
		System.out.println("벡터 v의 현재 크기: "+v.size());//현재 얼마나 저장했는지. 데이터양
		
		//데이터 저장: add(), addElement()
		//데이터 꺼내기: Object get(int index), Object element(int index)
		v.add("Hello"); //매개변수로 Object계열이 가능
		v.add(new Integer(20)); //예전엔 가능했는데 최근 바뀐게 아래의 케이스
		v.add(Integer.valueOf(22));
		//v.add(int 10);[x]
		v.add(3.14);//double이 저장되는 것이 아니라 Double=>Wrapper class로 auto boxing되어 저장된다
		
		System.out.println("벡터 v의 현재 용량2: "+v.capacity());
		System.out.println("벡터 v의 현재 크기2: "+v.size());
		
		v.add(new Object());
		v.add(new javax.swing.JButton("OK"));// 한번만 쓸거면 import안하고 써도 된다 근데 결국 아래에서 출력할때 결국 오류나서 impor씀
		
		System.out.println("벡터 v의 현재 용량3: "+v.capacity());
		System.out.println("벡터 v의 현재 크기3: "+v.size());
		
		/*Object obj=v.get(0); //무조건 index는 0부터. 배열도 벡터도 인덱스는 0부터
		System.out.println(obj.toUpperCase()); //toUpperCase는 스트링 반환타입. Object는 부모티입이라 자식의 기능을 사용불가
		*/
		String obj=(String)v.get(0); //반환타입을 String으로 잡고. Object인 v.get(0)을 강제형변환
		System.out.println(obj.toUpperCase()); 
		
		Double db1=(Double)v.get(3);
		System.out.println(db1);
		
		/*String str=(String)v.get(5); //컴파일에서 오류없지만, 런타임(실행)에서 오류: ClassCastException
		System.out.println(str);*/
		
		JButton str=(JButton)v.get(5); 
		System.out.println(str);
		//5.0 이후 부터 Generic을 사용함
		Vector<String> v2=new Vector<>(); //String 유형만 저장하는 벡터 생성
		//Vector<String> v2=new Vector(); [o] 7.0부터 가능한 방식
		v2.add(new String("Java"));
		//v2.add(Integer.valueOf(5));[x]
		v2.add(Integer.valueOf(5).toString());
		
		String s2=v2.get(0); //Generic을 쓰면 형변환이 필요없다
		System.out.println(s2.toLowerCase());
		
		//[1] for루프 이용해서 v2에 저장된 객체를 출력하기
		for(int i=0; i<v2.size();i++) { //배열은 length 벡터나 어레이는 size
			System.out.print(v2.get(i)+" ");
		}
		System.out.println();
		
		//[2] Float 유형을 저장할 벡터v3를 생성하고 Float 객체 3개 이상 저장하기
		//	  확장 for루프문 이용해서 v3에 저장된 값들의 합계를 구해 출력하기
		
		Vector<Float> v3 = new Vector<>();
		//v3.add(3.14); 숫자를 더블로 인식해서 에러
		//v3.add(new Float (3.1f)); 가능하지만 빗금쳐진다
		v3.add(3.14f); //float=> Float으로 자동 auto boxing되어 저장된다.
		v3.add((float) 2.2);
		v3.add(Float.valueOf(5));
		
		float sum = 0;
		for(float a : v3) //auto unboxing
			sum+=a;
		System.out.println("합계 : " + sum);


	}

}
