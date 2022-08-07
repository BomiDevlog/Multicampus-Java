package day02;

public class MyOperator2 {

	public static void main(String[] args) {
		System.out.println("4. 비트연산자 : &, |, ^");
		//정수에만 사용되는 연산자
		// & (and연산자) : 두 비트가 모두 1일 때 1, 한개라도 0이면 0
		// | (or연산자) : 두 비트 중 한 개라도 1이면 1, 모두 0이면 0 //| =[시프트+역슬래시]로 입력
		// ^ (xor연산자) : 두 비트가 서로 다르면 1, 같으면 0
		
		int x=3; //0011 32bit이지만 간략히 적음
		int y=5; //0101
		
		
		System.out.println("x&y="+(x&y));
		//&=> 0001 =>10진수로 계산해 1
		System.out.println("x|y="+(x|y));
		//or => 0111 =>10진수로 계산해 4+2+1=7
		System.out.println("x^y="+(x^y));
		//xor => 0110 => 10진수로 계싼해 4+2=6
		
		System.out.println("5. 논리 연산자: &, &&, |, ||");
		//true, false 논리식에서만 사용되는 연산자. &(and), |(or)이라고 해석해보기.
		/*		
		1) &, &&
		2) |, ||

		&, | 의 경우: &,| 연산자를 사용하면 앞의 연산으로 결과를
					     알 수 있어도 뒤의 문장까지 비교한다. (더 꼼꼼하게 체크함)
        &&,|| 의 경우:  앞의 연산으로 결과를 알 수 있을 경우
							뒤의 문장은 수행하지 않는다.
							예를 들어 &&의 경우, 앞의 연산결과가 false이면
							뒤의 연산을 생략. (어차피 false)
							||의 경우 앞의 연산결과가 true이면 뒤의 연산을 생략 (어차피 true)
		*/
		//&(and): 두 조건이 모두 true일 때 true, 한개라도 false이면 false
		
		int a=5; 
		int b=6; 
		if((a>b) & (a>0)) {
			System.out.println("Hello");
		}else if((b>a)| (b<0)) {
			System.out.println("Hi");
		}
		
		if((a>b) && (a>0)) {
			System.out.println("Hello");
		}else if((b>a)|| (b<0)) {
			System.out.println("Hi");
		} //같은 결과인데 처리속도가 더 빠르다
		
		
		//[문제1]
		int i=1;
		int j=i++; //j=1, i=2
		if((i>++j) & (i++ ==j)) { //(2>2)&(++이 뒤에 오니까 i를 비교하는데 쓰고 ++적용해서, 2==2이고 i=3) 즉 false&true
			i=1+j;
		}
		System.out.println("i="+i); //i=3
		
		int i2=1;
		int j2=i2++; //j=1, i=2
		if((i2>++j2) && (i2++ ==j2)) { //(2>2)false이니까 뒤의 값을 수행안함 그래서 i=2 그대로)
			i2=1+j2; 
		}
		System.out.println("i2="+i2); //i=2
		
	
			                                                                                                      


	
		
		//[문제2] 
				int k=0;
				int p=1;
				if((k++ ==0)|(p++ ==2)) { //true되고 k=1, false되고 p=2
					k=42;
				}
				System.out.println("k="+k+",  p="+p); //k=42,  p=2
				// ||이면 if에서 k=1, p=1//k=42,  p=1
				
				
								
				//[문제3]  
				boolean r=false;
				boolean e=false;
				boolean w=((r=true)||(e=true)); //|일때 
				System.out.println(r+", "+e+", "+w);
				}
	// |일 때 앞선 false정의와 달리 r=true, e=true로 바뀌고, w=true// 결과값 true true true
	//||일 때  r=true라서 뒤를 계산안하고 바로 w=true// 결과값 true false true .
	//boolean w=(r=false)||(e=false); 라고 문제내면 false false false
				
	
		

	

	

}
