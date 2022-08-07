package day07multicampus;


public class Teacher2 {
	
	private int no;
	private String name;
	private String subject;
	private String phone;
	
	//setter
	public void setNo(int no) {
		this.no=no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	//getter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public String getPhone() {
		return phone;
	}
	
	public void showInfo() {//컨트롤 알트 방향키아래 =그대로 복사
		System.out.println("------교사정보-------");
		System.out.println("교번: "+no);
		System.out.println("이름: "+name);
		System.out.println("과목: "+subject);
	} 


}
