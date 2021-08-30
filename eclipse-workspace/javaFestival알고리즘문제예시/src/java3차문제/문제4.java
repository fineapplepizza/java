package java3차문제;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// 스캐너 생성하기
		Scanner sc = new Scanner(System.in);
		// 정수 n을 입력받는 출력문 작성 및 입력받기
		System.out.print("n 입력 : ");
		int n = sc.nextInt();

		// 수열의 변수 초기화
		int sum = 1;
		// for문을 이용하여 수열의 n번째 항까지 출력하기
		for (int i = 1; i <= n; i++) {
			System.out.print(sum + " ");
			sum += i;

		}

	}
}
