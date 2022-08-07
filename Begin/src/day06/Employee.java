package day06;
/*인사관리 프로그램
 * ==> 객체: 집, 건물, 책상, 컴퓨터, 카메라.... (연관성이 없는 특징말고 연관성있는 객체를 뽑아라)
 * 			사원, 부서, 급여... (관련된 속성만 클래스로 옮긴다)
 * 			일을 한다, 휴식한다, 잠을 잔다, 점심을 먹는다ㅏ... (행동양식을 메소드로 옮긴다)
 * 객체 = 속성(attribute) + 행동양식(behavior)
 * 			명사형			동사형
 * ==>객체들을 프로그램 세계로 끌어들이는 것(추상화-Abstraction)//객체를 추출해 클래스로 구성한다는 의미
 * 			[1] 속성 ==> 멤버변수
 * 			[2] 행동양식 ==> 메소드
 * 
 * 
 */
import java.util.*; //Date를 쓰려면 import해줘야한다
public class Employee {
	
	//속성을 멤버변수(인스턴스 변수) 로 구성//static이 안붙은걸 인스턴스변수라고 한다
	int no;//사번
	String name;// 사원명
	String dept;//소속 부서
	int salary;//급여
	Date indate;//입사일

	
	//행위==> 메소드로 구성
	public void work(String type) {//어떤 유형의 일을 한다~ 메소드를 구성해보겠다 //[]들어가니까 뒤의 파일에서 오류생김
		System.out.println(name+"은 "+type+"일을 하고 있어요.");

	}//
	
	
	public int receive_sal(){
		
		return salary*12;
	}

}//
