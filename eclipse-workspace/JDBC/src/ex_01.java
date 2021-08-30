import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex_01 {

	public static void main(String[] args) {
		
		// JDBC 연결순서(4단계)
		// 선행작업 : ojdbc.jar 프로젝트에 추가하기!
		// 1. JDBC 동적로딩 - 드라이버 설치!
		// 2. 데이터베이스 연결 - Connection객체 사용
		// 3. SQL문 전송 - PreParedStatment, ResultSet 객체
		// 4. 사용된 객체에 대하여 연결을 닫아주는 단계
		
		
		// 1. JDBC 동적 로딩! -> Class.forName()
		// 자바의 오류
		// - 컴파일 오류 : 문법적인 오류
		// - 런타임 오류 : 문법상으로는 문제가 없지만 실제 동작시 오류를 포함하는 것
		
		try { // 무조건 한번은 실행을 시키는 구문
			//OracleDriver클래스를 실행하겠습니다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결하기 -> Connection 객체를 통하여 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
		    String user_id ="hr";
		    String user_pw ="hr";
		    
		    // Connection import 작업 -> java.sql
            Connection conn = DriverManager.getConnection(url,user_id,user_pw);
			
            // getConnection()을 통하여 반환된 값으로 연결여부 확인하기
            if(conn != null) {
            	System.out.println("연결 성공!");
            }else {
            	System.out.println("연결 실패...");
            }
            //(데이터베이스 접근 url, 나의 user_id,나의 패스워드)
			
        	// 3. sql 작성 -> PreparedStatement()
    		String sql = "select * from employees where last_name = 'King'";
    		//수레
    	    PreparedStatement psmt = conn.prepareStatement(sql);            
            //실제 sql문을 실행할수 있는 명령 진행!
    	    //executeQuery(): 원본 테이블에 변동이 없는 경우 -> select
    	    //executeUpdate() : 원본 테이블에 수정이 일어나는 경우 -> insert, delete
    	    //Resultset이라는 타입으로 rs라는 이름을 붙여서 결과값을 저장 executeQuery실행문장
    	    //rs에는 우리가 반환하고자 하는 일부의 내용이 저장
    	    ResultSet rs = psmt.executeQuery();
    	    //rs로부터 내용이 있다면 계속해서 반복작업을 하겠습니다.
    	    //결과에 대한 내용을 변수에 저장하기 위한 작업-실제 콘솔에 띄어보기 위한 작업
    	    while(rs.next()) {
    	        String id = rs.getString(1);
    	        String first_name = rs.getString(2);
    	        String last_name = rs.getString(3);
    	        
    	        System.out.println("employee_id :"+id);
    	        System.out.println("first_name :"+first_name);
    	        System.out.println("last_name :"+last_name);
    	        System.out.println();

    	    }
    	    
    	    // 4. 연결종료
    	    //연결종료의 순서는 가장 마지막에 열린 객체부터 역순으로 닫아준다!
    	    // rs-psmt-conn
    	    if(rs != null) {
    	    	//rs가 null값이 아니라면 rs를닫아주세요
    	    	rs.close();
    	    }if(psmt != null) {
    	    	psmt.close();
    	    }if(conn != null) {
    	    	conn.close();
    	    }
		} catch (ClassNotFoundException e) {// try에서 오류나는 부분들을 예외처리 하는 영역
			// jdbc 동적로딩을 위한 경로가 맞지 않을 경우 발생하는 오류
			System.out.println("동적로딩 오류!");
			e.printStackTrace();//어떤 에러인지 에러의 상태를 출력하겠습니다.
		} catch (SQLException e) {
			//sql에 해당하는 영역에 대한 오류
		 System.out.println("데이터베이스 오류!");
			e.printStackTrace();
		}
		
	
		
		
		
		

	}

}
