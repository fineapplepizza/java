

import java.util.Scanner;

public class ����23 {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner sc = new Scanner(System.in);
		// �ܼ� ��� �� �Է�
		System.out.println("�ܼ��Է�: ");
		int dan = sc.nextInt();
		// ����� ��� �� �Է�
		System.out.println("��� ������ ���:");
		int num = sc.nextInt();
		// �ܼ����
		System.out.println(dan + "��");
		// for�� ���
		for (int i = 1; i <= num; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}

	}

}
