package day03;
import java.util.Scanner;
public class IfTest3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("평균 점수를 입력하세요=>");//실수로 점수를 받아보겠다 //콜솔창에 점수를입력하면 아래에 평균점수가 나온다.
				float score =sc.nextFloat();
				System.out.println("평균 점수: "+score);
				
				/*문제
				 * 100~90 : A
				 * 80~89.xxx : B
				 * 70~ : C
				 * 60~ : D
				 * 60미만 : F
				 * 다중 if문을 이용해서 작성해보세요
				 * if(조건식1){
				 * 
				 * }else if(조건식2){
				 * 
				 * }else if(조건식3){
				 * 
				 * }else {
				 * 
				 * }
				 */
				
				
				char hak=' '; //지역변수(local variable)는 반드시 초기값을 주고 사용해야 한다. 초기값을 부여하지않고 char hak;이런식이면 오류남
				
				if (score>=90) {     
					hak='A';
				}else if(score>=80) {   //90<score<80 하지않는다 이미 앞서 걸렀기때문 //내림차순으로 if조건의 순서를 정해야한다
					hak='B';
				}else if(score>=70) {   //내림차순 하지않으면 범위가 의도와 다르게 잘못 설정ㅇ됨
					hak='C';
				}else if(score>=60) {
					hak='D';
				}else {
					hak='F';   			//else는 조건없이 바로 괄호.
				}
				System.out.println("학점: "+hak);
				
				
				//순서 바꾸려고 할 때
				/* if (score>=80 && score<90) {     
					hak='B';
				}else if(score>=90 && score<=100)  {   //범위를 명확하게 설정하면  순서와 상관없이 의도한 결과 나옴
					hak='A';
				}else if(score>=70 && score<80) {   
					hak='C';
				}else if(score>=60 && score<70) {
					hak='D';
				}else {
					hak='F';   			
				}
				System.out.println("학점: "+hak);
				*/
				 
				 
				//===============================================
				
				Scanner si=new Scanner(System.in);//스캐너쓴다
				System.out.println("평균 점수를 입력");//두개세트
				long score2=si.nextLong();
				
				System.out.println("평균점수="+score2);
				
				char grade=' ';//기본값
				if (score2>=90) {
					grade='A';
				}else if (score2>=80){
					grade='B';
				}else if (score2>=70){
					grade='C';
				}else if (score2>=60){
					grade='D';
				}else {
					grade='F';
				}
				System.out.println("학점="+grade);
					
	
					

	}//

}//
