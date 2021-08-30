import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_select {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {// 1. 드라이버 동적로딩 //Oracle클래스를 가지고 오겠다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 변수사용이유 내용이길어지고 한번에 다보기 어렵기 때문에
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			// 2. Connection 객체 생성 -> 데이터베이스 연결
			// 데이터베이스에 접근하기 위한 3가지 정보를 담아준다.
			// 문법상에 문제 없지만 연결하면서 오류가 있기때문에 try-catch문
			conn = DriverManager.getConnection(url, user_id, user_pw);

			// 어디서 오류나는지 알기위해서 작성
			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			// 3. 사용자의 id,pw 입력받기 -> Scanner 사용
			System.out.print("사용자 id: ");
			String id = sc.next();
			System.out.print("사용자 pw: ");
			String pw = sc.next();
			// 4. 입력된 id, pw와 같은 사용자의 id, pw, name, age 검색(Select)
//		    -sql문 작성 후 전송/실행
			String sql = "select * from members where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			// sql문의 조회검색을 실행해주세요
			psmt.executeQuery();// 조회/검색(수행 전후에 테이블 값의 변화가 없는 것)
			// executeQuery를 쓰면 자동적으로 Resultset쓴다.

			// 5. 검색된 내용 console 출력->ResultSet-=>rs.next()
			rs = psmt.executeQuery();
			// ResultSet은 결과값이 표와 같은 형태로 출력해주세요

			// select 결과의 행이 몇가지가 나올지 모르므로 반복문을 사용한다.
			while (rs.next()) {// 한 행에 내용을 가지고 오고 그 이후에 찾아오는 값이 없을때까지 반복
				String id2 = rs.getString(1);// 1번에 있는String형태를 가지고 오겠습니다.
				String pw2 = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);

				// 출력을 위한 문장
				System.out.println(id2 + "\t" + pw2 + "\t" + name + "\t" + age);

			}

			// 실행하면서 발생되는 오류는 catch문을 통해 잡는다.
		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL오류");
			e.printStackTrace();
		}
		// 6. 사용된 객체 닫아주기->finally-무조건 한 번은 실행해주세요
		finally {

			try {
				if (rs != null) {
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

	}// main

}// class
