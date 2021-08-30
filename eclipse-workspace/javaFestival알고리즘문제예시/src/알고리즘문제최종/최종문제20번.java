package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제20번 {

	public static void main(String[] args) {
		// 스캐너 생성하기
		Scanner sc = new Scanner(System.in);
		// 배열 생성
		int arr[] = new int[10];
		// 1~10까지 몇번째 정수 입력하는지 지정하는 변수 생성
		int cnt = 1;
		// for문을 이용하여 1~10번째까지 정수 입력하기
		for (int i = 0; i < arr.length; i++) {
			// 정수 입력 출력문 작성및 입력받기
			System.out.print(cnt + "번 째 정수 입력>>");
			arr[i] = sc.nextInt(); // arr[i]에 정수값을 저장하기
			cnt++; // 1씩증가하기

		}

		// 3의 배수 결과값 출력하기
		System.out.print("3의 배수 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {// arr[i]이 3의 배수인지 판단하기
				System.out.print(arr[i] + " ");
			}
		}

	}

}
