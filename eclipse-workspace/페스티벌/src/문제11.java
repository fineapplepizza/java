
import java.util.Random;

public class ����11 {

	public static void main(String[] args) {
		// 8ĭ ũ���� �迭 ����
		int arr[] = new int[8];
		// ���� ����
		Random rd = new Random();
		// for��
		System.out.print("�迭�� �ִ� ��� ��: ");
		for (int i = 0; i < arr.length; i++) {
			// �迭�� �������� �ʱ�ȭ
			arr[i] = rd.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// ���� ū ��
		int max = arr[0];
		// for��
		for (int i = 0; i < arr.length; i++) {
			if (max > i) {
				max = arr[i];
			}
		}
		System.out.println("���� ū ��: " + max);
		// ���� ���� ��
		int min = arr[0];
		// for��
		for (int i = 0; i < arr.length; i++) {
			if (max < i) {
				min = arr[i];
			}
		}
		System.out.println("���� ���� ��: " + min);
	}

}
