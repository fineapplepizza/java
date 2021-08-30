package 최종문제;

import java.util.Scanner;

public class 문제27 {//

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 카운트변수
		int cnt = 1;
		// 배열생성
		int arr[] = new int[5];
		// for문
		for (int i = 0; i < arr.length; i++) {
			// 정수입력
			System.out.println(cnt + "번째 수 입력: ");
			arr[i] = sc.nextInt();
			cnt++;
		}
		int temp = 0;
		int indexnum = 0;

		for (int i = 0; i < arr.length; i++) {
			indexnum =i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[indexnum]) {
					indexnum = j;
				}
			}
			// 오름차순 치환
			temp = arr[indexnum];
			arr[indexnum] = arr[i];
			arr[i] = temp;
		}
		// 결과 출력
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
