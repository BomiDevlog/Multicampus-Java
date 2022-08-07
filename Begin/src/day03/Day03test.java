package day03;

public class Day03test {
	//[연습문제5]
	public static void main(String[] args) {}}/*

		//[4-1] 1번
		int x=12;
		if(x>10 && x<20) {
			System.out.println("true1");
		} 
	
		//[4-1] 2번
		char ch='A';
		if(!(ch==' ' || ch=='\t')) //''은 틀림
		{
			System.out.println("true2");
		}
		//다른 풀이
		if(ch!=' '&&ch!='\t') {
			System.out.println("공백 아니고 탭도 아님");
		
		//[4-1] 3번
		char ch2='0';
		if(ch2=='x' || ch2=='X') {  //2개를 대입할수없으니 =만 하면 에러 
			System.out.println("true3");
		} 
		
		//[4-1] 4번
		char ch3='0';
		if(ch3>='0' & ch3<='9') {
			System.out.println("true4");
		}
		
		//[4-1] 5번
		char ch4='0';
		if((ch4>='a' && ch3<='z')||(ch4>='A' && ch3<='Z')) {
			System.out.println("true5");
		}
		
		
		
		//[4-1] 6번 윤년문제
		int year=2020;
		if((year%400==0)|| (year%4==0 && year%100!=0)) {
			System.out.println(year+"년은 윤년입니다");
			
		//[4-1] 7번  
			
			boolean powerOn=false;
			if(powerOn==false) {
				System.out.println("powerOn은 false");
			}
			if(!powerOn)
				System.out.println("powerOn은 false");
		
		//[4-1] 8번 
		//== : 참조형에서는 주소값을 비교한다. 기본자료형에서는 값을 비교
	
	//String str="yes"; //yes나옴
	String str=new String("yes");
	//문자열의 내용값을 비교하는 메소드;
	
	//boolean equals(Object o): 문자열의 내용이 같으면 true를 반환한다
	//if(str=="yes") { //no나옴
	if(str.equals("yes")) { //OK나옴
		System.out.println("OK");
	}else {
		System.out.println("NO");
	}
			
		
		//[4-2]
		int plus=0;
		for(int c=1;c<=20 ; c++) {
			if(!(c%2==0)){
			plus +=c;
			}else if(c%3==0) {
				plus +=c;
			}
		}
		System.out.println("1~20까지의 수 중 2또는 3의 배수가 아닌 수의 합: "+plus);
		
		
		//[4-3]
		for(int d=1;d<=100;d++) {
			if(d%17==0)
				System.out.println("1~100까지의 수 중 17로 나누어 떨어지는 수: "+d);
		}
		
		
		
		
	}//

}//
*/