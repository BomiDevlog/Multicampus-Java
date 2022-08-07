package day07;

public class Aquaman {
	//Aquaman has a name, power(초능력)... //캡슐화해야하는데 생략하고 진행하겠다
	
		String name;
		int height;
		double speed;
		
		/*
		public Aquaman() {
			// 값을 구현안하면 기본값 나온다: 0 null
		}*/
		
		//this 이용해서 초기화 해보세요
		public Aquaman() {
			this("수중인간",155,56.78);
		/*name="수중인간";
		height=155;
		speed=78;*/
		
	}
		
		//매개변수 3개 반는 생성자 구해보지
		public Aquaman(String name, int height, double speed) {
			this.name=name;
			this.height=height;
			this.speed =speed;
		}
		
		public String getInfo() {
			// 정보를 문자열로 반환하는 메소드를 구성
			String info="이름: "+name+"\n키: "+height+"\n스피드: "+speed;
			return info;
		}
		
		
		
		//인자생성자 2개
		/*
		public Aquaman(String name, int height) {
			this.name=name;
			this.height=height;
			speed=94;
			
		}*/
		
		
		
		
}//
