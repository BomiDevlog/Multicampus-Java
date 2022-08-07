package practice;

import java.util.Scanner;

public class practice220703 {
	
	public static void main(String[] args) {
	
	
	

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
