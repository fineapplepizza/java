

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �ѱݾ� �Է¹� �ۼ��� �Է¹ޱ�
		System.out.println("�ѱݾ� �Է�: ");
		int sum = sc.nextInt();
		// �ܵ� ��¹� �ۼ�
		System.out.println("�ܵ� : " + sum + "��");
		// �迭���� �� �ʱ�ȭ
		int arr[] = { 10000, 5000, 1000, 500, 100 };
		// for��
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "�� :" + (sum / arr[i]) + "��");
			sum %= arr[i];
		}

	}

}
