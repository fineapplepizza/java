

import java.util.Scanner;

public class ����20 {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner sc = new Scanner(System.in);
		// �迭 ����
		int arr[] = new int[10];
		// ī��Ʈ
		int cnt = 1;
		// for��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(cnt + "�� ° ���� �Է�>> ");
			arr[i] = sc.nextInt();
			cnt++;
		}
		// 3�� ��� ���
		System.out.print("3�� ���: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
