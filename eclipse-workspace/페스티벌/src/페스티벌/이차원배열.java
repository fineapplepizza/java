package �佺Ƽ��;

import java.util.Scanner;

public class �������迭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		int arr[][] = new int[num][num];
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {

					arr[i][j] = k;
					k++;
				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[i][j] = k;
					k++;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
