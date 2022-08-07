package day06;

public class Test2 {

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
		arr[x+2][y=2]=++cnt; //25넣어줌
		
///////////////////////4개씩 반복하고 나서 그 다음은 2개씩 반복돌려서 채워준다
		
		System.out.println("---------------------");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
