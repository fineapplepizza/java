package 최종문제;

import java.util.Scanner;

public class 문제29 {

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);

		// n 입력
		System.out.println("N 입력>>");
		int n = sc.nextInt();
		// x 입력
		System.out.println("X 입력>>");
		int x = sc.nextInt();
		// 배열생성
		int arr[] = new int[n];
		// 카운트변수
		int cnt = 1;
		// for문
		for (int i = 0; i < n; i++) {
			// 몇번째 정수입력
			System.out.print(cnt + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt(); // 정수를 배열에 저장
			cnt++;
		}
		System.out.print("결과>>");
		// for문결과
		for (int i = 0; i < arr.length; i++) {
			// if문
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
