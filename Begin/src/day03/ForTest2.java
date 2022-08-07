package day03;


public class ForTest2 {

	public static void main(String[] args) {
		
		/*[문제1]for루프문을 이용해서 구구단 7단을 아래 형식으로 출력하세요
		 * 7 x 1 =7
		 * ...
		 * 7 x 9 =63
		 * 
		 */
		
		int dan=7;
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" x "+i+" = "+dan*i);
		}

		
		//[문제2] 1~10까지의 합을 구해 출력하세요 -for루프문 이용
		// 1+2+3+...+10 더한 값을 받아줄 변수를 정하고 초기값 설정(덧셈에 지장을 주지않을 초기값0)
		int sum=0;
		for(int a=1;a<=10;a++) {
			sum +=a; //sum=sum+a;
		}
		System.out.println("1~10까지의 합: "+sum);
		
		
		//[문제3] 1~10까지의 곱을 구해 출력하세요
		
		int gop=1; //(곱을 담아줄 변수. 곱셈에 지장을 주지않을 초기값 1)
		for(int b=1;b<=10;b++) {
			gop *=b; //gop=gop*b;
		}
		System.out.println("1~10까지의 곱: "+gop);
		
		
		//[문제4] 1~100까지의 수 중 짝수들의 합을 구해 출력하세요
		
		int plus=0;
		for(int c=1;c<=100 ; c++) {
			if(c%2==0)
			plus +=c;
		}
		System.out.println("1~100까지의 수 중 짝수의 합: "+plus);
		
		//마저풀기
		
		/*김현섭
		 int sum1=0;
		for(int c=1;c<101;c++) {
			if(c%2 == 0)
				sum1=sum1+c;
		}
		System.out.println("1~100까지의 수 중 짝수들의 합: "+sum1);

		 * 
		 */
		
		/*2씩 증가
		 * 
		 * int sum2=0;
		 * for(int c=0;c<101;c+=2;{
		 * sum2+=c;
		 * }
		 * System.out.println("1~100까지의 수 중 짝수들의 합: "+sum2);
		 * 
		 */
		
		//[문제5] 1~100까지의 수 중 17로 나누어 떨어지는 수를 출력하세요.(17의 배수 문제)
		
		
		for(int d=1;d<=100;d++) {
			if(d%17==0)
				System.out.println("1~100까지의 수 중 17로 나누어 떨어지는 수: "+d);
		}
		
		
			
		
		//[문제6] 대문자 알파벳 [A ~ Z] 을 for 이용해서 출력하세요
		
		for(int a=65;a<91;a++) {
			System.out.print((char)a+", ");
		}
		System.out.println();//줄바꿈
		
		for(char a='A';a<='Z';a++) {
			System.out.print(a+", ");
		}
		
		////
		System.out.println("\n");
		//==========================
		/*[문제1]for루프문을 이용해서 구구단 4단을 아래 형식으로 출력하세요
		 * 7 x 1 =7
		 * ...
		 * 7 x 9 =63
		 * 
		 */
		
		
		int dan2=4;
		for(int k=1;k<=9;k++) {
			System.out.println(dan2+"x"+k+"="+dan2*k);
		}
		
		//[문제2] 1~100까지의 합을 구해 출력하세요 -for루프문 이용
				// 1+2+3+...+10 더한 값을 받아줄 변수를 정하고 초기값 설정(덧셈에 지장을 주지않을 초기값0)
		
		int sums=0;
		for(int im=1;im<=100;im++) {
			sums+=im;
		}
		System.out.println("1~100의 합="+sums);
		
		//[문제3] 1~9까지의 곱을 구해 출력하세요
		
		int x=1;
		for(int ix=1;ix<10;ix++) {
			x*=ix;
		}
		System.out.println("1~9의 곱="+x);
		
		//[문제4] 1~100까지의 수 중 홀수들의 합을 구해 출력하세요
		
	
		
		int hap=0;
		for(int h=1;h<=100;h++) {
			if(h%2==1) ///////////////////////////if 뒤에 ;넣으면 조건실행안되서 100까지 전체합나와버림
			hap +=h;
		}
		System.out.println("1~100 중 홀수의 합="+hap);
		
		//[문제5] 1~100까지의 수 중 19로 나누어 떨어지는 수를 출력하세요.(17의 배수 문제)
		
		for(int n=1;n<=100;n++) {
			if(n%19==0)
				System.out.println("19의 배수"+n);
		}
		
		//[문제6] 소문자 알파벳 [a ~ z] 을 for 이용해서 출력하세요
		
		for(char an='a';an<='z';an++) {   ////문자인 'a' 'z'를 홑따옴표안하면 에러
			System.out.print(an+",");
		}
		
		
	}//

}//
