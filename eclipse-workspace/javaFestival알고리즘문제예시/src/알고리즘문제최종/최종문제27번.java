package �˰���������;

import java.util.Scanner;

public class ��������27�� {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// 1���� �迭 ����
		int arr[] = new int[5];
		// ���° ī��Ʈ �ϴ� ���� �ʱ�ȭ
		int cnt = 1;
		// for���� ����Ͽ� 1~5��°���� �Է¹ޱ�
		for (int i = 0; i < 5; i++) {
			// ������ �Է¹޴� ��¹� �ۼ��� �Է�
			System.out.println(cnt + "��° �� �Է� : ");
			// �Է¹��� ������ �迭�� ����
			arr[i] = sc.nextInt();
			cnt++;// ���������ڸ� �̿��ؼ� ī��Ʈ�ϱ�
		}

		// �������� �����ϱ� ���� ���� �����ϱ�
		int temp = 0;
		int indexnum = 0;
		// for���� �̿��ؼ� �������� �����ϱ�
		for (int i = 0; i < arr.length; i++) {
			indexnum = i;
			for (int j = i + 1; j < arr.length; j++) {// ���� �ε������� ������ �ʰ� j=i+1�� �ʱ�ȭ
				if (arr[j] < arr[indexnum]) {// if���� ����Ͽ� ���� �ε����� �Ǵ�
					indexnum = j;// ���� �ε��� ���� indexnum�� ���� �ֱ�
				}
			}
			// ġȯ�ؼ� �������� �����ϱ�
			temp = arr[indexnum];
			arr[indexnum] = arr[i];
			arr[i] = temp;
		}
		System.out.println("���� ��");
		// for���� �̿��ؼ� �������� ����ϱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
