package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제22번 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 배열생성
		int arr[] = new int[5];
		// for문을 사용하여 별의 수 입력받기
		for (int i = 0; i < arr.length; i++) {
			// 몇번째 별의 수 출력문 작성 및 입력받기
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();// 입력한 별의 수 배열에 저장하기
		}
		// for문사용하여 *출력하기
		for (int i = 0; i < arr.length; i++) {
			// 별의 갯수 출력하기
			System.out.print(arr[i] + ":");
			// 인덱스의 수만큼 별을 출력하기
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
