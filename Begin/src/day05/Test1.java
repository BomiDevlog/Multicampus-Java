package day05;

public class Test1 {

	public static void main(String[] args) {
		
		
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
		
		//풀이
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
		
		System.out.println("확장for루프로 바꿔보았당");
		for (int [] arr1  : arr) {
			for(int arr2: arr1) {
				System.out.print(arr2+"\t");
			}
			System.out.println();
		}
		
		/*원래정답
		 * for(int i=0;i<arr.length;i++) {
		 * for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		 */
			
		
		/*[연습문제7] 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
		수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력
		라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어
		프로그램을 완성하시오.
		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다*/
		
		//내가 푼거/ 쌤보가 코드가 복잡/쌤코드가 더 깔끔하고 좋음
		int[] coinUnit= {500, 100, 50, 10};
		
		int money=2680;
		System.out.println("money="+money);
		
		int rest=0;
		int count=0;
		for(int i=0;i<coinUnit.length;i++) {
			while(money>=coinUnit[i]) {
				count+=1;
				money-=coinUnit[i];
			}
			rest=money%coinUnit[i]; 
			System.out.println("동전 개수: "+coinUnit[i]+"원까지"+count+"개");
			System.out.println(coinUnit[i]+"을 계산한 잔액: "+rest+"원");
			}
		
		/*int[0] coinUnit=500원짜리
		int[1] coinUnit=100원짜리
		int[2] coinUnit=50원짜리
		int[3] coinUnit=10원짜리
			*/
		//2680 .../500=5몫(2500)동전개수 %남은나머지 180잔액
		//2680/2500하면 5개몫 2680-(500x5) 5개/ 그다음은 잔액이어야함 180-100 1개 /80-50=1개 /30 10x3개
		//500 5개. 100원1개. 50원1개 10원3개
		
		
		System.out.println("================");
		double [][][]drr={{{1,2,3},{'a'}},{{10},{20}}};
		
		for(double[][] drr1: drr) {
			for(double[] drr2:drr1) {
				for(double drr3:drr2) {
					System.out.print(drr3+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	
		

	}//

}//
