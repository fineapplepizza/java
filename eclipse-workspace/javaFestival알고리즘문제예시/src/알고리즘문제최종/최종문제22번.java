package �˰���������;

import java.util.Scanner;

public class ��������22�� {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �迭����
		int arr[] = new int[5];
		// for���� ����Ͽ� ���� �� �Է¹ޱ�
		for (int i = 0; i < arr.length; i++) {
			// ���° ���� �� ��¹� �ۼ� �� �Է¹ޱ�
			System.out.print(i + "��° ���� �� : ");
			arr[i] = sc.nextInt();// �Է��� ���� �� �迭�� �����ϱ�
		}
		// for������Ͽ� *����ϱ�
		for (int i = 0; i < arr.length; i++) {
			// ���� ���� ����ϱ�
			System.out.print(arr[i] + ":");
			// �ε����� ����ŭ ���� ����ϱ�
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
