

import java.util.Scanner;

public class 문제8 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 연산 결과값 변수 초기화
		int result = 0;
		while (true) {
			// A입력 출력 및 입력
			System.out.print("A 입력>> ");
			int a = sc.nextInt();
			// B입력 출력 및 입력
			System.out.print("B 입력>> ");
			int b = sc.nextInt();
			// if문 모두 0이면 프로그램 종료
			if (a == 0 && b == 0) {
				break;
			}
			// 연산
			result = a - b;
			// 결과 출력
			System.out.println("결과 >> " + result);

		}
	}
}
