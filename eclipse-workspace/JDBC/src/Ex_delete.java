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
		// ���̵�� ��й�ȣ�� �Է��ϸ� �ش� ���� ���̺�� ���� �����ϱ�

		// 1.�����ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// ��θ����
			// 2.�����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);
			// 3.����ڷ� ���� ���̵�, ��й�ȣ �Է¹ޱ�
			System.out.print("���̵� : ");
			String id = sc.next();
			System.out.print("��й�ȣ : ");
			String pw = sc.next();
			// 4.sql�� �ۼ�(3���� Ȱ��)
			String sql = "delete from members where id =? and pw =?";
			// String sql="delete from ���̺�� where id = ? and pw = ?";
			// sql���� �Ѱ��ֱ����ؼ��� conn��ü�� ���������� sql���� ��� pmt�� �Ѱ�����Ѵ�.
			psmt = conn.prepareStatement(sql);
			// sql�� ?�� �� ����
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// ���̺� ������ �����ϱ� ������ executeUpdate();
			// cnt�������ٰ� ������� ��ȯ�ؼ� ������ �����ߴ��� ���ߴ��� Ȯ��
			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("���� ����!");
			} else {
				System.out.println("���� ����");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("�����ε�����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql�� ����");
			e.printStackTrace();
		}
		// 5.��ü ��������
		finally {//������ �߻��ϴ��� ����̵Ǹ� ������ �ݾ��ּ���.

			try {
				if (psmt != null) {// ���࿡ psmt�� �ѹ��̶� ����ߴ����
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
