package �˰���������2��;

import java.util.Scanner;

public class ����3 {
	// ������ �Է¹޾� 1�� �ڸ����� �ݿø� �� ����� ����Ͻÿ�.
	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �����Է� ��¹� �ۼ� �� �Է¹ޱ�
		System.out.print("���� �Է�: ");
		int number = sc.nextInt();
		// if���� Ȱ���Ͽ� �ݿø� �Ǵ��ϱ�
		if (number % 10 >= 5) {
			number = (number / 10 * 10) + 10;
		} else {
			number = number / 10 * 10;
		}
		// �ݿø� �� ��¹� �ۼ�
		System.out.println("�ݿø� �� : " + number);

	}

}
