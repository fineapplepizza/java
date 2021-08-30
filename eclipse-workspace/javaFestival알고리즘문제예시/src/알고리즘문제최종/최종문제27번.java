package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제27번 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 1차원 배열 생성
		int arr[] = new int[5];
		// 몇번째 카운트 하는 변수 초기화
		int cnt = 1;
		// for문을 사용하여 1~5번째까지 입력받기
		for (int i = 0; i < 5; i++) {
			// 정수를 입력받는 출력문 작성및 입력
			System.out.println(cnt + "번째 수 입력 : ");
			// 입력받은 정수를 배열에 저장
			arr[i] = sc.nextInt();
			cnt++;// 증감연산자를 이용해서 카운트하기
		}

		// 오름차순 정렬하기 위한 변수 생성하기
		int temp = 0;
		int indexnum = 0;
		// for문을 이용해서 오름차순 정렬하기
		for (int i = 0; i < arr.length; i++) {
			indexnum = i;
			for (int j = i + 1; j < arr.length; j++) {// 같은 인덱스값은 비교하지 않게 j=i+1로 초기화
				if (arr[j] < arr[indexnum]) {// if문을 사용하여 작은 인덱스값 판단
					indexnum = j;// 작은 인덱스 값은 indexnum에 값을 넣기
				}
			}
			// 치환해서 오름차순 정렬하기
			temp = arr[indexnum];
			arr[indexnum] = arr[i];
			arr[i] = temp;
		}
		System.out.println("정렬 후");
		// for문을 이용해서 오름차순 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
