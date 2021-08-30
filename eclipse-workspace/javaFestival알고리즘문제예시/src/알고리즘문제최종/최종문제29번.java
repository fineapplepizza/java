package 알고리즘문제최종;

import java.util.ArrayList;
import java.util.Scanner;

public class 최종문제29번 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// N입력 출력문 작성 및 입력
		System.out.println("N 입력");
		int n = sc.nextInt();
		// X입력 출력문 작성 및 입력
		System.out.println("X 입력");
		int x = sc.nextInt();
		// 몇번째 정수 입력하는 지 카운트해줄 변수 초기화
		int cnt = 1;
		// 정수 입력받은 수를 저장할 배열 생성
		int arr[] = new int[n];
		// for문을 이용해서 N개의 정수 입력받기
		for (int i = 0; i < arr.length; i++) {
			// 정수입력 출력문 작성및 입력
			System.out.println(cnt + "번째 정수 입력>>");
			// 입력받은 정수를 배열에 저장
			arr[i] = sc.nextInt();
			cnt++;// 증감연산자를 사용해 몇번째 입력했는지 카운트
		}

		// 결과문 출력
		System.out.print("결과>>");
		// for문을 이용하여 결과 출력
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < x) {// if문을 이용하여 배열에 저장된 정수들이 x보다 작은지 판단
				// x보다 작은 정수들 출력
				System.out.print(arr[i] + " ");
			}
		}

	}

}
