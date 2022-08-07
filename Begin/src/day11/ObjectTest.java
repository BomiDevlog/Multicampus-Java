package day11;
import java.util.*; //Date쓰려고 
import day10.Student; //파일을 가져와서 쓰려고 연결//import day10.*;이라고 써도 됨
public class ObjectTest {

	public static void main(String[] args) {
		//java.lang.Object 클래스 : 모든 클래스의 부모가 된다.
		Object o1=new Object();
		Object o2=new Object();
		System.out.println("o1: "+o1);
		System.out.println("o1.toString(): "+o1.toString()); //두 가지가 같은 출력문: 해쉬코드
		/*toString() 메서드는 해당 객체에 대한 정보를 문자열로 반환한다.
		 * 재정의 하지 않았다면 "클래스이름@해시코드"를 반환한다.		 */
		
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println("s1: "+s1);
		System.out.println("s1.toString(): "+s1.toString()); 
		//String 클래스에서는 toString()을 오버라이드(재정의)하고 있다. 그래서 문자열로 출력.
		
		Date d1=new Date();
		System.out.println(d1); 
		System.out.println(d1.toString()); 
		//Date 클래스에서는 toString()을 오버라이드(재정의)하고 있다. 그래서 날짜로 출력.
		
		//day10의 Student참고.
		Student st1=new Student(100,"김학생");
		Student st2=new Student(101,"이철수");
		Student st3=st2; //같은 주소값
		
		Student st4=new Student(101,"이철수");
		 
		System.out.println(st1);
		System.out.println(st1.toString());
		//재정의 하지 않았다면 "클래스이름@해시코드"를 반환한다.	
		//재정의 해준다면 정보가 제대로 출력될 것.
		
		//==: 기본자료형일 때 값을 비교, 참조형일 떄 주소값을 비교한다.
		System.out.println("st1==st2: "+(st1==st2)); //false
		System.out.println("st2==st3: "+(st2==st3)); //true 같은 주소값
			
		//Object클래스의 equals() 메서드: 주소값을 비교하여 같으면 true반환
		System.out.println("st1.equals(st2): "+st1.equals(st2));
		System.out.println("st3.equals(st2): "+st3.equals(st2)); //true 같은 주소값
		//st4,st2 equals() 비교해보기
		System.out.println("st4.equals(st2): "+st4.equals(st2)); //false : 내용은 같지만 주소값 다름
		
		//Student클래스에서 equals()메서드를 오버라이드 하세요. => 오버라이딩하면 위의 출력문이 true
		//id값과 name값이 같으면 true를 반환하도록 재정의하세요.
		
		System.out.println("---------String 클래스---------");
		String a1="Hello";
		String a2="Hello";
		String a3=new String("Hello");
		String a4=new String("Hello");
		//리터럴방식 (Integer, String 등)은 리터럴풀이라는 메모리영역에 값이 올라간다
		//new로 만들어 Heap이라는 메모리영역에 값이 올라간다.
		
		
		//== : 주소값 비교
		//a1==a2 결과예측하고 출력문 작성해보세요
		//a1==a3 결과예측하고 출력문 작성해보세요
		//a3==a4 결과예측하고 출력문 작성해보세요
		System.out.println("a1==a2: "+(a1==a2));//true
		System.out.println("a1==a3: "+(a1==a3));//false
		System.out.println("a3==a4: "+(a3==a4));//false
		
		// equals() : 문자열 내용비교
		//a1.equals(a2)
		//a1.equals(a3)
		//a3.equals(a4)
		System.out.println("a1.equals(a2): "+a1.equals(a2));
		System.out.println("a1.equals(a3): "+a1.equals(a3));
		System.out.println("a3.equals(a4): "+a3.equals(a4));
		//내용이 같으니 모두 같다고 결과나옴. 스트링에서 오버라이딩되어있음.
		
	}
}
