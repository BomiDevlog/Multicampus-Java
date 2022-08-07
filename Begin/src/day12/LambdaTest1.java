package day12;
/*매개변수 2개를 받아서 두 수 중 큰 수를 반환하는 함수를 람다식으로 구현해보자.
 * [1] 람다식을 구현하기 위해서는 먼저 인터페이스를 만들어야 한다.
 * [2] 인터페이스에 람다식을 구현할 메서드를 선언한다. (추상메서드)
 */

@FunctionalInterface
interface MyNum{
	int getMax(int a, int b); //최대치를 구해볼 변수를 선언.
	//인터페이스 내 추상메서드는 하나만 선언해야 한다.
	//int getMin(int a, int b); [x] 함수형 인터페이스에서는 추상메서드 하나만!
}//

public class LambdaTest1 {

	public static void main(String[] args) {
		//인터페이스타입으로 변수선언
		MyNum m1= (int x, int y)->{
			if(x>=y) {
				return x;
			}else {
				return y;
			}
		}; //중괄호에 세미콜론으로 끝을 낸다//이것이 람다식 함수
		System.out.println(m1.getMax(55,77));
		System.out.println(m1.getMax(-2,0));
		
		MyNum m2= (a,b)->(a>=b)? a:b; //삼항연산자활용해서 위의 조건문을 간단하게 표현
		System.out.println(m2.getMax(71, 90));

	}

}
