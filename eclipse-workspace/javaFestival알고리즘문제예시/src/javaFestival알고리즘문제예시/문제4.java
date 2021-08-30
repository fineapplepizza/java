package javaFestival알고리즘문제예시;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// 스캐너 기능 생성
		Scanner sc = new Scanner(System.in);
		// 총금액 입력 출력 및 입력 받기
		System.out.print("총금액 입력 : ");
		int lumpsum = sc.nextInt();
		// 잔돈 출력받기
		System.out.println("잔돈 : " + lumpsum);
		// 10000원 지폐 개수 출력
		int krw10000 = lumpsum / 10000;
		System.out.println("10000원 : " + krw10000);
		// 5000원 지폐 개수 출력
		int krw5000 = (lumpsum % 10000) / 5000;
		System.out.println("5000원 : " + krw5000);
		// 1000원 지폐 개수 출력
		int krw1000 = ((lumpsum % 10000) % 5000) / 1000;
		System.out.println("1000원 : " + krw1000);
		// 500원 지폐 개수 출력
		int krw500 = ((((lumpsum % 10000) % 5000) % 1000) / 500);
		System.out.println("500원 : " + krw500);
		// 100원 지폐 개수 출력
		int krw100 = (((((lumpsum % 10000) % 5000) % 1000) % 500) / 100);
		System.out.println("100원 : " + krw100);

	}

}
