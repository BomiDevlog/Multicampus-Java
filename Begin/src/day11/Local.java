package day11;
/*Local Inner class: 메서드 블럭 안에 클래스를 구성한 경우
 *  [1] 이름있는 로컬 이너 클래스
 *  [2] 이름없는 로컬 이너 클래스 -더 많이 사용
 * 
 */
//지역변수와 비슷한 특징을 가진다

public class Local {
	String str="멤버변수@@@";
	
	public void bar() {
		class LocalInner{ //같은이름의 이너클래스를 만들 수 있기에 구분하기위해 파일명에 숫자가 붙는다.
			
		}
	}
	
	public void sub() {
		double pi=3.14;//지역 변수(local var)
		System.out.println("str+"+str);
		System.out.println("pi: "+pi);
		
		class LocalInner{//local inner class
			String lstr="LocalInner의 멤버변수###";
			void foo() {
				//str,lstr,pi출력
				System.out.println("str="+str);
				System.out.println("lstr="+lstr);
				System.out.println("pi="+pi);
				
				//pi=5.12;//error발생. 변경 불가
				/*로컬 이너 클래스 안에서는 final이 아닌 지역변수는 접근 불가	 
				 * 즉 멤버변수를 지역안에서 바꿀수 없기때문. 출력용으로만 쓸 수 있다*/
	
			}
		}//
		/*로컬 이너 클래스는 자기가 속한 메서드 안에서만 객체생성해야됨
		 * 또한 클래스가 구성된 후에 객체 생성이 가능함
		 * (소속된 클래스안에서만 사용가능.)
		 */
		
		LocalInner li=new LocalInner();
		li.foo();
		
	}//sub()---

	public static void main(String[] args) {
		
	//LocalInner의 foo()호출하기 [x] 멤버는 접근가능하지만 로컬은 접근x이기때문.
	//Local의 sub()호출하기
		
		Local lc=new Local();
		lc.sub();
	

	}

}

