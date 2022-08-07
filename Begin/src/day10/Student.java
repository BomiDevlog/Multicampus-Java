package day10;
//도메인 객체 : VO(Value Object), DTO(Data Transfer Object)
public class Student {
	
	private int id; //학번
	private String name; //이름
	
	//기본생성자에 매개변수 기본값넣어줌
		public Student() {
			this(0,"아무개");
		}
		//매개변수 받는 생성자
		public Student (int id, String name) {
			this.id=id;
			this.name=name;
		}
		
	//캡슐화 getter setter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//day11의 ObjectTest에서 오버라이딩
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Student) {
			Student user=(Student)obj;
			boolean bool=user.name.equals(this.name)&&user.id==this.id;//name은 String이니까 equals로 하고 id는 인트니까 ==
			return bool;
		}else {
			return false;
		}
	
	
	}
}
