package day06multicampus;
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
			arr[count]=s1;
			count++;
			System.out.println(count+"명 등록했습니다!");
			//배열에 저장한다 3명까지 가능 4명부터는 에러
			//Student타입의 배열에 저장함/ 배열이 데이터베이스역할/ 영구히 저장은 아니고 프로그램실행되는 동안에 저장
		}
		
		
	}
	
	//arr에 저장된 학생들의 정보를 반복문 돌면서 출력한다
	public static void printAll() {
		Student s1=new Student();//새로운 객체 생성함
		System.out.println("----등록한 정보를 출력합니다----");
		s1.showInfo();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}//
	
	
	//메인에서는 주된 흐름만 뽑고 다른 기능은 메소드로 만드는게 좋다
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
				School.register();//static메소드를 클래스메소드라고 부르기도한다 클래스명으로 명명하니까 //컨드롤 누르면 레지스터에 링크걸려서 이동함
				break;//switch문을 벗어나 그다음의 while문으로 간다
			case 2://출력 //printAll()==>>arr에 저장된 학생들의 정보를 반복문 돌면서 출력한다(숙제)
				School.printAll();
				break;
			case 3://검색
				break;
			case 4://삭제
				break;
			
			}
			
		}while(num!=9);//9가 아닐때까지 반복돌아라
		System.out.println("잘 가세요~~^^"); //9를 눌러 종료하면 반복문이 끝남. 그러니까 프로그램의 끝을 알리는 문구를 만들어줌
			
			
			
			
	}//

}//
