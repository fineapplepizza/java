

import java.util.Scanner;

public class 문제20 {

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 배열 생성
		int arr[] = new int[10];
		// 카운트
		int cnt = 1;
		// for문
		for (int i = 0; i < arr.length; i++) {
			System.out.print(cnt + "번 째 정수 입력>> ");
			arr[i] = sc.nextInt();
			cnt++;
		}
		// 3의 배수 출력
		System.out.print("3의 배수: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
