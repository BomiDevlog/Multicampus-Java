package day07;

import java.util.*;

public class JobOpening {//채용공고
	
	private String company; //회사 이름
	private String industry;//산업 업종
	private String business;//업무 내용
	private String address;//지역
	
	//setter
	public String getCompany() {
		return company;
	}
	public String getIndustry() {
		return industry;
	}
	public String getbusiness() {
		return business;
	}
	public String getAddress() {
		return address;
	}
	//getter
	public void setCompany(String company) {
		this.company = company;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//생성자
	public JobOpening() {
		this("Momentum","금융","소프트웨어 개발","부산광역시 해운대구");
	}
	
	public JobOpening(String company, String industry, String business, String address) {
		this.company=company;
		this.industry=industry;
		this.business=business;
		this.address=address;
	}
	//메소드
	public void showInfo() {
		System.out.println("------*채용 공고*------");
		System.out.println("사    명: "+company);
		System.out.println("업    종: "+industry);
		System.out.println("업    무: "+business);
		System.out.println("지    역: "+address);
	}
	
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("사명을 입력하십시오.=>");
		company=sc.next();
		
		System.out.println("업종을 입력하십시오.=>");
		industry=sc.next();
		
		System.out.println("업무를 입력하십시오.=>");
		business=sc.next();
		
		System.out.println("지역을 입력하십시오.=>");
		address=sc.next();
	}

}//
