

import java.util.Scanner;

public class ����8 {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// ���� ����� ���� �ʱ�ȭ
		int result = 0;
		while (true) {
			// A�Է� ��� �� �Է�
			System.out.print("A �Է�>> ");
			int a = sc.nextInt();
			// B�Է� ��� �� �Է�
			System.out.print("B �Է�>> ");
			int b = sc.nextInt();
			// if�� ��� 0�̸� ���α׷� ����
			if (a == 0 && b == 0) {
				break;
			}
			// ����
			result = a - b;
			// ��� ���
			System.out.println("��� >> " + result);

		}
	}
}
