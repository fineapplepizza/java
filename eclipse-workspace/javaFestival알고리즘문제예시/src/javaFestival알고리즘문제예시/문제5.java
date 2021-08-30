package javaFestival알고리즘문제예시;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// 스캐너 기능 생성
		Scanner sc = new Scanner(System.in);
		// 숫자 입력 출력문 작성 및 입력 받기
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		// if문을 활용하여 반올림 판단하기
		if (number % 10 >= 5) { // 5이상 반올림
			number = (number / 10 * 10) + 10;
		} else {// 5미만 반올림
			number = number / 10 * 10;
		}
		// 반올림수 출력하기
		System.out.println("반올림 수 : " + number);

	}

}
