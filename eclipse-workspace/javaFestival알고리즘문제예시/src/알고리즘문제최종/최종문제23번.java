package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제23번 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 단수입력 출력문작성및 입력받기
		System.out.println("단수입력: ");
		int dan = sc.nextInt();
		// 어느 수까지 출력문 작성및 입력 받기
		System.out.println("어느 수까지 출력: ");
		int num = sc.nextInt();
		// 몇단 출력문작성
		System.out.println(dan);
		// for문을 사용해서 구구단 출력
		for (int i = 1; i <= num; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}

	}

}
