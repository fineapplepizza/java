
import java.util.Scanner;

public class 문제13 {

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 정수 입력 및 출력
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		// 이차원배열 생성
		int arr[][] = new int[num][num];
		// 배열 값 변수
		int k = 1;
		// for문 숫자 저장
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = arr.length - 1; j >= 0; j--) {// 홀수열
					arr[j][i] = k;
					k++;
				}
			} else {
				for (int j = 0; j < arr.length; j++) {// 짝수열
					arr[j][i] = k;
					k++;
				}
			}
		}

		// for문 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
