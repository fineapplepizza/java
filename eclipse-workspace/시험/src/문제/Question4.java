package ����;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		// while�� �ۼ��ϱ�
		while (true) {
			// id��¹� �ۼ��ϱ�
			System.out.print("id : ");
			// id �Է��ϱ�
			String id = sc.next();
			// pw��¹� �ۼ��ϱ�
			System.out.print("pw : ");
			// pw �Է��ϱ�
			String pw = sc.next();

			// if���� Ȱ���Ͽ� �α��� ��ġ �Ǵ��ϱ�
			// �α��� ������
			if (id.equals("dldmsql") && pw.equals("1214")) {
				System.out.println(id + "�� ȯ���մϴ�!");
				break;
			}
			// �α��� ���н�
			else {
				System.out.println("�ٽ� Ȯ���ϼ���!");

			}
		}

	}

}
