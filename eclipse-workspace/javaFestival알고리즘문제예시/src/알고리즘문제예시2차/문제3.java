package 알고리즘문제예시2차;

import java.util.Scanner;

public class 문제3 {
	// 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력하시오.
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 숫자입력 출력문 작성 및 입력받기
		System.out.print("숫자 입력: ");
		int number = sc.nextInt();
		// if문을 활용하여 반올림 판단하기
		if (number % 10 >= 5) {
			number = (number / 10 * 10) + 10;
		} else {
			number = number / 10 * 10;
		}
		// 반올림 수 출력문 작성
		System.out.println("반올림 수 : " + number);

	}

}
