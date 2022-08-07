package day06;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		/*[연습문제7] 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
		수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력
		라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어
		프로그램을 완성하시오.
		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다*/
		Scanner sc=new Scanner(System.in);
		int[] coinUnit= {500, 100, 50, 10};
		System.out.println("가지고 있는 돈을 입력하세요=>");
		int money=sc.nextInt();
		System.out.println(money+"원");
		System.out.println("----------------------");
		for(int i=0;i<coinUnit.length;i++) {
			int su=money/coinUnit[i]; //갯수
			System.out.println(coinUnit[i]+"원 :"+su);
			money=money%coinUnit[i]; //money%=coinUnit[i];  예로.2680-2500=180
		}
		
		/*(어려운 문제^^)
		 * 1씩 증가시키면서 arr에 저장하되 아래외 같이 저장하세요
		 * 1	2	3	4	5	
		 * 16	17	18	19	6
		 * 15	24	25	20	7
		 * 14	23	22	21	8	
		 * 13	12	11	10	9 달팽이모양
		 */
		
		int[] arr[]=new int[5][5];
		int cnt=0;
		int x=0, y=0;//배열의 index로 사용할 변수를 선언
		
		//반복문을 4번돌림
//////////////////
		for(int k=0;k<2;k++) {
		
			for(int i=0;i<4-2*k;i++) {
				arr[x+k][y+k]=++cnt;  
				y++; //(0.0)부터 y증가시커 1234
			}
			if(x+y==4-2*k) { //=은 에러 //(0.4)지점에는 x값증가하니 아래로 5678
				for(int i=0;i<4-2*k;i++) {
					arr[x+k][y+k]=++cnt; 
					x++;
				}
			}
			if(x==y) {//둘다 4.4지점이니까
				for(int i=0;i<4-2*k;i++) {
					arr[x+k][y+k]=++cnt;
					y--;//(4.4)지점부터 왼쪽으로 9,10,11,12
				}
			}
			if(x+y==4-2*k) {
				for(int i=0;i<4-2*k;i++) {
					arr[x+k][y+k]=++cnt;
					x--; //위쪽방향으로 13,14,15,16
				}
			}
			
		}//k변수 for루프
///////////////////////4개씩 반복하고 나서 그 다음은 2개씩 반복돌려서 채워준다
		
		System.out.println("---------------------");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

	}//

}//
