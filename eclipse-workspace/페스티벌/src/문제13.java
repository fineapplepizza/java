
import java.util.Scanner;

public class ����13 {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner sc = new Scanner(System.in);
		// ���� �Է� �� ���
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		// �������迭 ����
		int arr[][] = new int[num][num];
		// �迭 �� ����
		int k = 1;
		// for�� ���� ����
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = arr.length - 1; j >= 0; j--) {// Ȧ����
					arr[j][i] = k;
					k++;
				}
			} else {
				for (int j = 0; j < arr.length; j++) {// ¦����
					arr[j][i] = k;
					k++;
				}
			}
		}

		// for�� ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
