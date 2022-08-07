package day07multicampus;
import java.util.*;
public class School {
	//School has a students[배열] //복수를 가지면 배열로 저장한다
	//String[] arr=new String[3]; (X) //배열을 같은 종류의 데이터만 저장한다 //이건 이름만 저장하는 공식이된다.
	static Student[]arr=new Student[3];//스튜던트자체가 자료형이고 이름 전공 등 다양한 정보를 열람하려고하니까. 
	//배열=>DB(데이터베이스)같은 역할을 한다
	static int count=0;//배열의 인덱스 번호로 사용할 변수//static 메소드 안에서 접근하니까 static을 붙여줌

	/*public static void main(String[] args) {
		
		/*Student s1=new Student();
		/*직접 입력하는 방법
		s1.no=100;
		s1.name="임철수";
		s1.major="빅데이터";
		s1.phone="010-2222-3333";
		*/
		/*s1.inputInfo();//출력받는 메소드
		s1.showInfo();*/

	//}
	
	//긴 코드는 메인부터 보고 위에서부터 다시 코드를 전체를 훑음
	
	public static void showMenu() {
		System.out.println("***** SchoolApp v1.1 *****");
		System.out.println("***** 1. 등		  록 *****");
		System.out.println("***** 2. 출		  력 *****");
		System.out.println("***** 3. 검		  색 *****");
		System.out.println("***** 4. 삭		  제 *****");
		System.out.println("***** 9. 종		  료 *****");
		System.out.println("**************************");
		System.out.println("메뉴 번호를 입력하세요 =>");
		System.out.println("**************************");
	}//
	
	public static void register() {
		Student s1=new Student();//새로운 객체 생성함
		s1.inputInfo(); //정보입력
		System.out.println("----등록한 정보----");
		s1.showInfo(); //정보를 보여줌
		System.out.println("입력한 학생 정보를 저장할까요?[1. yes	2. no]");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1) {
			//s1을 배열에 저장한다==>arr에 저장하기
			//s1을 배열에 저장한다 ->메소드로 한다 //메소드로 저장하는건 내일
			//arr[0]=s1;(x) //저장하는 것
			try {
				arr[count]=s1;
				count++;
				System.out.println("현재 등록된 인원: "+count+"명");
			//배열에 저장한다 3명까지 가능 4명부터는 에러
			//Student타입의 배열에 저장함/ 배열이 데이터베이스역할/ 영구히 저장은 아니고 프로그램실행되는 동안에 저장
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("등록 마감했습니다! 현재 인원: "+count+"명");
			}//배열의 범위를 넘어서면 등록마감된다는 문구로 예외처리해줌. 4명째에서 에러안나고 등록마감문구
		}//마감이면 등록정보 쓰기전에 마감을 알리는 문구가 더 적합한 프로그램이다
		
		
	}
	
	/* 등록된 모든 학생정보를 출력하는 메소드 */ //static말고 다른걸로.
	//arr에 저장된 학생들의 정보를 반복문 돌면서 출력한다
	public void printAll() {
		//배열 arr에 저장된 학생정보를 for루프 이용해서 꺼내서 출력해보기 //확장 포루프라던지 인덱스르 쓰는 포루프
		
		
		
		for(int i=0;i<count;i++) {//arr.length을 범위로 하면 빈 배열은 null값으로 에러. 범위를 count로 설정!
			Student s=arr[i]; //맨위에 arr[]의 자료형이 Student
			//System.out.println(s); //[x] s의 주소값이 출력됨 @16진수 day07multicampus.Student@12edcd21
			System.out.println("----등록한 학생 정보입니다: "+(i+1)+"명----");
			s.showInfo();
		}
		
		//메소드의 틀을 찍었으니 아래의 메인에서 메소드를 호출해야 콘솔에 정보가 나온다
	}//
	
	
	
	//메인에서는 주된 흐름만 뽑고 다른 기능은 메소드로 만드는게 좋다
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		School obj=new School();//새로운 객체생성. 반복문 내에서 생성하면 자꾸 생성해서 메모리낭비하니까 반복문 밖에서. 프린트올 메소드를 불러주기위해 생성한 객체
		int num=0; //초기값. do 내에서 메뉴번호를 입력받음
		do {
			//showMenu()호출하기
			School.showMenu();//static이니까 클래스명.메소드
			num=sc.nextInt();
			//메뉴에 없는 번호를 입력했을 경우 "없는 번호입니다. 메뉴번호를 다시 입력하세요"
			//글자넣으면 오류나는데이걸 잡는게 좋겠당~
			if((num <= 0) || (num > 4 && num!=9)) {//내가한거 깔끔해서 맘에든당!(!(num<=4)&&(num!=9))
				System.out.println("없는 번호입니다. 메뉴번호를 다시 입력하세요");
				continue; //없는 번호이니까 더이상 실행하지않고 새로운 흐름을 시작함
			}
			//System.out.println(">>>진행중>>>");
			switch(num) {
			case 1://등록(학생 교사 직원 등 나눠야함)==>학생등록 register()메소드 호출하기
				School.register();//static메소드(클래스메소드) 클래스명으로 명명하니까 //컨드롤 누르면 레지스터에 링크걸려서 이동함
				break;//switch문을 벗어나 그다음의 while문으로 간다
			case 2://출력 //printAll()==>>arr에 저장된 학생들의 정보를 반복문 돌면서 출력한다(숙제)
				//School.printAll();[x]
				obj.printAll(); //non-static메소드(인스턴스 메소드) 객체를 생성한다음 [객체명.메소드]라고 호출함
				break;
				//NullPointerException 배열이 3칸인데 1명만 등록해서 비어있는 정보를 null값으로 출력함
			case 3://검색
				
				break;
			case 4://삭제
				
				break;
			
			}
			
		}while(num!=9);//9가 아닐때까지 반복돌아라
		System.out.println("잘 가세요~~^^"); //9를 눌러 종료하면 반복문이 끝남. 그러니까 프로그램의 끝을 알리는 문구를 만들어줌
			
			
			/*OOP특징
			 * [1]추상화
			 * 객체(Object)=>클래스(속성+기능)=>new 객체생성(object, instance)
			 * [2]캡슐화
			 * public : 접근지정자(access modifier) 어디서든 접근 가능
			 * private: 자기 클래스내에서만 접근 가능
			 * 생략형: default 지정자
			 * 
			 * class Student {
			 * 	private int no;
			 * 	String name;
			 *--메소드로 캡슐화된 데이터를 접근할 수 있게 한다
			 *	setXXX(), getXXX() 구성한다 (setter 세더 getter 게더 라고 읽음)카멜표기법 setNo set_no 등으로 주로 표기
			 *	public void setNo(int a) ---setXXX은 반환타입없고 void임. 지역변수를 매개변수로 받음.
			 *	{
			 *		no=a;
			 *	}
			 *	public int getNo() (반환타입반드시있음 매개변수없음)
			 *	{
			 *		return no;
			 *	}
			 * }
			 * 
			 * class School{
			 *  public static void main(){
			 *  		Student s=new Student();
			 *  		s.no=100;[x]
			 *  		s.name="홍길동"
			 *  }
			 * }
			 * 
			 */
	
			
	}//

}//
