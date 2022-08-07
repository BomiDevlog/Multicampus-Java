       package day03;

/*반복문 (loop문)
 * [1] for루프문
 * 
 * 		for(변수 선언문;조건식;증감식)
 * 		{
 * 			실행문;
 * 		}
 * 조건식 true일 동안 실행문을 반복해서 실행한다
 * 
 */
public class ForTest {

	public static void main(String[] args) {
		
		int k;//멤버변수 => 초기화하지않으면 기본값(0)이 할당된다.
		
		
		System.out.println("Hellow world~");

		//i=1 변수 선언, i<=7 조건식이 true이면 실행문대로 실행.그리고 i++이적용되어 다시 조건식
				//false일 때 for루프구문이 끝. 그리고 괄호다음으로 벗어나 다음 식(포루프랑 별개의 식)으로 넘어가서 디엔드.
		for(int i=1;i<=7;i++) {
			System.out.println("Hi world~ : "+i);
		}
		System.out.println("~~The End~~"); 
		//System.out.println("~~The End~~"+i); for루프 내의 지역변수이기에 괄호밖에서는 인식안됨
		//지역변수 i의 scope(범위)=> for루프 내에서만 살아있음
		
		
		
		int j=10;// 지역 변수 초기화 식
		for(;j>3;j--) {
			System.out.println("Java: "+j);
		}
		System.out.println("##The End##"+j); //j=3이 나온다
		//j의 scope는 main()메소드 블럭까지 살아있다. 메인이 끝나는 시점에 죽음. 그러니까 모든 수식이 그대로 적용된 값이 결과값이 됨
		
		//조건 없으면 무한 루프 -일부 프로그램은 무한가동해야함 //빨간색 버튼 누르면 중지됨
		//for(;;)
			//System.out.println("@@@@@"); //무한가동되어서 잠시 꺼둠 반드시 확인하기!
		
	
		
		
		//==================================
		
		for(int in=1;in<5;in++) {
			System.out.println("잘 하고 있어 파이팅"+in);
		}
		System.out.println("성공");
	
		
	
		int jn=5;
		for(;jn>1;jn--) {
			System.out.println("이것도 잘하지"+jn);
		}
		System.out.println("또 성공이다 ㅎㅎ"+jn);
		
		
		
	}//main()

}//class
