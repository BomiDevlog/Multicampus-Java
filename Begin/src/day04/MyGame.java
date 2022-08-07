package day04;
import java.util.*;

public class MyGame {

	public static void main(String[] args) {
		
		// 힌트 Math random /while이나 for반복문으로 무한루프/ if조건
		//출력할 결과: "맞췄습니다", 시도한 횠수: 6번
		//시도 횟수가 7번을 넘어서면 "못 맞췄군요! 다음기회에" 출력 후 프로그램 종료시키기
		Scanner sc=new Scanner(System.in);
		
		int comp=(int)(Math.random()*100+1);//1<= comp< 101 사이의 임의의 정수를 랜덤하게 발생시킨다 (범위에서 마지막은 포함안하니까 100보다 1큰 101범위)
		int count=0; //시도횟수를 세기위한 변수
		while(true) { //조건식이 true니까 계속 반복//못맞췄을때 계속 루한루프
				System.out.println("1~100사이의 정수를 입력하세요=>"); 
				int input=sc.nextInt(); //정수를 하나 입력받기
				if(input<1||input>100) {//범위를 범위를 벗어난 수에 대해서 새로하라고 하는 조건이라 작은수입력 큰수입력 힌트없이 정수입력하라고 말함 //횟수로 카운트 안함
					continue;
				}
				count++;
				if(count>6) { //count>7이라고 조건 주면 8회까지 된다
					System.out.println("시도 횟수 초과!! 아~ 못맞췄군요! 다음 기회에!");
					//break;//시도 횟수 초과!! 아~ 못맞췄군요! 다음 기회에! 게임 시도횟수: 6
					return; //가상기계로 돌아가니까 맨뒤의 게임시도횟수를 출력안함
				}
				if(comp==input) {
					System.out.println("정답! 맞췄습니다~");
					break;
			}else if(comp>input) {
				System.out.println("더 큰 수를 입력하세요");
			}else {
				System.out.println("더 작은 수를 입력하세요");
			}
				//여기서 카눔트조건걸면 숫자힌트나오고 다음기회가 나옴
		}
		System.out.println("게임 시도횟수: "+count);
		
		
		//-----------------------------------------------------------
		
		//1랜덤한 수를 컴퓨터가 뽭는다/ 2입력함 입력값이 범위벗어나면 다시하게끔/ 3횟수를 늘리면서 넘기면 끝/ 4값이 같으면 정답 작거나 같으면 힌트 /5마지막에 게임시도횟수와 카운트 
		
		int com=(int)(Math.random()*100+1);
		
		int num=0;
		while(true) {
			System.out.println("1~100사이의 정수를 입력하세요=>");
			Scanner si=new Scanner(System.in);
			int inp=si.nextInt();
			if(inp<1||inp>100) {
				System.out.println("범위를 벗어났습니다 다시 입력해주세요");
				continue;
			}
			num++;
			if(num>6) {
				System.out.println("시도초과! 다음기회에!");
				return;
			}
			if(com==inp) {
				System.out.println("정답");
				break;
			}else if (com>inp){
				System.out.println("더 큰 수를 입력하세요");
			}else {
				System.out.println("더 작은 수를 입력하세요");
			}
			
			
		}
		System.out.println("게임 시도 횟수: "+num);
		
		

	}//

}//
