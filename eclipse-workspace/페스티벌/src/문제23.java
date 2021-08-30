

import java.util.Scanner;

public class 문제23 {

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 단수 출력 및 입력
		System.out.println("단수입력: ");
		int dan = sc.nextInt();
		// 어느수 출력 및 입력
		System.out.println("어느 수까지 출력:");
		int num = sc.nextInt();
		// 단수출력
		System.out.println(dan + "단");
		// for문 출력
		for (int i = 1; i <= num; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}

	}

}
