package �˰���������;

import java.util.Scanner;

public class ��������20�� {

	public static void main(String[] args) {
		// ��ĳ�� �����ϱ�
		Scanner sc = new Scanner(System.in);
		// �迭 ����
		int arr[] = new int[10];
		// 1~10���� ���° ���� �Է��ϴ��� �����ϴ� ���� ����
		int cnt = 1;
		// for���� �̿��Ͽ� 1~10��°���� ���� �Է��ϱ�
		for (int i = 0; i < arr.length; i++) {
			// ���� �Է� ��¹� �ۼ��� �Է¹ޱ�
			System.out.print(cnt + "�� ° ���� �Է�>>");
			arr[i] = sc.nextInt(); // arr[i]�� �������� �����ϱ�
			cnt++; // 1�������ϱ�

		}

		// 3�� ��� ����� ����ϱ�
		System.out.print("3�� ��� : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {// arr[i]�� 3�� ������� �Ǵ��ϱ�
				System.out.print(arr[i] + " ");
			}
		}

	}

}
