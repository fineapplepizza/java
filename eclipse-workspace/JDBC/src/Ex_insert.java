import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_insert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ���۷������� �⺻ ���� null�̴�.
		PreparedStatement psmt = null;
		Connection conn = null;

		// *JDBC ���� ����!
		// 1. ���� �ε� (����̹� �ε�)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			// 2. Connection ���� �ܰ�
			// �����ͺ��̽��� �����ϱ� ���ؼ��� �㰡�ޱ����ؼ� �㰡���� DriverManager
			// ������� ������ ���� �𸣴� �׶����� try -catch������ ������Ѵ�.
			// getConnection-�����ϰڽ��ϴ�.
			// ����Ʈ �۾� �ʼ�!
			conn = DriverManager.getConnection(url, user_id, user_pw);

			// ��ü�� �⺻���� null���̴�.
			// ��� ���������� �˱����ؼ� �ۼ�
			if (conn != null) {
				System.out.println("���� ����!");
			} else {
				System.out.println("���� ����!");
			}

			// ����ڿ��� �Է³��� ���޹ޱ�
			System.out.print("���̵� : ");
			String id = sc.next();
			System.out.print("��й�ȣ : ");
			String pw = sc.next();
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int age = sc.nextInt();

			// 3. sql�� ���� �ܰ�
//			String sql = "insert into members values('test','1111','�׽�Ʈ',20)";
			// ����ڰ� ��� �Է��� �� �𸣱⶧���� ������ �������� ���Է� ?�� �ۼ��ؾ� ���� �Էµȴ�.
			String sql = "insert into members values(?,?,?,?)";

			// ����

			psmt = conn.prepareStatement(sql);

			// sql���� ���� ?�� �����ϱ�
			// setString/setInt->(��ġ,���� ��)
			// ������ 1���� �����Ѵ�!
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			// PreparedStatement�� ����Լ�
			// 1. excuteUpdate() : ����,����,���� (���� ���� ���̺��� ���� �ٲ�� ��)
			// 2. executeQuery() : ��ȸ/�˻�(���� ���Ŀ� ���̺� ���� ��ȭ�� ���� ��)

			int cnt = psmt.executeUpdate();// �Ϻ��ϰ� ����� ������� int������ ��ȯ���ش�.

			if (cnt > 0) {
				System.out.println("�����߰� ����!");
			} else {
				System.out.println("�����߰� ����!");
			}

		} catch (ClassNotFoundException e) {// Ŭ������ ã�� �� �����ϴ� ����
			System.out.println("���� �ε� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql ����!");
			e.printStackTrace();
		}

		// 4.catch���� ���� ���� �������� ����
		// ������ ���� ���� �ʴ� ������ �����ϱ� ���� finally ���
		finally {
			// psmt, conn

			try {
				if (psmt != null) { // ��ü�� ������ �ʾҴµ� ������� �� �� �����Ƿ� ���ǹ� ���
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
