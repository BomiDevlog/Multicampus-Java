package day07;

import java.util.*;

public class JobHunter {//구직자
	
	private String name; //이름
	private int age;//나이
	private String desiredJob;//희망 직무
	private int desiredSalary;//희망 연봉
	
	//setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDesiredJob() {
		return desiredJob;
	}
	public int getDesiredSalary() {
		return desiredSalary;
	}
	//getter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDesiredJob(String desiredJob) {
		this.desiredJob = desiredJob;
	}
	public void setSalaryDesired(int desiredSalary) {
		this.desiredSalary = desiredSalary;
	}
	
	//생성자
	public JobHunter() {
		this("홍길동",28,"빅데이터", 3500);
	}
	
	public JobHunter(String name, int age, String desiredJob, int desiredSalary) {
		this.name=name;
		this.age=age;
		this.desiredJob=desiredJob;
		this.desiredSalary=desiredSalary;
	}
	
	//메소드
	public void showInfo() {
		System.out.println("------*구직자 정보*------");
		System.out.println("성    함: "+name);
		System.out.println("나    이: "+age);
		System.out.println("희망 직무: "+desiredJob);
		System.out.println("희망 연봉: "+desiredSalary);
	}
	
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("성함을 입력하십시오.=>");
		name=sc.next();
		
		System.out.println("나이을 입력하십시오.=>");
		age=sc.nextInt();
		
		System.out.println("희망직무를 입력하십시오.=>");
		desiredJob=sc.next();
		
		System.out.println("희망연봉을 입력하십시오.=>");
		desiredSalary=sc.nextInt();
	}
	
}//
