package �˰���������;

import java.util.Random;
import java.util.Scanner;

public class ��������35�� {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// ���� ����
		Random rd = new Random();

		int result = 0;// ���� ����� ���� �ʱ�ȭ
		int f = 0; // Ʋ������ ���� ���� �ʱ�ȭ
		while (f != 5) {
			// ���� ��¹� �ۼ� �� �Է¹ޱ�
			int num1 = rd.nextInt(10) + 1;//�������� num1�� �� �ֱ�
			int num2 = rd.nextInt(10) + 1;//�������� num2�� �� �ֱ�
			System.out.println(num1 + "+" + num2 + "=");
			result = sc.nextInt();
			// if���� ����Ͽ� ������ ���߾����� Ȯ���ϱ�
			if (result == num1 + num2) {// ������ ��������
				System.out.println("SUCCESS!");
			} else if (result != num1 + num2) {// ������ ������ �� �Ҷ�
				System.out.println("Fail...");
				f++;
			}
		}
		// �ټ��� Ʋ���� ���ӿ���
		System.out.println("GAME OVER!");
	}

}
