package day03;
//중첩 for루프문
public class ForTest3 {

	public static void main(String[] args) {

		for(int i=2;i<4;i++)  
			{
			for(int k=1;k<3;k++)
			{
				System.out.println("i="+i+", k="+k);
				
			}//for===
			System.out.println("*********");
		}//for===========
		
		
		/*[문제 1] 중첩 for루프를 이용해서 아래 모양이 출력되도록 해보세요
		 * ★★★★★
		 * ★★★★★
		 * ★★★★★
		 * 나오게하려면. 3행(바깥for/세로) 5열(내부for/가로) 
		 */
		
		/*char star='★';
		for(int a=1; a<=3; a++)
		{
			for(int b=1;b<=5;b++)
			{
				System.out.print(star);
			}
			System.out.println();
		}
		*/
		
		
		/* 강사님 풀이
		 * 
		 * for(int i=1;i<6;i++) 
		 * {
		 * System.out.print("★");
		 * }
		 * 
		 * 이러면 별5개나옴. 이걸 3번 반복되게 만들게 중첩시킴
		 * */
		
		  
		 for(int k=1;k<4;k++) //가로3
		 {
		  for(int i=1;i<6;i++)// 세로5
		  {
			  System.out.print("★");//가로로 별 연속다섯게
		  }
		  System.out.print("\n");//한줄띄우기
		  }
		 
		
	
		
		
		
		/*[문제 2] 중첩 for루프를 이용해서 구구단 전체를 출력되도록 해보세요
		 * 2x1=2	3x1=3	... 9x1=9
		 * 2x2=4	3x2=6	... 9x2=18
		 * ...
		 * 2x9=18	3x9=27	... 9x9=81
		 * 나오게하려면. 9행(바깥for) 8열(내부for) 
		 * // 가로 행는 2~9 세로는 열 1~9를해야한다 이걸 변수로 준다
		 */
		
		
		 
		 for(int i=1;i<10;i++){ //행의 조건
			 for(int k=2;k<10;k++){ //열의 조건
			 System.out.print(k+"x"+i+"="+k*i+"\t"); //\t로하면 띄어쓰기 간격이 일정하다
			 }
			 System.out.print("\n");
		 }
		
		 //-----------------------------
		 
		 /*[문제 1] 중첩 for루프를 이용해서 아래 모양이 출력되도록 해보세요 $모양으로
			 * ★★★★★
			 * ★★★★★
			 * ★★★★★
			 * 나오게하려면. 3행(바깥for/세로) 5열(내부for/가로) 
			 */
		 for(int ga=1;ga<6;ga++) {
			 for(int se=1;se<4;se++) {
				 System.out.print("$");
			 }
			 System.out.print("\n");
		  }
		 
		 
			/*[문제 2] 중첩 for루프를 이용해서 구구단 전체를 출력되도록 해보세요 9단부터 2단으로
			 * 2x1=2	3x1=3	... 9x1=9
			 * 2x2=4	3x2=6	... 9x2=18
			 * ...
			 * 2x9=18	3x9=27	... 9x9=81
			 * 나오게하려면. 9행(바깥for) 8열(내부for) 
			 * // 가로 행는 2~9 세로는 열 1~9를해야한다 이걸 변수로 준다
			 */
		 
		 
		 for(int a=1;a<10;a++) {
			 for(int b=2;b<10;b++) {
				 System.out.print(b+"x"+a+"="+a*b+"\t");
			 }
			 System.out.print("\n");
		 }
		 System.out.println("구구단 완료");
		
	}//

}//
