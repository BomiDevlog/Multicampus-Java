package day07;

import day07multicampus.Demo;
import day08.CoffeeMachine;

/*#구인 구직 프로그램을 작성한다고 가정합시다

[1] 잡코리아나 사람인 사이트를 살펴보고
해당 프로그램에 필요한 객체를 2개 추출하세요
ex) 구직자, 구인회사, 헤드헌터,...
회사이름 구직자회사이름 광고 등

[2] 추출한 객체를 class로 구성하세요.
이때  속성은 3개 이상, 메소드는 2개 이상 구성하세요
추상화. 클래스이름을 반드시 의미있게 짓는 연습. 속성을 추출
구직자의 프로필, 희망연봉

채용정보(회사이름 산업업종 지역)  구직자(이름 나이 학력 희망연봉)

[3] 속성은 캡슐화하고, setter와 getter를 구성하세요

[4] 생성자를 구성하되 2개 이상 구성하세요=>오버로딩
this()이용해서 초기화하기

[5] main()메소드에서 해당 객체들을 생성해 테스트 하세요
JopApp 클래스생성==>main()메소드 구성하기

	 * 
	 */
public class JopApp {

	public static void main(String[] args) {

		JobOpening o1=new JobOpening(); //클래스 소환
		JobOpening o2=new JobOpening("Sophistication","전자","플랫폼 구축", "서울특별시 서초구");//생성자를 불러야함
		JobOpening o3=new JobOpening("Cretivity","IT","빅데이터 분석", "부산광역시 금정구");
		JobOpening o4=new JobOpening("Connection","해운","스마트 물류", "부산광역시 강서구");
		o1.showInfo();//메소드 소환 자체가 출력이라 syso불필요해서 오류

		System.out.println("=====현재 모집 중인 채용 공고입니다=====");
		o1.showInfo();
		o2.showInfo();
		o3.showInfo();
		o4.showInfo();
		
		System.out.println("=====채용 공고 추가 입력=====");
		o1.inputInfo();
		
		System.out.println("=====현재 구직 중인 구직자 내역입니다=====");
		JobHunter h1=new JobHunter();
		JobHunter h2=new JobHunter("정성혜",27,"사무직",3000);
		JobHunter h3=new JobHunter("김철훈",32,"개발직",4000);
		h1.showInfo();
		h2.showInfo();
		h3.showInfo();

		
		

	}//

}//

