package �˰���������;

import java.util.ArrayList;
import java.util.Scanner;

public class ��������29�� {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// N�Է� ��¹� �ۼ� �� �Է�
		System.out.println("N �Է�");
		int n = sc.nextInt();
		// X�Է� ��¹� �ۼ� �� �Է�
		System.out.println("X �Է�");
		int x = sc.nextInt();
		// ���° ���� �Է��ϴ� �� ī��Ʈ���� ���� �ʱ�ȭ
		int cnt = 1;
		// ���� �Է¹��� ���� ������ �迭 ����
		int arr[] = new int[n];
		// for���� �̿��ؼ� N���� ���� �Է¹ޱ�
		for (int i = 0; i < arr.length; i++) {
			// �����Է� ��¹� �ۼ��� �Է�
			System.out.println(cnt + "��° ���� �Է�>>");
			// �Է¹��� ������ �迭�� ����
			arr[i] = sc.nextInt();
			cnt++;// ���������ڸ� ����� ���° �Է��ߴ��� ī��Ʈ
		}

		// ����� ���
		System.out.print("���>>");
		// for���� �̿��Ͽ� ��� ���
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < x) {// if���� �̿��Ͽ� �迭�� ����� �������� x���� ������ �Ǵ�
				// x���� ���� ������ ���
				System.out.print(arr[i] + " ");
			}
		}

	}

}
