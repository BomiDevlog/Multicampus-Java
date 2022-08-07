package day07;

public class CoffeeMachine {
	
	//테이블에 커피가 노출된 상태. 데이터 보호가 안되어있음.
		/*int coffee;
		int sugar;
		int cream;*/
	
		private int coffee;
		private float sugar;
		int cream;
		
		//setter  값입력
		public void setCoffee(int a) {
			coffee=a;
		}
		public void setSugar(float s) {
			sugar=s;
		}
		
		//getter 값출력
		public int getCoffee() { //같은 반환타입으로 설정
			return coffee;
		}
		public float getSugar() {
			return sugar;
		}

}
