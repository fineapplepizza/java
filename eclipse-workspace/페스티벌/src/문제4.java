

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 총금액 입력문 작성및 입력받기
		System.out.println("총금액 입력: ");
		int sum = sc.nextInt();
		// 잔돈 출력문 작성
		System.out.println("잔돈 : " + sum + "원");
		// 배열생성 및 초기화
		int arr[] = { 10000, 5000, 1000, 500, 100 };
		// for문
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "원 :" + (sum / arr[i]) + "개");
			sum %= arr[i];
		}

	}

}
