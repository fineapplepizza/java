package ��������;

import java.util.Scanner;

public class ����29 {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner sc = new Scanner(System.in);

		// n �Է�
		System.out.println("N �Է�>>");
		int n = sc.nextInt();
		// x �Է�
		System.out.println("X �Է�>>");
		int x = sc.nextInt();
		// �迭����
		int arr[] = new int[n];
		// ī��Ʈ����
		int cnt = 1;
		// for��
		for (int i = 0; i < n; i++) {
			// ���° �����Է�
			System.out.print(cnt + "��° ���� �Է� >> ");
			arr[i] = sc.nextInt(); // ������ �迭�� ����
			cnt++;
		}
		System.out.print("���>>");
		// for�����
		for (int i = 0; i < arr.length; i++) {
			// if��
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
