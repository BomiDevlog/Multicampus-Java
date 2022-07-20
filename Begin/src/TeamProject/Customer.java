package TeamProject;
import java.util.*;
import java.io.*;
public class Customer {
	
HashMap<String, String> map=new HashMap<>();
	
	public void join(){ //회원가입 메소드
		map.put("hello123", "world123");
		System.out.println(" 회원 가입 완료! 환영합니다! ");
	}
	
	public void loginCheck() {//로그인 메소드
		Console console=System.console(); 
		while(true) {
			System.out.print("아이디: ");
			String userid=console.readLine();
			System.out.print("비밀번호: ");
			char[] pwd=console.readPassword(); 
			if (!map.containsKey(userid)) {
				System.out.println("아이디가 잘못되었습니다.");
			} else {
				String realPwd=map.get(userid);
				if (realPwd.equals(new String(pwd))) {
					System.out.println(userid + "님 환영합니다.");
					break;// 
				} else {
					System.out.println("비밀번호가 잘못되었습니다.");
					continue;
				}
			}
			}
	}
	
	public static void main(String[] args) {
		Customer c=new Customer();
		c.join();
		c.loginCheck(); 

	}

}
