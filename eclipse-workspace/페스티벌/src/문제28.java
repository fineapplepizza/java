package ��������;

public class ����28 {

	public static void main(String[] args) {
		// ������ �迭 ����
		int arr[][] = new int[5][5];
		// ������ �迭 �� �ʱ�ȭ
		int k = 1;
		// for�� �������迭 �� ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				arr[j][i] = k;
				k++;
			}
		}
		// for�� �������迭 90��ȸ��
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
