package 실습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {
	// Controller : 데이터를 제어해주는 기능들이 모여있는 곳
	// select, insert, delete, update

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;

	// MemberVo에 대한 객체 생성
	MemberVo vo = null;// 기능을 선택할때마다 달라지기 때문에null값
	// 1.동적로딩을 위한 연결 메소드

	public void getConn() {
		// Class.forName()
		// DriverManaget.getConnection()

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			conn = DriverManager.getConnection(url, user_id, user_pw);
		} catch (Exception e) {// Exception으로 다 잡아올수 있기때문에 하나로 한다.

			System.out.println("getConn() 오류");
			e.printStackTrace();
		}

	}// getConn() 종료

	// 객체의 연결을 종료하는 메소드
	public void close() {

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// close() 종료

	// 회원가입 위한 메소드 - insert()
	public int insert(String id, String pw, String name, int age) {

		getConn();// 메소드 호출 데이터베이스 연결을 위해서

		// sql문 넘기기
		try {// 오류가 날 수있으니 try - catch문 잡아주기
			String sql = "insert into members values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			System.out.println("sql 전송");

			// ?셋팅값 설정
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			// 테이블의 변화를 실행해주는 메소드 executeUpdate()
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 에러가 나든, 나지 않든 무조건 실행해서 객체 닫아주기
		finally {
			close();
		}

		return cnt;
	}// insert();

	// 회원전체조회 selectAll()
	public ArrayList<MemberVo> selectAll() {
		// 테이블로부터 한 줄 씩 읽어오는 내용들을 저장하기 위해 ArrayList
		ArrayList<MemberVo> list = new ArrayList<>();
		// 1.동적로딩, 데이터베이스 연결
		getConn();// 메소드 호출 데이터베이스 연결을 위해서
		// 2.전체조회 sql문 작성

		try {
			String sql = "select* from members ";
			// sql문을 psmt에 담아주기
			psmt = conn.prepareStatement(sql);
			// 테이블을 조회/검색 실행시켜주기 위한 메소드 executeQuery()사용하기
			// 검색된 내용을 console에 출력하기 위한 메소드 ResultSet 사용하기
			rs = psmt.executeQuery();
			// 3.rs객체를 통해 각 컬럼 값 가져오기 -> rs.get(index)
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				// 4.생성자 메소드에 다시 전달
				vo = new MemberVo(id, pw, name, age);
				// 5.ArrayList에 생성내용 추가 -> add()
				list.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}// selectAll()종료

	public int update(String id, String data) {

		// 동적로딩
		getConn();
		// sql문작성

		try {
			String sql = "update members set pw=? where id=? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, data);
			psmt.setString(2, id);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}// update

	

}// class
