package day08;

public class Yuja { //카페에 커피가 아닌 차를 추가한다는 가정으로 새로운 자료유형을 만들려고. 
	//캡슐화를 하면서 진행해보겠다
	
	private int yuja;
	private int sugar;
	
	//setter는 void, 매개변수 있음
	public void setYuja(int y) {
		yuja = y;
	}
	public void setSugar(int s) {
		sugar = s;
	}
	
	//getter는 return, 매개변수 없음
		public int getYuja() {
			return yuja;
		}
		public int getSugar() {
			return sugar;
		}
		
	
	

}
