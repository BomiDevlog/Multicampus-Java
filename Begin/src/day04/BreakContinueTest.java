package day04;

public class BreakContinueTest {

	public static void main(String[] args) {

		/* 보조 제어문: break, continue => 단독으로는 사용못함, 주 제어문과 함께 사용한다
		 * 
		 * 
		 */
		
		//결과 예측해보기 break와 continue의 차이를 알기
		
		//for단문으로 break continue
		System.out.println("1.------------------");
		for(int i=0;i<3;i++) {
			if(i==1)
				break; //가장 가까운 반복문을 벗어난다.// 조건걸릴때부터 바로 종료됨
			System.out.println("i="+i);
		}
		
		System.out.println("1-2.------------------"); //비교하려고 내가 만든거 1-2
		for(int i=0;i<3;i++) {
			System.out.println("i="+i);
		}
		
		System.out.println("2.------------------");
		for(int i=0;i<3;i++) {
			if(i==1)
				continue; //조건에 맞으면 아래 문장을 실행하지 않고(skip) 반복문을 계속 수행하라 /즉 이 조건일 때만 실행안하고 나머지는 전부 수행
			System.out.println("i="+i);
		}
		
		//for복문으로 break continue
		System.out.println("3.------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) break;
				System.out.println("i="+i+", k="+k);
			}
		}
		
		System.out.println("4.------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) continue;
				System.out.println("i="+i+", k="+k);
			}
		}
		
		//for복문에 label넣어  break continue
		System.out.println("5.------------------");
		outer: //label(레이블) 라벨 딱지를 붙이는 것 //
		for(int i=0;i<3;i++) {
			inner:  //label(레이블) 
			for(int k=0;k<3;k++) {
				if(k==1) break outer; //바깥쪽 아우터와 가까운 반복문을 벗어난다(break) 즉 완전히 벗어남
				System.out.println("i="+i+", k="+k);
			}
		}
		
		System.out.println("6.------------------"); //3번과 같은 결과가 나왓네~
		outer:
		for(int i=0;i<3;i++) {
			inner:
			for(int k=0;k<3;k++) {
				if(k==1) continue outer; //k=1일때 더이상 출력하지않고 아우터로가서 바깥쪽 반복문을 다시 돈다(continue)
				System.out.println("i="+i+", k="+k);
			}
		}
		
		
		
		
		
	}//

}//
