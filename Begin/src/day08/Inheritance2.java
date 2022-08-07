package day08;
/*하나의 자바파일에 여러 클래스를 구성할 경우
 * public인 클래스는 1개만 존재해야 하며,
 * 파일명으로 된 클래스에 public을 붙인다 */

class Person{
	int no;
	String name;
	
	//public Person() {} //기본생성자
	//생성자를 하나라도 구성하는 순간, 컴파일러가 제공하던 기본 생성자는 사라진다. 그래서 기본생성자를 항상 같이 만드는 습관!
	public Person(int n, String m) {
		no=n;
		name=m;
	}
}//
//자식클래스의 생성자에서는 묵시적으로 super()를 호출한다.
//super():부모클래스의 기본생성자를 호출할 때 사용하는 키워드
/*컴파일러가 제공하는 기본생성자는
 * public Student(){
 * 		super();
 * } 
 * 이런 형태가 person(int n, String m) 생성하는 순간 사라지니까 오류발생
 * Person에서 기본생성자를 만들어주면 에러해결 */
//만약 부모클래스에서 기본생성자를 안만들었을 때 에러해결하려면!
class Student extends Person{
	String major;
	//super() 묵시적으로 호출 ==> 기본생성자가 없어서 에러남
	public Student() {
	super(100,"김희영");//명시적으로 super를 호출하여 해결한다. this와 같은 규칙으로 첫번째 문장이어야한다.
	}
}///

class Teacher extends Person{
	String subject;
	public Teacher() {
		super(200,"최교사");
		//this(200,"최교사","C")//this를 대신 쓸수 있다
		/*[1]super()는 생성자에서만 호출 가능하다
		 *[2]생성자의 첫번째 문장이어야 한다.
		 *[3]this()와는 함께 사용할 수 있다.
		 */
	}
	public Teacher(int no, String name, String subject) {
		//super를 부르니까 에러남 명시해줘야함
		super(no,name);//대신 this()라고 써도되는데 super가 더 좋은 방법/첫번째 문장에 위치해야히기때문에 super(),this()는 같이 못쓴다
		this.subject=subject;
	}
}//
public class Inheritance2 {
	
	public static void main(String[] args) {
		Person p1=new Person(1,"홍길동");
		/*p1.name="홍길동";
		p1.no=1; //생성자가 없으면 이런식으로 일일이 입력해야해서 불편*/
	}

}//
