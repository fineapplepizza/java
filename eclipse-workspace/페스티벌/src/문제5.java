

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 행 개수 출력 및 입력
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		// 이중for문
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
