
package day05;

public class ArrayTest5 {

	public static void main(String[] args) {
		/*[문제1] 2차원 배열에 아래와 같은 값이 저장되도록 하세요.
		 *        단, for루프를 이용해서 저장한 뒤, 저장된 값들을
		 *        출력해봅시다.
		 *        
		 *        1 0 0 0 0
		 *        0 1 0 0 0
		 *        0 0 1 0 0
		 *        0 0 0 1 0
		 *        0 0 0 0 1
		 * */

		int [][]arr=new int[5][5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if (i==j) {// =하면 에러.같은가~대한 내용은 ==이다! 디폴트값이 0이니까 1에대한 조건을 주면 된다.
					arr[i][j]=1;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		/*정하운
		 * int a[][] = new int[5][5];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(i==j) {
					a[i][j] = 1;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

		 */
		/* 김현섭
		 * System.out.println("Q1.------------------------------");
		int [][]a;
		a=new int[5][5];
		
		a[0][0]=1;
		a[1][1]=1;
		a[2][2]=1;
		a[3][3]=1;
		a[4][4]=1;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length ; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		 */
		/*한소예
		 * int [] a [];//2차원 배열 선언
		
		//[2] 메모리 할당 => 5행5열
		a = new int[5][5];
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(i==j) {
					a[i][j] = 1;
				}
				else {
					a[i][j] = 0;
				}
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}

		 */
		
		/*[문제2] 아래 선언한 변수들의 자료유형을 맞추세요
		 * 1) int i, j; 
		 * 2) int []i, j; 
		 * 3) int i[][], j[];
		 * 4) int []i, j[]; 
		 * 5) int [][]i, j; 
		 * 6) int i,j[][]; 
		 * */ 
		
		
				/*[문제2] 아래 선언한 변수들의 자료유형을 맞추세요 (정답):,로 나열하면 변수이름 전까지가 공통이다.
				 * 1) int i, j; ===> i,j 모두 정수형
				 * 2) int []i, j; ==>i:1차원 배열, j:1차원 배열  // int[]이 공통이고 ,로 연결된 자료유형
				 * 3) int i[][], j[]; ==> i: 2차원 배열, j: 1차원 배열 //공통으로 int이고 각각 2차원, 1차원
				 * 4) int []i, j[]; ==> i: 1차원 배열, j: 2차원 배열 //int[]공통. 
				 * 5) int [][]i, j; ==> i,j 모두 2차원 배열
				 * 6) int i,j[][];  ==> i : 정수형, j: 2차원 배열
				 * */ 

		
		
				
		
		
	}

}
