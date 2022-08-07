package day05;

public class ArrayTest4 {

	public static void main(String[] args) {
		/*2차원 배열
		 * [1]선언 [2]메모리 할당 [3]초기화
		 * int [][] a;
		 * int a[][];
		 */
		int[] a []; //2차원 배열 선언
		
		//[2] 메모리할당 => 3행 2열 (세로3층 가로2칸) 행의 인덱스가 앞에, 열의 인덱스가 뒤에.
		/*0.0	0.1
		 * 1.0	1.1	
		 * 2.0	2.1
		 */
		a=new int[3][2];
		
		//[3]초기화
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		System.out.println("a[1][1]="+a[1][1]);
		
		//for루프를 중첩해서 배열 a에 저장된 값을 출력하세요
		//행의 크기 : a.length
		//열의 크기 : a[i].length
		
		for(int i=0;i<3; i++) {
			for(int k=0;k<2;k++) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length; i++) {
			for(int k=0;k<a[i].length;k++) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
		
		System.out.println("a.length: "+a.length); //행의 크기
		System.out.println("a.length: "+a[0].length); //열의 크기
		System.out.println("a.length: "+a[1].length); //열의 크기
		System.out.println("a.length: "+a[2].length); //열의 크기
		
		//배열 a에 저장된 값을 출력하되 확장 for루프문을 이용해 출력해보세요
		
		/*박상환
		for(int aa[] : a)
		{
			for(int aaa : aa)
				System.out.print(aaa+" ");
			System.out.println();
		}
		*/
		/*	2차원 배열 a가 참조하는 것은 행을 가리킨다 그러니까 1차원 배열 aa[]를 변수지정
		 * a -----------> 행 |a[0] |a[1] |a[2] |
		 * 						|
		 * 				  열
		 * 					|a[0][0] |a[0][1] |
		 * 
		 */

		
		for(int i[]: a) {
			for(int k: i) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		System.out.println("2.-------------");
		//행의 크기만 먼저 잡아놓고, 열의 크기를 나중에 가변적으로 할당할 수 있다.
		char[][] ch=new char[3][];
		ch[0]=new char[2]; //2열로 만듬
		ch[1]=new char[4]; //4열로 만듬
		ch[2]=new char[3]; //3열로 만듬
		
		ch[0][0]='H';
		ch[0][1]='i';
		
		ch[1][0]='J';
		ch[1][1]='a';
		ch[1][2]='v';
		ch[1][3]='a';

		ch[2][0]='B';
		ch[2][1]='y';
		ch[2][2]='e';
		
		//for 루프 이용해서 ch에 저장된 값 출력하세요
		
		//내가푼거
		System.out.println("*1");
		for(char cha[]:ch) {
			for(char chb: cha) {
				System.out.print(chb);
			}
			System.out.println();
		}
		
		System.out.println("*2");
		//강사님 2가지방식
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]);
			}
			System.out.print(" ");
		}
		
	
		System.out.println("*3");
		for(char[] c:ch) {
			for(char x:c) {
				System.out.print(x);
			}
			System.out.print(" ");
		}
		
		//글을 이어주기때문에 \n으로 줄바꿈했다
		System.out.println("\n================");
		//2차원배열: 선언과 동시에 메모리할당하고 초기화//중괄효 2번
		
		float[]brr[]= {{0.5f, 20.1f},{010, 011,017},{10,'B'}}; //3행, 열크기는 다름 //010,011,017 8진수가 10진수로 변환// char문자는 아스키코드로 숫자화 반환됨
		System.out.println("brr.length="+brr.length);
		for(float[] f:brr) {
			for(float y:f) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println("================");
		//double 유형의 3차원 배열을 선언과 동시에 메모리 할당하고 초기화하세요
		//for루프 돌려서 출력하기
		
		double [][][] d= {{{1,2,3},{4,5}},{{010, 011,017},{10,'B'},{0,10,100}}}; //중괄호가 3번
		System.out.println(d.length);
		
		//강사님
		for(double[][]d1:d) {
			for(double[]d2:d1) {
				for(double d3:d2) {
					System.out.print(d3+" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("*");
		//내가푼거
		for(double[][]d1:d) {
			for(double[]d2:d1) {
				for(double d3:d2) {
					System.out.print(d3+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("================");
		double [][][]drr={{{1,2,3},{'a'}},{{10},{20}}};
		
		for(int i=0;i<drr.length;i++) {
			for(int j=0;j<drr[i].length;j++) {
				for(int k=0;k<drr[i][j].length;k++) {
					System.out.print(drr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}//

}//
