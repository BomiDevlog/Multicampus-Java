package day02;

public class UnaryOperator {
	
		//main
	public static void main(String[] args) {
		System.out.println("1. 단항 연산자 (부호연산자: +,-)");
		int a=8;
		System.out.println(+a);
		System.out.println(-a);
		System.out.println("2. 증감연산자 : ++,--");
		int b=5;
		long c=9;
		b++; //b=b+1 //b의 값을 1씩 증가시켜 다시 b의 결과값으로 대입
		c--; //c=c-1
		System.out.println(b); //6
		System.out.println(c); //8
		++b;
		--c; //++,--가 변수 앞이든 뒤이든 같은 작용
		System.out.println(b); //7 
		System.out.println(c); //7
		//++, --가 단독으로 사용될 때는 변수 앞에 오나 뒤에 오나 별 차이 없다.
		//하지만 다른 수식과 함께 사용되면 ++,--가 앞에 오는 것과 뒤에 오는 것(후위연산)은 차이가 생긴다.
		float d=5.3f;
		double e=7.3;
		System.out.println(d++); //즉 출력값5.3, d=6.3 
		//단독 사용이 아니라 출력문에서 사용되는 상황에, ++이 뒤에 오면(후위연산), d를 출력하는데 먼저 사용하고, 나중에 ++이 적용되어 다음 결과는 6.3
		System.out.println("d: "+d); //6.3
		System.out.println(++d); //7.3 ++이 앞에 오면, d에 플러스1적용하고 출력됨. 
				
		System.out.println(e--); //7.3 //--가 뒤에 와서 e출력하고 다음결과에 --반영
		System.out.println("e: "+e); //6.3
		
		//문제
		int x=10;
		int y=x++; //10을 넣고 ++적용하니 x=11,y=10
		System.out.println("x="+x);//x=11 (앞서 x++영향으로 11)
		System.out.println("y="+y);//y=10 (x++대입하였을때 10을 먼저대입해서 ++은 나중이니까)
		
		x=10;
		int z=++x; //++10이라 x=11, y=11
		System.out.println("x="+x);//x=11
		System.out.println("z="+z);//11
		
		System.out.println("3. 비트별 not연산자: ~");
		//정수값을 비트로 바꾸고 연산을 수행하는데, 
		//비트별 not연산자는 1은 0으로 바꾸고, 0은 1로 바꾸는 연산자
		//3: 0011 (4bit의 이진수로 표현)
		//-3: 1100 (비트별 not연산자 적용)
		int m=3;
		//int는 32bit. 
		// 3: 00000000 00000000 00000000 00000011
		//~3: 11111111 11111111 11111111 11111100
		// -1*2^31+ (1*2^30)....
		//첫비트가 부호비트이고, 1로시작하면 음수니까 첫비트만 -1 곱해줌
		// 간단한 계산법: 반복되는 1들을 전부 날리고, 마지막100만 이진수를 십진수로 계산: -1x2^2=-4
		System.out.println(m);
		System.out.println(~m);
		
		//문제 (프로그램에 잘 안쓰고 자격증 시험에 가끔 나옴)
		int n=0xfffffff1; //0x이니 16진수, f=15, 15를 2진수로 표현하면 1111의 4bit
		//n=1111 1111 1111 1111 1111 1111 1111 0001
		System.out.println("~n: "+(~n));
		//~n=0000 0000 0000 0000 0000 0000 0000 1110 
		//첫 비트 0이니까 양수 (음수 아니니까 주의!), 1x2^3 + 1x2^2 + 1x2^1 = 8+4+2=14
		
		//참고. 2진수계산 예시 42(십진수) => 00101010(이진수의 8bit로 표현 => 1byte규격)
		//int는 4byte(32bit) 
		// 42: 00000000 00000000 00000000 00101010
		//~42: 11111111 11111111 11111111 11010101 로 비트반전시켜줌 
		//십진수 계산: -1x2^6 + 1x2^4 + 1x2^2^ +1 =-64+16+4+1=-43 //참고 2^6=64 
		//음수라고 전부 곱하는게 아니라 첫비트만 -이고 다른 곳은 +로해서 더하기로 상쇄될 수 있다
		
		System.out.println("4. 논리 부정 연산자: !");
		//boolean형에만 사용가능하다. int형에는 사용할 수 없다.
		//true => false로, false=>true로 바꾼다
		boolean bo=true;
		System.out.println(bo); //true
		System.out.println(!bo); //false
		System.out.println(!(3<2));//true 논리부정하니까
		
		int fo=5;
		System.out.println(fo==5.0); //== (등가연산자) : 기본자료형에서는 값이 같은지 비교한다 //값이 같으니까 true 
		System.out.println(fo!=5.0);// != : 기본자료형에서는 값이 다르면 true, 같으면 false //값이 같으니까 false
		
		
		
	}
	
	
}
