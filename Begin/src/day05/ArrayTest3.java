package day05;

public class ArrayTest3 {
	//1차원 배열

	public static void main(String[] args) {
		System.out.println("1.-------------------");
		int a[];
		a=new int[3];
		a[0]=90;
		a[1]=80;
		a[2]=70;
		
		int[] b; //선언
		b=a;
		/*a가 가리키는 배열을 b도 같이 가리키는 형태가 된다
		 * int a[]---------------->|90|80|70|
		 * 						   |
		 * int b[]---------------->+
		 */
		//b를 for루프 이용해서 저장된 값 출력하세요
		
		for(int i=0; i<b.length; i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		//a가 참조하는 배열을 b도 같이 참조하는형태가 되므로,
		//둘 중 하나의 데이터를 변경하면 같이 변경된다.
		//b로 데이터 변경을 해보겠다
		
		b[0]=100; //데이터변경
		System.out.println("b[0]="+b[0]);
		System.out.println("a[0]="+a[0]); //a[0]도 100으로 데이터변경됨
		
		System.out.println("2.-------------------");
		int []x= {1,2,3,4};
		int []y= {10,20};
		int tmp[]; //선언 //사탕바구니를 옮기기위한 빈그릇 역할로 새로운 변수 하나를 지정해줌
		//x,y 값을 서로 바꿔보세요 (swap)
		//for루프 이용해서 x,y에 저장된 값 출력해보세요
		
		/*내가 푼거
		tmp=x;
		for(int i=0;i<tmp.length;i++) {
			System.out.println("tmp["+i+"]="+tmp[i]);
		}
		
		x=y;
		for(int i=0;i<x.length;i++) {
			System.out.println("x["+i+"]="+x[i]);
		}
		
		y=tmp;
		for(int i=0;i<y.length;i++) {
			System.out.println("y["+i+"]="+y[i]);
		}
		*/
		
		//정하운 훨씬 깔끔한 코드정리
		 tmp = x;
		 x = y;
		 y = tmp;
		for(int i=0; i<x.length; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
		for(int i=0; i<y.length; i++) {
			System.out.println("y["+i+"] = "+y[i]);
		}

		System.out.println("3.-------------------");
		//참조형의 배열- String, Date, Scanner, Object(모든 클래스의 부모) ...
		
		//String[] arr;//선언하고 초기화안하고 컴파일되지만 콘솔창에서 에러.
		String[] arr=null; //선언. 
		System.out.println(arr);
		
		arr=new String[4];//[2] 메모리 할당
		System.out.println("arr[0]="+arr[0]);
		
		//[3]초기화
		arr[0]="Hello"; //리터럴방식으로 스트링표현
		arr[1]=new String("Hi");
		arr[2]=3+"5"; //문자열화되어 3과 5가 배열. 35
		arr[3]="";//빈문자열 가능 /char ch=''[x] ' '공백이라도 해야함
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println("*****************");
		/*확장 for루프=개선된 for루프=for each루프 
		 * 
		 * for(변수 선언문; 자료구조)
		 * { 
		 * 		실행문;
		 * 
		 * }
		 * 알아서 자료구조의 크기(length 등)만큼 반복문 돌면서
		 * 자료구조의 값을 변수에 할당한다
		 */
		
		for(String s: arr) { //arr와 같은 자료형으로 새 변수를 주었다.
			//대문자로 전부 출력한다면?
			System.out.println(s.toUpperCase()); //toLowerCase 전부 소문자 //숫자는 그대로 숫자로 나온다
			System.out.println("s: "+s);
		}
		
		String str[]= {"안녕하세요","반갑습니다", "잘가세요~~"};
		//확장for루프로 출력해보기
		for(String sa: str) {
			System.out.println(sa);
		}

	}//

}//
