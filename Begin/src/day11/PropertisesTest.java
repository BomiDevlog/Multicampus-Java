package day11;
import java.util.*;
import java.io.*; //properties를 읽을 파일리더를 쓰려고
/*Properties : Map 계열
 *  -- 시스템의 설정정보 등을 xxx.properties 파일에 저장한 뒤, / (=확장자명을 properties라고 붙이는 것)
 * 	   이 파일을 읽어서 해당 파일에 저장된 내용을 사용하고자 할 때 이용한다.
 *  (key값 value값 형태로 저장하는 파일 형태)
 *  (패키지에서 오른마우스- new-file에서 mysystemm.properties로 만들어주었다)
 *  (주석은 #, 한글쓰면 유니코드 되니까 영어로 써야함, # key=value)
 *  (DB유형에 따라 동적인 작업 할때 쓴다)
 */
public class PropertisesTest {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// FileNotFoundException은 파일을 찾을  수 없을때 생기는 컴파일타입의 예외를 throws로 처리해보겠다. try~catch해도됨
		//IOException가 부모이고 자식이 FileNotFoundException이라서 throws IOException만 해도 둘다 처리됨
		
		String loc="src/day11/mysystem.properties"; 
		//절대경로로 해도 되고 상대경로로 해도됨 
		//절대경로는 오른마우스 properties해서 주소를 읽는다
		//상대경로는 프로젝트를 기준으로 경로를 잡는다   상대경로로 풀이하겠다
		FileReader fr=new FileReader(loc); //노드연결-서로 파일을 읽으려고 데이터가 이동할 통로(접점) 연결
		
		//파일의 내용을 Properties객체로 옮겨보자
		Properties prop=new Properties();
		prop.load(fr);
		fr.close(); //노드를 닫아 스트링을 닫음 다른 데이터가 접근하지못하게
		//properties 파일 내용을 읽어서 Properties() 객체로 옮겨 저장해놓는다.
		
		//void setProperties(String key, String value): 저장 (setter역할)
		//String getProperties (String key) : 꺼내기 (getter역할)
		String os=prop.getProperty("Os");
		System.out.println("운영체제: "+os);//운영체제: Windows출력됨
		
		String dbms=prop.getProperty("DbType");
		System.out.println("DBMS: "+dbms);//DBMS: Oracle출력됨
		
		System.out.println("User: "+prop.getProperty("DbUser", "King"));// //mystem에서 가져올 값이 있으니 뒤의 메시지가 출력되지않음
		System.out.println("Password: "+prop.getProperty("DbPwd"));
		System.out.println("Msg: "+prop.getProperty("Msg","메시지는 없습니다"));//mystem에서 가져올 값이 없으면 뒤의 메시지가 출력
		
		//보통은 이런 식으로 시스템정보를 저장해서 쓴다
		
		prop.setProperty("Lang", "Java"); //추가적인 정보저장과 꺼내기도 가능
		System.out.println("Lang: "+prop.getProperty("Lang"));
		
		

	}

}
