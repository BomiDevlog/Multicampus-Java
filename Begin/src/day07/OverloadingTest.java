package day07;

import day07multicampus.Student2;

public class OverloadingTest {

	public static void main(String[] args) {
		
		//슈퍼맨 객체 2개 생성한 뒤 getInfo()호출해서 정보 출력하기
		//아쿠아맨 객체 1개 생성한 뒤 getInfo()호출해서 정보 출력하기
		
		Superman s1=new Superman();
		Superman s2=new Superman("수퍼히어로",205,150);
		
		System.out.println(s1.getInfo());
		System.out.println(s2.getInfo());
		//System.out.println(s1); 해시코드 나와버림;;
		
		Superman s3=new Superman("강철");
		String str=s3.getInfo();
		System.out.println(str);
		
		Superman s4=new Superman("황금",188,500);
		System.out.println(s4.getInfo());
		//다양한 형태로 객체 생성할 수 있다.
		
		
		/*생성자를 구성하지 않으면 컴파일러는 기본적으로 디폴트 생성자를 제공해준다. (생성자를 제공안했기때문에 자료형의 기본값 0,null로 제공됨)
		 * 한 개라도 생성자를 구성하게 되면, 제공되던 디폴트 생성자는 사라진다.//기본 생성자는 에러남
		 * =>가능하면 기본생성자를 구성한 뒤에 다른 생성자를 구성하는 습관을 들이자(필요없어도 기본적으로 만들어두기)
		 */
		Aquaman a1=new Aquaman(); 
		Aquaman a2=new Aquaman("아쿠아",199,156);
		System.out.println(a1.getInfo());
		System.out.println(a2.getInfo());
		
		/*슈퍼맨 객체 4개를 배열에 저장하세요
		 * 그런 뒤 for루프 이용해서 슈퍼맨들의 정보를 출력하세요
		 */
		
		
		//정하운 나보다 깔끔한코드다
		Superman arr[] = {s1,s2,s3,s4};
		for(int i=0; i<arr.length; i++) {
			System.out.println("**************");
			System.out.println(arr[i].getInfo());
		}

		/*내가 푼거 다시 확인
		Superman arr1[]=new Superman[4];
		arr1[0]=s1;
		arr1[1]=s2;
		arr1[2]=s3;	
		arr1[3]=s4;
		
		for(int i=0;i<arr1.length;i++) {
			Superman sup=arr1[i];
			sup.getInfo();
		}*/
				
				
		
		/*박지혜
		 * //슈퍼맨 객체 2개 생성한 뒤 getInfo()호출해서 정보 출력하기
		Superman s1=new Superman(); //기본 생성자 호출
		
		System.out.println("슈퍼맨 이름: "+s1.name);
		System.out.println("슈퍼맨 키: "+s1.height);
		System.out.println("슈퍼맨 파워: "+s1.power);

		 * 
		 * 정서현
		 Superman s1 = new Superman();
		System.out.println(s1.getInfo());

		 */
		
		/*
		Superman s1=new Superman();
		System.out.println("이 름: "+s1.name);
		System.out.println(" 키  : "+s1.height+"cm");
		System.out.println("초능력: "+s1.power);
		
		Superman s2=new Superman("수퍼히어로",208);
		System.out.println("이 름: "+s2.name);
		System.out.println(" 키  : "+s2.height+"cm");
		System.out.println("초능력: "+s2.power);
		
		Aquaman a1=new Aquaman();
		System.out.println("이 름: "+a1.name);
		System.out.println(" 키  : "+a1.height+"cm");
		System.out.println("초능력: "+a1.speed);
		
		Aquaman a2=new Aquaman("히어로즈",195);
		System.out.println("이 름: "+a2.name);
		System.out.println(" 키  : "+a2.height+"cm");
		System.out.println("초능력: "+a2.speed);
*/

	}//

}//
