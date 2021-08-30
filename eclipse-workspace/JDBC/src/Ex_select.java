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

		try {// 1. ����̹� �����ε� //OracleŬ������ ������ ���ڴ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ����������� �����̱������ �ѹ��� �ٺ��� ��Ʊ� ������
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			// 2. Connection ��ü ���� -> �����ͺ��̽� ����
			// �����ͺ��̽��� �����ϱ� ���� 3���� ������ ����ش�.
			// ������ ���� ������ �����ϸ鼭 ������ �ֱ⶧���� try-catch��
			conn = DriverManager.getConnection(url, user_id, user_pw);

			// ��� ���������� �˱����ؼ� �ۼ�
			if (conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
			}
			// 3. ������� id,pw �Է¹ޱ� -> Scanner ���
			System.out.print("����� id: ");
			String id = sc.next();
			System.out.print("����� pw: ");
			String pw = sc.next();
			// 4. �Էµ� id, pw�� ���� ������� id, pw, name, age �˻�(Select)
//		    -sql�� �ۼ� �� ����/����
			String sql = "select * from members where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			// sql���� ��ȸ�˻��� �������ּ���
			psmt.executeQuery();// ��ȸ/�˻�(���� ���Ŀ� ���̺� ���� ��ȭ�� ���� ��)
			// executeQuery�� ���� �ڵ������� Resultset����.

			// 5. �˻��� ���� console ���->ResultSet-=>rs.next()
			rs = psmt.executeQuery();
			// ResultSet�� ������� ǥ�� ���� ���·� ������ּ���

			// select ����� ���� ����� ������ �𸣹Ƿ� �ݺ����� ����Ѵ�.
			while (rs.next()) {// �� �࿡ ������ ������ ���� �� ���Ŀ� ã�ƿ��� ���� ���������� �ݺ�
				String id2 = rs.getString(1);// 1���� �ִ�String���¸� ������ ���ڽ��ϴ�.
				String pw2 = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);

				// ����� ���� ����
				System.out.println(id2 + "\t" + pw2 + "\t" + name + "\t" + age);

			}

			// �����ϸ鼭 �߻��Ǵ� ������ catch���� ���� ��´�.
		} catch (ClassNotFoundException e) {
			System.out.println("�����ε�����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL����");
			e.printStackTrace();
		}
		// 6. ���� ��ü �ݾ��ֱ�->finally-������ �� ���� �������ּ���
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
