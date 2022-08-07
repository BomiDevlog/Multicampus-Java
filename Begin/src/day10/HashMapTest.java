package day10;
import java.util.*;
import java.io.*;
/*HashMap
 * - Map 계열
 * - 무순서 ( 입력순서와 출력순서가 다를 수 있음 )
 * - key값을 Set으로 관리한다
 */

//컴파일은 이클립스에서하고 명령어를 도스에서 받을 것
public class HashMapTest {
	HashMap<String, String> map=new HashMap<>();
	
	public void join(){ //회원가입 메소드
		map.put("Hong", "123");
		map.put("Lee", "abc");
		map.put("Admin", "tiger");
		System.out.println(">> 회원 가입 완료 [회원수: "+map.size()+"명] <<");
	}
	//id를 key값에, pwd를 value값에 저장했다
	
	public void loginCheck() {//로그인 메소드
		Console console=System.console(); //import java.io.*; 해줘야함
		while(true) {
			System.out.print("아이디: ");
			String userid=console.readLine();//사용자가 엔터치기전의 값을 반환해줌 
			//이클립스에서 테스트하면 x => console이 null이 되므로 도스창 열어 테스트하기
			//System.out.println("userid: "+userid); 확인용으로 써본거
			System.out.print("비밀번호: ");
			char[] pwd=console.readPassword(); //눈에 보이지않게 처리//패스워드를 글자하나하나 쪼개서 배열에 저장
			//System.out.println("pwd: "+pwd);//해시코드로 나옴
			//System.out.println("pwd: "+new String(pwd)); //문자그대로 나옴.//테스트용으로 써본거
			
			//비밂번호의 로그인 맞음 틀림. 아이디존재여부
			/*[문제]
			 * 1) 입력한 아이디가 map에 저장되어 있는지 체크
			 * 	 1_1) 없다면 => "입력 오류! 회원이 아닙니다."
			 * 	 1_2) 있다면
			 * 			<a> 비밀번호가 일치하는 경우 => "~님 환영합니다"
			 * 			<b> 비밀번호가 일치하지 않는 경우 => "비밀번호가 일치하지 않아요"
			 */
			
			if (!map.containsKey(userid)) {
				System.out.println("입력오류! 회원이 아닙니다.");
			} else {
				String realPwd=map.get(userid);
				// ==: 기본 자료유형: 값을 비요
				//		참조유형: 주소값을 비교
				//boolean equals(Object o) : String의 경우 문자열의 내용이 같으면 true반환
				if (realPwd.equals(new String(pwd))) {
				//if (map.containsValue(new String(pwd))) { //없는 비밀번호 치면 일치안함 근데 문제는. Hong에서 abc해도 일치라고 나옴 있는 값은 전부 일치라고 나옴
				//if (realPwd==new String(pwd)) { //주소값을 비교해서 문자가 같은데 다르다고 나옴
					System.out.println(userid + "님 환영합니다.");
					break;// => 다른 서비스 이용하게 반복문 벗어남
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue; // => 반복문 다시 해서 로그인시도
				}
			}

			
		}
	}
	
	
	
	public static void main(String[] args) {
		//join()을 호출하세요
		HashMapTest hm=new HashMapTest(); //static이 아니면 클래스를 자료유형으로 객체생성.
		hm.join();// 해당클래스의 메소드 까꿍~
		hm.loginCheck(); 
		//콘솔창에 NullPointerException나옴 이클립스에서 onsole.readLine() 확인 못하고 도스창에서 확인해야함

		
		/*도스창에 cd C:\Users\PC\git\firstGit\Begin\bin
		 * java day10.HashMapTest 검색 (java하고 패키지명)
		 * 
		 * 컨트롤 C하면 종료
		 * 
		 */
	}

}
