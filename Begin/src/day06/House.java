package day06;

public class House {
	
	//속성을 멤버변수로. has a 관계가 성립하는지 확인->성립한다면 속성o
	int room;//방의 개수
	String addr;//주소
	String owner;//소유주
	
	public void showInfo() {
		System.out.println("---House정보---");
		System.out.println("소유주: "+owner);
		System.out.println("방 수: "+room);
		System.out.println("주소: "+addr);
	}
	
	public String existAt(int bungi) { //스트링타입이니 맨 마지막에 스트링으로 리턴해야함 
		String str=owner+"의 집은 "+addr+" "+bungi+"번지에 위치합니다";
		return str;
		
	}
	
	// 이 집은 어떤 유형(전세, 월세, 매매)으로 얼마에 (세를 놓아요./매매해요)
	public void rent(String type, int money) {
		
		switch(type) {
		case "매매":
			System.out.println("매매가: "+money+"만원에 매매합니다.");
			break;
		default:
			System.out.println("임대가: "+money+"만원에 세를 놓아요.");
		}
		
		
		
	/*	내가 풀다가 만거
	 * System.out.println("이 집은 "+type+"으로 판매중이에요.");
		if (type="매매") {
		System.out.println("이 집은 매매로 "+price+"원에 매매합니다.");
		}else if (type="전세") {
			System.out.println("이 집은 전세로 "+price+"원에 세를 놓아요.");
		}else  {
			System.out.println("이 집은 월세로 "+price+"원에 세를 놓아요.");
				
			*/
			
	}

}


