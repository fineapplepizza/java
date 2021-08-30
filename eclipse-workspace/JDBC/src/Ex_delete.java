import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn = null;
		// 아이디와 비밀번호를 입력하면 해당 내용 테이블로 부터 삭제하기

		// 1.동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 통로만들기
			// 2.데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);
			// 3.사용자로 부터 아이디, 비밀번호 입력받기
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			// 4.sql문 작성(3번을 활용)
			String sql = "delete from members where id =? and pw =?";
			// String sql="delete from 테이블명 where id = ? and pw = ?";
			// sql문을 넘겨주기위해서는 conn객체가 수레를끌고 sql문을 담아 pmt에 넘겨줘야한다.
			psmt = conn.prepareStatement(sql);
			// sql문 ?에 값 셋팅
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 테이블 원본에 삭제하기 때문에 executeUpdate();
			// cnt변수에다가 결과값을 반환해서 실행이 성공했는지 안했는지 확인
			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("삭제 성공!");
			} else {
				System.out.println("삭제 실패");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql문 오류");
			e.printStackTrace();
		}
		// 5.객체 연결종료
		finally {//오류가 발생하더라도 사용이되면 무조건 닫아주세요.

			try {
				if (psmt != null) {// 만약에 psmt가 한번이라도 사용했더라면
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
