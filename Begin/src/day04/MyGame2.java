package day04;
import java.util.Scanner;
public class MyGame2 {
	
	//사용자 정의 메소드 //메소드르 구성했지만, 메소드를 불러주지(호출) 않으면 실행되지않음 //메소드에 static이 붙으면 클래스명을 붙여줌
	public static void showMenu() { //반환타입이 없을 떄 보이드void
		System.out.println("******** Game Menu ********");
		System.out.println("1.가위 2.바위 3.보 9.종료");
		System.out.println("***************************");
		System.out.println("입력하세요=>");
		System.out.println("***************************");
		
		
		
		
		
		
		
	}//
	
	public static String show(int num) { //1,2,3
		//스트링이 반환타입 /반환 타입 있을 때 메소드 끝에 표기
		String str="";
		switch(num) {
		case 1: str="(가위)"; break;
		case 2: str="(바위)"; break;
		case 3: str="(보)" ; break;
		default: str="";
		}
		return str;
	}//----------------
	
	//반복문 돌면서 컴퓨터와 가위바위보 게임을 진행하세요
	//그 결과를 아래 형태로 출력하세요
	/*[1]
	 * 당신: 1 (가위)
	 * 컴퓨터: 2(바위)
	 * ----------
	 * 당신이 졌군요ㅠㅜ/ 이겼군요^^/ 비겼군요~
	 * 
	 * [2] 9를 입력하면 ByeBye~~ 종료
	 * 
	 * [3] 메뉴에 없는 번호를 입력하면 "입력 오류! 메뉴에 없는 번호입니다!" 출력 후 입력기회를 다시 준다
	 * 
	 * 경우의 수
	 * 나==컴퓨터 
	 * 내가 이긴경우 :if문에 조건을 써야함 (가위:보)|(보:주먹)|(주먹:가위) 3가지
	 * 나머지 =내가 진 경우
	 * 
	 * //int my=sc.nextInt(); //내가 낸 값
		//System.out.println("Bye Bye~~");
	 * 
	 */
	

	//내장 메소드
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;) { //무한루프 
			MyGame2.showMenu(); //static의 클래스명을 붙여서 클래스를 호출함 이걸해야 실행
			int comp=(int)(Math.random()*3+1);
			int my=sc.nextInt();
			if(my==9) {
				System.out.println("Bye Bye~~");
				break; //9번 종료
		}
		if(my<1||my>3) {
			System.out.println("입력 오류! 메뉴에 없는 번호입니다");
			continue;
		}//값이 유효하지 않을 때를 먼저 걸렀다
		String msg="";
		if(my==comp) {
			msg="비겼군요!";
		}else if((my==1 && comp==3) ||(my==2 && comp==1)||(my==3 && comp==2)) {
			msg="당신이 이겼네요!^^";
		}else {
			msg="당신이 졌군요ㅠㅠ";
		}
		System.out.println("당신: "+my+MyGame2.show(my)); //문자열을 반환해서 넣어줌 static이니까 클래스명
		System.out.println("컴퓨터: "+comp+MyGame2.show(comp));
		System.out.println(msg);
		}//for
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* 정서현
		while(true) {
			int my=sc.nextInt();
			if(my==9) {
				System.out.println("Bye Bye ~~~");
				break;
			}
			if(my==comp) {
				System.out.println("비겼습니다.");
			}else if((my==1 && comp==3)||(my==2 && comp==1)||(my==3 && comp==2)){
				System.out.println("이겼습니다 ^^.");
			}else {
				System.out.println("졌습니다 ㅜㅜ.");
			}
			int comp=(int)(Math.random()*2+1);

		
		*/
		
		

	}//

}//
