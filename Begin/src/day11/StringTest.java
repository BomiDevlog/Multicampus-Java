package day11;

public class StringTest {

	public static void main(String[] args) {
		/*java.lang.String : final클래스. 상속받을 수 없다.
							immutable(불변성) :문자열 결합이나 삭제, 수정 등의
							작업을 할 때 원본문자열은 그대로 두고 새로 생성함
		 */
		
		String s1="Java";
		s1+=" Language";
		System.out.println(s1);

		/* s1-----x----> "Java"'
		 * s1---------> "Java Language";
		 */
		
		//[1] concat(): 문자열을 결합
		String s2=s1.concat(" Nice");
		System.out.println("s2 :"+s2);
		System.out.println("s1 :"+s1); //더하기가 더 편하니까 더하기로 주로 쓴다
		
		//[2] char charAt(int i) 
		char c1=s1.charAt(5);
		//0123456789101112
		//Java Language 공백도 포함
		System.out.println("c1 :"+c1);
		
		
		//문자열 중에 숫자가 아닌것을 찾는 것
		String s3="567A8";
		
		boolean isNum=true;
		for(int i=0;i<s3.length();i++) {
			char ch=s3.charAt(i);
			System.out.print(ch+", ");//5, 6, 7, A 나옴
			if(!(ch>='0' && ch<='9')) { //숫자가 아닌 문자가 있다면
				isNum=false;
				break; //숫자가 아닌 것이 있으면 반복문을 도중에 벗어나도록.
			}
			//System.out.print(ch+", "); 567까지 나옴
		}
		String result=(isNum)? "숫자 입니다":"숫자가 아닙니다"; //삼항연산자 ()가 true이면 앞의 값, false이면 뒤의 값 대입
		System.out.println("\n 변수 s3는 "+result);
		
		/*int indexOf(String str) : str 문자열이 위치한 곳의 index번호를 반환한다
		 * 							만약 str문자열이 없다면 -1을 반환한다.
		 * (문자열 검색할 때 자주 쓰는 기능)		 */
		String s4="어머님은 짜장면이 싫다고 하셨어. 어머님은 짜장면이 ..."; //인덱스는 첫글자가 0, 공백도 숫자 센다
		
		int idx=s4.indexOf("짜장면"); //문자열 앞에서부터 찾음
		System.out.println("idx: "+idx);
		
		//int lastIndexOf(String str): 문자열 뒤에서부터 찾음 
		 idx=s4.lastIndexOf("짜장면");
		 System.out.println("idx: "+idx);
		 
		 idx=s4.indexOf("짬뽕"); //없으면 -1을 반환
		 System.out.println("idx: "+idx);
		 
		 //String substring(int start, int end): 인덱스 start에서부터
		 //										end-1까지의 문자열을 반환한다.
		 System.out.println(s4.substring(s4.indexOf("짜장면"), s4.lastIndexOf("짜장면")));
		 System.out.println(s4.substring(5));
		 System.out.println("원본 확인 s4: "+s4);//불변성(immutable)이기에 전체 문자열 그대로 나옴
		 
		 
		 //String replace(String oldStr,String newStr) 새로운 문자열로 대체
		 System.out.println(s4.replace("짜장면", "짬뽕"));
		 System.out.println("원본 확인 s4: "+s4);//불변성(immutable)이기에 전체 문자열 그대로 나옴
		 
		 String s5="  100#Tom#반갑습니다~ 오늘도 즐거운 하루 되세요  ";
		 System.out.println("s5.length(): "+s5.length()+" "+s5);
		 //String trim(): 무자열 앞, 뒤의 공백문자를 제거한다.
		 String s6=s5.trim();
		 System.out.println("s6.length(): "+s6.length()+" "+s6);
		 
		 //String toUpperCase()/ toLowerCase()
		 //String[] split(String regex): 특정 패턴문자열을 기준으로 문자열을 쪼개어 배열에 담아 반환한다.
		 String[] tokens=s5.split("#");
		 System.out.println("tokens.length: "+tokens.length);
		 System.out.println("tokens[0]="+tokens[0]);//반복문해도 되고 일일이 출력문해도됨.
		 System.out.println("tokens[1]="+tokens[1]);
		 System.out.println("tokens[2]="+tokens[2]);
	}
}
