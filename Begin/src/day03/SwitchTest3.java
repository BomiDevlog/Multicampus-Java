package day03;
import java.util.*;
public class SwitchTest3 {

	public static void main(String[] args) {

		
		/*문제2] ***수도요금 계산***************
		  -메뉴 (1 ~ 3), 사용량 (liter)
		     1. 가정용 (liter당 50원)
		     2. 상업용 (liter당 45원)
		     3. 공업용 (liter당 30원)
		     =>메뉴 선택후 사용량을 입력받는다.
		   -출력될 내용
		    1) 사용자 코드, 사용량, 총수도요금
		     cf)사용요금=사용량 * 리터당 가격
		        총수도요금=수도사용요금+세금(요금의
		            5%)
		  */ //좀더 까다로운 문제
		
		
		System.out.println("------------Menu------------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("----------------------------");
		System.out.println("메뉴를 선택하세요 =>");
		System.out.println("----------------------------");
		Scanner sc=new Scanner(System.in); //콘솔창에 직접 입력을 할수 있는 장치
		int no=sc.nextInt(); //메뉴 번호 //long no=sc.nextInt(); 으로 하면 문법에 어긋나서 에러.
		System.out.println("사용량을 입력하세요 =>");
		int use=sc.nextInt(); //사용량
		//switch~case문 이용해서 문제해결 해보는 문제풀어보기
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		
		int cost=0;
		switch (no) {
		case 1 :
			cost=50*use;
			break;
		case 2 :
			cost=45*use;
			break;
		case 3 :
			cost=30*use;
			break;
		default :
			System.out.println("없는 코드 입니다");
			return;
		}
		System.out.println("사용자 코드: "+no);	
		System.out.println("사용요금: "+cost+"원 입니다");
		System.out.println("총수도요금: "+cost*1.05+"원 입니다");
	
		
		
		
		/*정서현 코드
		 * int result=0;
		switch(no) {
		case 1: //가정용
			result = use*50;
			break;
		case 2: //상업용
			result = use*45;
			break;
		case 3://공업용
			result = use*30;
			break;
		default:
			System.out.println("메뉴에서 선택해주세요.");
			return;
		}
		System.out.println("사용자 코드: "+no);
		System.out.println("사용요금: "+result+"원 입니다.");
		System.out.println("총수도요금: "+result*1.05+"원 입니다.");
	}





		 //정하운 코드
		/*int result = 0;
		String x = " ";
		
		switch(no) {
		case 1:
			result = 50 * use;
			x = " [가정용 (liter당 50원)]";
			break;
		case 2:
			result = 45 * use;
			x = " [상업용 (liter당 45원)]";
			break;
		case 3:
			result = 40 * use;
			x = " [공업용 (liter당 40원)]";
			break;
		default:
			System.out.println("없는 메뉴입니다");
		return;
		}
		System.out.println(no+"번 메뉴\n"+use+"L 사용"+x+"\n사용요금 = "+result+"원\n총 수도요금 = "+(result+result*5/100)+"원");

		 * 
		 */
		
		//======================================
		
		
		
		System.out.println("============메뉴===========");
		System.out.println("1. 가정용 (liter당 60원");		
		System.out.println("2. 상업용 (liter당 55원");	
		System.out.println("3. 공업용 (liter당 40원");	
		System.out.println("=======================");
		System.out.println("메뉴를 선택하세요=>");
		Scanner si=new Scanner(System.in);
		int number=si.nextInt();
		System.out.println("=======================");
		System.out.println("사용양을 입력하세요=>");
		int volume=si.nextInt();
		System.out.println("메뉴를 선택하세요=>");
		System.out.println("=======================");
		
		int costs=0;
		switch (number) {
		case 1 :
			costs=volume*60;
			break;
		case 2 :
			costs=volume*55;
			break;
		case 3 :
			costs=volume*40;
			break;
		default :
			System.out.println("메뉴에서 다시 선택해주세요");
			return;
		}
		System.out.println("사용자 코드: "+number);
		System.out.println("사용 요금: "+costs);
		System.out.println("총 수도요금: "+costs*1.05);
		
	}//
	

}//
