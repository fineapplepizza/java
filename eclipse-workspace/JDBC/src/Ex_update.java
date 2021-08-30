import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_update {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs =null;

		Scanner sc = new Scanner(System.in);

		// 사용자에게 수정하고 싶은 내용 확인하기!
		System.out.println("=====회원 정보 수정=====");
		System.out.println("아이디 입력: ");
		String id = sc.next();
		System.out.print(" [1] pw [2] name [3]age >> ");
		int choice = sc.nextInt();

		int data = 0;
		String data2 = "";
		System.out.print("수정할 데이터 입력: ");
		if (choice == 3) {
			data = sc.nextInt();
		} else {
			data2 = sc.next();
		}

		// 선택 메뉴에 따른 sql문 작성
		String sql = "";
		if (choice == 1) {
			sql = "update members set pw = ? where id =?";
		} else if (choice == 2) {
			sql = "update members set name = ? where id =?";
		} else if (choice == 3) {
			sql = "update members set age = ? where id =?";
		}

		// 1. 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			conn = DriverManager.getConnection(url, user_id, user_pw);
			if(conn != null) {
				System.out.println("연결성공");
			}else {
				System.out.println("연결실패");
			}
			// 3. sql문 작성
//		    -비밀번호를 수정할 수 있는 sql문작성
//			String sql = "update members set pw ='1225' where id='csm' ";

			psmt = conn.prepareStatement(sql);

			// ?에 대한 setting 진행하기
			if (choice == 3) {
				psmt.setInt(1, data);// 첫번째 물음표에는 data값을 지정하겠습니다.
				psmt.setString(2, id);
			} else {
				psmt.setString(1, data2);
				psmt.setString(2, id);
			}
			int cnt = psmt.executeUpdate();// 테이블에 변화가 있기 때문에 ?줄 실행되었습니다로 int형으로 반환

			if (cnt > 0) {
				System.out.println("수정 완료!");
			} else {
				System.out.println("수정 실패..");
			}

			// 해당 id의 수정된 내용을 보여주는 sql로 작성
			sql = "select * from members where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id2 = rs.getString(1);
				String pw2 = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.println(id2+" "+pw2+" "+name+" "+age);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql오류");
			e.printStackTrace();
		}

		
		// 4. 연결 종료
		// - try-catch 구문 벗어나서 작성
		finally {

			try {
				if(rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
