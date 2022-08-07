package day04;

public class Test {

	public static void main(String[] args) {
		////[4-2] 1~20의 정수 중 2 또는 3의 배수가 아닌 값의 총합
		
		int sum=0;
		for(int i=1; i<21; i++) {
			//if(!((i%2==0) || (i%3==0))) 
			if(i%2!=0 && i%3!=0) 
			{ 
				System.out.println("i: "+i);
				sum=sum+i;
				
			}
		}
		System.out.println("sum: "+sum);
		
		
		//[4-3]1~10까지의 합
		sum=0;
		int totalSum=0;
		for(int i=1;i<11;i++) {
			//sum=sum+1;
			sum+=i; // 1+2+3+...+10
			totalSum+=sum; // 1, 1+2, 1+2+3, ..., 1+2+3+...+10
		}
		System.out.println("sum: "+sum);
		System.out.println("total sum: "+totalSum);
		
		
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
		
	}//

}//
