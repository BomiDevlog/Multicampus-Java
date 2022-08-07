package day04;

public class MathTest {

	public static void main(String[] args) {
		/*https://www.oracle.com/java/technologies/
		 * https://docs.oracle.com/en/java/javase/14/docs/api/index.html
		 * https://docs.oracle.com/en/java/javase/18/
		 * https://docs.oracle.com/en/java/javase/14/docs/api/index.html
		 * 여기서 찾는다. 라이브러리에서 많은 기능을 찾아볼 수 있다
		 */
		//java.lang.Math클래스의 멤버변수
		//public static final double PI : 상수(항상 같은 값)이다. 이것은 원주율(3.14)/ final  상수를 만들때/ double 실수형의 자료형
		
		//System.out.println(PI); 변수를 찾을수없다고 에러
		System.out.println(Math.PI);
		//static이 붙은 변수들은 앞에 클래스명을 붙여준다. [클래스명.변수]식으로 접근한다..
		
		//메소드: 기능을 가지고 있다. 객체지향언어는 함수라는 말 대신 메소드라고 부름
		//static 메소드(클래스 메소드): 클래스명.메소드명(값)
		//public static double sqrt​(double a) : 매개변수 a의 제곱근을 구해서 반환한다//앞의 더블은 반환타입. 더블타입의 변수를 앞에 선언해야한다
		//public static double ceil​(double a) : a의 올림값
		//public static double floor​(double a) : a의 내림값
		//public static int round​(float a) : a의 반올림값을 int로 반환  ///라운드2가지 중 더블은 롱. 플롯은 인트로 반환
		//public static long round​(double a)
		//public static double random​() : 0.0<=r<1.0 사이의 임의 난수를 발생시켜 반환해준다
		
		
		//제곱근
		double b=Math.sqrt(64);
		System.out.println("64의 제곱근: "+b); //반환타입이 더블이라서 8.0으로 소수점으로 나옴
		
		
		//45.0123의 올림값, 내림값, 반올림값을 구하세요
		
		double num=45.0123;
		
		double c=Math.ceil(num);
		System.out.println(num+"의 올림값: "+c);
		
		double f=Math.floor(num);
		System.out.println(num+"의 내림값: "+f);
		
		long r=Math.round(num);
		System.out.println(num+"의 반올림값: "+r);
		
		int r2=Math.round((float)num);
		System.out.println(num+"의 반올림값: "+r2); //형변환 주의!
		
		//올림 내림은 xx.0으로 나오고. 반올림은 소수점없이 정수로 나옴
		
		
		//public static double random​(): 0.0<=r<1.0 사이의 임의 난수를 발생시켜 반환해준다
		double r3=Math.random();
		System.out.println("r3: "+r3);
		
		//[문제1] 0<=r4<10사이의 임의의 정수를 발생시켜 출력하세요. (단, 랜덤 메소드 활용: random() 활용하라는 뜻)
		double r4=Math.random();
		int n=(int)(r4*10); //int n=(int)r4*10; r4부터 형변환계산하면 int가 소수점버려서 n=무조건 0나와서 원하지않는값
		System.out.println("n "+n);
		
		
		//[문제2] 5<=r5<15사이의 임의의 정수를 발생시켜 출력하세요.
		//double r5=Math.random();
		int n2=(int)(Math.random()*10+5);
		System.out.println("n2: "+n2);
		
		//double r5=Math.random(5<=r5 & r5<10); [x]
		
		
		//int x= (int)(Math.random()*범위+시작수) : random을 푸는 공식
		//범위값은 문제에서 제시한범위-시작수를 빼서 넣어줌                                                                                                          
		//     정수면 int 소수면 float 문자면 char로 형변환
		
		
		//이창환
		// [문제 1] 0<= r4 < 10 사이의 임의의 정수를 발생시켜 출력하세요
				//double r4 = Math.random();
				//System.out.println("문제1 r4: "+ Math.round(r4*10)); //10이 포함되어 버린다
				
				// [문제 2] 5<= r5 < 15 사이의 임의의 정수를 발생시켜 출력
				//double r5 = Math.random();
				//System.out.println("문제2 r5: "+ (Math.round(r5*10)+5));

		//[문제3] 16<=r6<48사이의 임의의 정수를 발생시켜 출력하세요.
		//double r6=Math.random();
		int n3=(int)(Math.random()*32+16);
		System.out.println("n3: "+n3);
		
		/*강시안
		double r6=Math.random();
		int k=(int)(Math.random()*32+16);
		System.out.println("랜덤 정수3: "+k);
		
		
		double r7=Math.random();
		char Al=(char)(Math.random()*25+65); //제트가 안들어감 26으로 수정 아스키코드활용해서 푸는 방법
		System.out.println("랜덤 정수3: "+Al);
		*/

		
		/*문제4 알파벳 대문자를 무작위로 추출해서 아래와 같은 형태로 출력되도록 하세요
		 * W I P O A
		 * T B P W Z
		 * C E R Y I
		 */
		
		for(int i=0;i<3;i++) { //행의 조건: 3줄 세로
			for(int u=0;u<5;u++) { //열의 조건: 가로 5번인데 01234 5번으로 조건 준 경우
				char ch=(char)(Math.random()*26+'A'); //알파벳 26자. 시작은 A
				System.out.print(ch+"\t"); //열:가로로 5번 print로 이어쓰는 데 /t띄어쓰기
			}
			System.out.println();//행: 가로조건이 다 되면 세로 줄바꿈
		}
		
		
		

		/*이창환
		System.out.println("문제4 :");
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				double r7 = Math.random();
				char n4 = (char)(r7*25+65);
				System.out.print(n4 + "\t");
			}
			System.out.println();
		}
*/
		/*정하운
		 * for(int i=1; i<=3; i++) {
			int j = 1;
			while(j<=5) {
				double r7 = Math.random();
				System.out.print((char)(r7*25+65)+" ");
				j++;
			}
			System.out.println();
			i++;
		}

		 */
			
		/*int j = 1;
		while(j<=5) {
			double r7 = Math.random();
			System.out.print((char)(r7*25+65)+" ");
			j++;
		}
		System.out.println();
		i++;
	}*/

		/*정유진
		 * for(int l=1;l<=3;l++) {

			for(int j=1;j<=5;j++) {

				char ch=(char)('A'+(Math.random()*25+1));

				System.out.print(ch+" ");

			} System.out.println();

		}

		 * 
		 */
		
		
		
	}//

}//
