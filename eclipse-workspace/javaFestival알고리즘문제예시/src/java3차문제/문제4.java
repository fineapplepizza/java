package java3������;

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		// ��ĳ�� �����ϱ�
		Scanner sc = new Scanner(System.in);
		// ���� n�� �Է¹޴� ��¹� �ۼ� �� �Է¹ޱ�
		System.out.print("n �Է� : ");
		int n = sc.nextInt();

		// ������ ���� �ʱ�ȭ
		int sum = 1;
		// for���� �̿��Ͽ� ������ n��° �ױ��� ����ϱ�
		for (int i = 1; i <= n; i++) {
			System.out.print(sum + " ");
			sum += i;

		}

	}
}
