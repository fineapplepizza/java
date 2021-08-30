import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_insert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 레퍼런스형의 기본 값은 null이다.
		PreparedStatement psmt = null;
		Connection conn = null;

		// *JDBC 연동 순서!
		// 1. 동적 로딩 (드라이버 로딩)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			// 2. Connection 연결 단계
			// 데이터베이스에 접근하기 위해서는 허가받기위해서 허가증이 DriverManager
			// 언제어디서 오류가 날지 모르니 그때마다 try -catch문으로 해줘야한다.
			// getConnection-연결하겠습니다.
			// 임폴트 작업 필수!
			conn = DriverManager.getConnection(url, user_id, user_pw);

			// 객체의 기본값은 null값이다.
			// 어디서 오류나는지 알기위해서 작성
			if (conn != null) {
				System.out.println("연결 성공!");
			} else {
				System.out.println("연결 실패!");
			}

			// 사용자에게 입력내용 전달받기
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();

			// 3. sql문 전송 단계
//			String sql = "insert into members values('test','1111','테스트',20)";
			// 사용자가 어떤걸 입력할 지 모르기때문에 문법을 만들어놓고 값입력 ?로 작성해야 값이 입력된다.
			String sql = "insert into members values(?,?,?,?)";

			// 수레

			psmt = conn.prepareStatement(sql);

			// sql문에 들어가는 ?값 셋팅하기
			// setString/setInt->(위치,실제 값)
			// 순서는 1부터 시작한다!
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			// PreparedStatement의 사용함수
			// 1. excuteUpdate() : 삽입,삭제,수정 (수행 이후 테이블의 값이 바뀌는 것)
			// 2. executeQuery() : 조회/검색(수행 전후에 테이블 값의 변화가 없는 것)

			int cnt = psmt.executeUpdate();// 완벽하게 실행된 결과값을 int형으로 반환해준다.

			if (cnt > 0) {
				System.out.println("정보추가 성공!");
			} else {
				System.out.println("정보추가 실패!");
			}

		} catch (ClassNotFoundException e) {// 클래스를 찾을 수 없습니다 오류
			System.out.println("동적 로딩 오류!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql 오류!");
			e.printStackTrace();
		}

		// 4.catch문이 끝난 이후 연결종료 진행
		// 에러가 나던 나지 않던 무조건 실행하기 위해 finally 사용
		finally {
			// psmt, conn

			try {
				if (psmt != null) { // 객체가 사용되지 않았는데 닫으라고 할 수 있으므로 조건문 사용
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
