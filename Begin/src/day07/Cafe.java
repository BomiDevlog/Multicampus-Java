package day07;

public class Cafe {

	public static void main(String[] args) {
		
		CoffeeMachine cm=new CoffeeMachine();//메소드 호출
		//cm.coffee=2;
		cm.setCoffee(2);
		//cm.sugar=3;
		cm.setSugar(3.5f); //f안붙이면 오류
		cm.cream=1;
		
		//System.out.println("커피: "+cm.coffee);
		System.out.println("커피: "+cm.getCoffee());
		System.out.println("설탕: "+cm.getSugar());
		System.out.println("크림: "+cm.cream);
	}//

}//
