

import java.util.Scanner;

public class 문제16 {

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 정수입력 출력및 입력
		System.out.println("정수입력: ");
		int num = sc.nextInt();
		// 이차원배열생성
		int arr[][] = new int[num][num];
		// 이차원배열 값
		int k = 1;
		// for문
		for (int i = 0; i < arr.length; i++)
			// if문
			if (i % 2 == 0) {// 홀수행
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = k;
					k++;
				}
			} else {// 짝수행
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[i][j] = k;
					k++;
				}
			}
		// for문 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
