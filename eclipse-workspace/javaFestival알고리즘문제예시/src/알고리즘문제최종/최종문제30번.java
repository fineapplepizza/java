package �˰���������;

import java.util.Scanner;

public class ��������30�� {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >>");
		int num = sc.nextInt();
		System.out.println("���('-')�� �� ��>>"+toNum(num));

	}

	// ��ù��ڸ� ���ϴ� �Լ� toNum�޼ҵ� �����
	public static int toNum(int num) {
		int result = 0;
		// ���ں� - ����
		int[] nums = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		while (num > 0) {
			int num2 = num % 10; // 10�� �ڸ����� �������� ���ϱ�
			num /= 10; // �� ���ڸ����� 10�� ������ ���� �����ϱ�
			result += nums[num2]; // �迭�� 10�� �ڸ� ���� ���ؼ� '-'���ؼ� ���ϱ�
		}
		return result;
	}

}
