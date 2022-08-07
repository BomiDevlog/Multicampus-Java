package day09;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println(" 각 도형의 면적을 구해 봅시다.");
		System.out.println("가로 :"+7+", 세로: "+8+"----------");
		
		//[문제] 사각형
		Rectangle rt=new Rectangle();
		rt.area(7, 8);
		
		//[문제] 삼각형
		Triangle ta=new Triangle();
		ta.area(7, 8);
		
		System.out.println("반지름: 8인 원의 면적 ----------");
		//[문제] 원
		/*Circle cr=new Circle(); [x]
		 * 추상 클래스는 타입 선언은 할 수 있으나, new해서 객체 생성은 할 수 없다.
		 */
		
		Circle cr=new SubCircle();
		//부모 타입 변수 선언=new 자식객체를 생성
		cr.area(8,0);//오버라이딩한 메서드 호출 가능 / 그러나 내용을 입력안해줘서 출력은 안되는 상태
		//cr.area(8); [x] 자식고유의 것을 오버로드할 수 없다! 
		((SubCircle)cr).area(8); //자식타입으로 강제형변환하면 가능해짐!
		
		SubCircle sc=new SubCircle();
		sc.area(8);
		
		System.out.println("=====[문제1]=====");
		/*[문제1] rt, ta, cr, sc 객체들을 저장할 배열을 생성하고 저장한 뒤
		 * 		for루프 돌리면서 area() 호출해보기. 20,30
		 */
		Shape sh[] = {rt, ta, cr, sc};
		for(int i=0; i<sh.length; i++) {
			if(i<2) {
				sh[i].area(20,30);
			}
			else if(i>=2) {
				((SubCircle)sh[i]).area(20);
			}
		}
		System.out.println("=====(다른 풀이)=====");//확장 for루프 응용
		for(Shape shape : sh) {
			if(shape instanceof SubCircle) {  
				((SubCircle)shape).area(20);
			}else {
				shape.area(20, 30);
			}
			System.out.println("*****");
		}
		

		

	}

}
