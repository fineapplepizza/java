package ��������;

public class ����3 {

	public static void main(String[] args) {
		// Ȧ�� ��� �� ����
		int num1 = 0;
		// ���� ��� �� ����
		int num2 = 0;
		// for��
		for (int i = 1; i <= 100; i++) {
			// if��
			if (i % 2 == 1) {// Ȧ���� ���
				System.out.print(i + " ");
				num1 += i;
			} else {// ¦���� ����
				System.out.print(-i + " ");
				num2 += -i;
			}
		}
		System.out.println();
		// ������
		System.out.println("���: " + (num1 + num2));

	}

}
