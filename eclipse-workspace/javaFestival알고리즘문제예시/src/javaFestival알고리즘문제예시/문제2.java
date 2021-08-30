package javaFestival알고리즘문제예시;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// 스캐너 생성하기
		Scanner sc = new Scanner(System.in);
		// 일한시간 출력및 입력받기
		System.out.print("일한시간을 입력하세요 : ");
		int hoursDuty = sc.nextInt();
		// 총임금 변수명 초기화 하기
		double grossWage = 0;
		// if문을 활용하기
		if (hoursDuty > 8) { // 8시간보다 초과근무했을때
			grossWage = 40000 + 5000 * 1.5 * (hoursDuty - 8);

		} else { // 8시간 안에 근무 했을때
			grossWage = hoursDuty * 5000;
		}

		// 총임금 출력하기
		System.out.println("총 임금은 " + (int) grossWage + "원 입니다.");

	}

}
