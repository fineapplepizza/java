
import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// ��������� ��¹� ���� �� �Է�
		System.out.println("���������: ");
		int now = sc.nextInt();
		// ��ǥ������ ��¹� ���� �� �Է�
		System.out.println("��ǥ������: ");
		int goal = sc.nextInt();
		// ����ī��Ʈ ���� ���� �ʱ�ȭ
		int cnt = 1;
		while (now > goal) {
			// ������ ���� ������ ��¹� ���� �� �Է�
			System.out.print(cnt + "���� ���� ������: ");
			int num = sc.nextInt();
			now -= num;
			cnt++;
		}
		// ��� ��¹� ���� �� �Է�
		System.out.println(now + "kg �޼�!! �����մϴ�!");

	}

}
