

import java.util.Scanner;

public class 문제9 {

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 숫자 입력 출력 및 입력
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		// 반올림 수 변수 초기화
		int result = 0;
		// if문
		if (num % 10 >= 5) {
			result = num / 10 * 10 + 10;
		} else {
			result = num / 10 * 10;
		}
		// 결과 출력
		System.out.println("반올림 수: " + result);

	}

}
