

import java.util.Scanner;

public class ����7 {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �� ���� ��� �� �Է�
		System.out.print("�� ����: ");
		int num = sc.nextInt();
		// ����for��
		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
