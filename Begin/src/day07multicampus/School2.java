package day07multicampus;
//Student, Teacher, Staff 클래스들의 멤버변수들을 모두 캡슐화하고, setter getter 메소드를 구성하세요.
//학생객체(학번 이름 전공) 교사 직원 객체생성하고 정보를 할당해보세요

public class School2 {

	public static void main(String[] args) {
		
		
		//[1] 학생객체를 생성하고, 학번, 이름,전공값을 할당하세요
		Student2 s1=new Student2();
		s1.setNo(1);
		s1.setName("홍길동");
		s1.setMajor("SW(소프트웨어)");
		
		System.out.println("------학생정보-------");
		System.out.println("학번: "+s1.getNo());
		System.out.println("이름: "+s1.getName());
		String mj=s1.getMajor(); 
		System.out.println("전공: "+s1.getMajor());
		
		//메소드로 하는 방법
		s1.showInfo();
		
		//[2] 교사객체를 생성하고, 교번, 이름,과목값을 할당하세요
		Teacher2 t1=new Teacher2();
		t1.setNo(1);
		t1.setName("김영란");
		t1.setSubject("인공지능");
		
		t1.showInfo();
		/*System.out.println("교번: "+t1.getNo());
		System.out.println("이름: "+t1.getName());
		System.out.println("과목: "+t1.getSubject());*/
		
		//[3] 직객체를 생성하고, 학번, 이름,부서값을 할당하세요
		Staff2 stf1=new Staff2();
		stf1.setNo(1);
		stf1.setName("임철수");
		stf1.setDept("인사부");
		
		stf1.showInfo(); 
		/*
		System.out.println("------직원정보-------");
		System.out.println("사번: "+stf1.getNo());
		System.out.println("이름: "+stf1.getName());
		System.out.println("부서: "+stf1.getDept());*/
			

		//문제1]학생 객체를 2개 더 생성하고...
		//        각각 이름,학번,전공 값을 넣어준뒤...
		//			배열에 저장하자.
		//			for루프 돌리면서 저장된 학생 객체들의
		//         정보를 출력해보자.
		
		Student2 s2=new Student2();
		s2.setNo(2);
		s2.setName("김철수");
		s2.setMajor("데이터과학");
		
		Student2 s3=new Student2();
		s3.setNo(3);
		s3.setName("이영희");
		s3.setMajor("인공지능"); 
		
		
		Student2 [] arr1=new Student2[3];//배열 생성
		arr1[0]=s1;
		arr1[1]=s2;
		arr1[2]=s3;
		
		for(int i=0;i<arr1.length;i++) {
			Student2 st=arr1[i];
					//System.out.println(st);
					st.showInfo(); //정보를 보여줌
		}
		
			
			/*[문제2] 교사 객체 1개 더 생성
			 * 값 할당 후 배열에 저장 후, 확장for루프 이용해서 교사정보 출력하기
			 * 
			 */
		Teacher2 t2=new Teacher2();
		t2.setNo(2);
		t2.setName("김교사");
		t2.setSubject("빅데이터");
		
		Teacher2 arr2[]= {t1, t2};
		
		for(Teacher2 tc: arr2) { //확장for루프
			tc.showInfo(); //정보량이 많으니 메소드를 이용했다. 스캐너를 이용하는 방법도 있다
		}

		

	}

}
