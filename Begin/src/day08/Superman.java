package day08;
//Superman is a Human 관계 성립. 부모클래스를 상속받는 자식클래스.
//Superman is a Object(객체, 단군클래스) 그러나 extends Human, Object라고 표기x
public class Superman extends Human {
	int power;
	
	//Super();기본생성자를 묵시적으로 호출하기때문에 부모인 Human에서 기본생성자 없으면 에러남
	//일일이 값주는게 불편해서 생성자 만듬. 기본생성자만들고 매개면수 3개짜리 생성자
	public Superman() {
		
	}
	
	public Superman(String n, int h, int p) { //Super();
		name=n;
		height=h;
		power=p;
	}
	
	
	/*메소드 오버라이딩(Override)-메소드 재정의
	 * 부모로부터 상속받은 메소드를 다시 정의해서 구현하는 것 (마치 부모에게 물려받은 집을 자식이 리모델링하듯이)
	 *  -오버라이딩의 조건
	 *	 [1] 부모의 메소드 이름과 동일하게 구성 //getInfo
	 * 	 [2] 부모의 것과 매개변수도 동일하게 구성//()
	 * 	 [3] 반환타입도 동일해야함//String
	 *   [4] 접근 지정자는 부모와 동일하거나 더 넓은 범위의 접근지정자를 사용할 수 있음// public (public이 가장 넓은 접근 지정자여서 동일하게 구성) (부모가 public인데 private로 범위 줄일수없다)
	 *   [5] 예외는 부모가 선언한 예외와 동일하거나, 더 구체적인 예외를 발생시킬 수 있다.
	 */
	public String getInfo() {//메소드 헤더(머릿말)을 부모와 같게 하고 내용은 부모와 다르게 재정의
		//String info="이름: "+name+"\n키: "+height+"\n초능력: "+power; //이름 키는 부모와 중복되고 초능력만 더하면 된다
		String info=super.getInfo()+"\n초능력: "+power; /*super는 부모로부터 물려받은 변수나 메소드를 참조할 때 사용하는 키워드*/
				return info;
	}
	//오버라이딩한 메소드를 오버로딩해보자
	public String getInfo(String title) {//오버로드(클래스의 메소드를 다른 매개변수로 지정하는것)
		//제목, 이름, 키, 초능력을 문자열로 돌려주게 만들어보자
		String info=title+"\n"+super.getInfo()+"\n초능력: "+power;
		return info;
	}
	public void getInfo(String title, int up) {
		this.power+=up;//초능력을 충전하는 설정을 추가했다 
		// 제목, 이용, 키, 초능력을 출력하는 명령문 작성하세요
		String info=this.getInfo(title);
		System.out.println(info);
	}

}//
