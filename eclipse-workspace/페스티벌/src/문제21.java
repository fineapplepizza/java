

import java.util.Random;

public class ����21 {

	public static void main(String[] args) {
		// ���� ����
		Random rd = new Random();
		// �迭 ����
		int arr[] = new int[6];
		// for�� �迭�� ��������
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(46) + 1;
			// �ߺ�����
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println("����Ǽ��� : " + arr[i]);
		}

	}

}
