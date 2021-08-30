package �ǽ�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {
	// Controller : �����͸� �������ִ� ��ɵ��� ���ִ� ��
	// select, insert, delete, update

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;

	// MemberVo�� ���� ��ü ����
	MemberVo vo = null;// ����� �����Ҷ����� �޶����� ������null��
	// 1.�����ε��� ���� ���� �޼ҵ�

	public void getConn() {
		// Class.forName()
		// DriverManaget.getConnection()

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. �����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			conn = DriverManager.getConnection(url, user_id, user_pw);
		} catch (Exception e) {// Exception���� �� ��ƿü� �ֱ⶧���� �ϳ��� �Ѵ�.

			System.out.println("getConn() ����");
			e.printStackTrace();
		}

	}// getConn() ����

	// ��ü�� ������ �����ϴ� �޼ҵ�
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
	}// close() ����

	// ȸ������ ���� �޼ҵ� - insert()
	public int insert(String id, String pw, String name, int age) {

		getConn();// �޼ҵ� ȣ�� �����ͺ��̽� ������ ���ؼ�

		// sql�� �ѱ��
		try {// ������ �� �������� try - catch�� ����ֱ�
			String sql = "insert into members values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			System.out.println("sql ����");

			// ?���ð� ����
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			// ���̺��� ��ȭ�� �������ִ� �޼ҵ� executeUpdate()
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		// ������ ����, ���� �ʵ� ������ �����ؼ� ��ü �ݾ��ֱ�
		finally {
			close();
		}

		return cnt;
	}// insert();

	// ȸ����ü��ȸ selectAll()
	public ArrayList<MemberVo> selectAll() {
		// ���̺�κ��� �� �� �� �о���� ������� �����ϱ� ���� ArrayList
		ArrayList<MemberVo> list = new ArrayList<>();
		// 1.�����ε�, �����ͺ��̽� ����
		getConn();// �޼ҵ� ȣ�� �����ͺ��̽� ������ ���ؼ�
		// 2.��ü��ȸ sql�� �ۼ�

		try {
			String sql = "select* from members ";
			// sql���� psmt�� ����ֱ�
			psmt = conn.prepareStatement(sql);
			// ���̺��� ��ȸ/�˻� ��������ֱ� ���� �޼ҵ� executeQuery()����ϱ�
			// �˻��� ������ console�� ����ϱ� ���� �޼ҵ� ResultSet ����ϱ�
			rs = psmt.executeQuery();
			// 3.rs��ü�� ���� �� �÷� �� �������� -> rs.get(index)
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				// 4.������ �޼ҵ忡 �ٽ� ����
				vo = new MemberVo(id, pw, name, age);
				// 5.ArrayList�� �������� �߰� -> add()
				list.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}// selectAll()����

	public int update(String id, String data) {

		// �����ε�
		getConn();
		// sql���ۼ�

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
