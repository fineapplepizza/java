

import java.util.Scanner;

public class ����9 {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner sc = new Scanner(System.in);
		// ���� �Է� ��� �� �Է�
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		// �ݿø� �� ���� �ʱ�ȭ
		int result = 0;
		// if��
		if (num % 10 >= 5) {
			result = num / 10 * 10 + 10;
		} else {
			result = num / 10 * 10;
		}
		// ��� ���
		System.out.println("�ݿø� ��: " + result);

	}

}
