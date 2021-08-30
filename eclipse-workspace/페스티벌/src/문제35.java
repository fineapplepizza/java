package 최종문제;

import java.util.Random;
import java.util.Scanner;

public class 문제35 {

	public static void main(String[] args) {
		// 스캐너생성
		Scanner sc = new Scanner(System.in);
		// 랜덤생성
		Random rd = new Random();
		int cnt = 0;
		while (cnt < 5) {
			int num1 = rd.nextInt(10) + 1;
			int num2 = rd.nextInt(10) + 1;

			System.out.println(num1 + "+" + num2 + "=");
			int result = sc.nextInt();
			if (result == num1 + num2) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				cnt++;
			}
		}
		System.out.println("GAME OVER!");
	}

}
