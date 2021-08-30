

import java.util.Random;

public class 문제21 {

	public static void main(String[] args) {
		// 랜덤 생성
		Random rd = new Random();
		// 배열 생성
		int arr[] = new int[6];
		// for문 배열에 숫자저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(46) + 1;
			// 중복제거
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		// 결과
		for (int i = 0; i < arr.length; i++) {
			System.out.println("행운의숫자 : " + arr[i]);
		}

	}

}
