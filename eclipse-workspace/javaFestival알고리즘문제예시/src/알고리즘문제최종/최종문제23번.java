package �˰���������;

import java.util.Scanner;

public class ��������23�� {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �ܼ��Է� ��¹��ۼ��� �Է¹ޱ�
		System.out.println("�ܼ��Է�: ");
		int dan = sc.nextInt();
		// ��� ������ ��¹� �ۼ��� �Է� �ޱ�
		System.out.println("��� ������ ���: ");
		int num = sc.nextInt();
		// ��� ��¹��ۼ�
		System.out.println(dan);
		// for���� ����ؼ� ������ ���
		for (int i = 1; i <= num; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}

	}

}
