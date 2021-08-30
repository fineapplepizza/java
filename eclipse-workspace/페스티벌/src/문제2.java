package 최종문제;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 일한 시간 입력 출력문 작성및 입력
		System.out.print("일한시간을 입력하세요: ");
		int work = sc.nextInt();
		// 총임금 변수 초기화
		double money = 0;
		// if문 8시간 초과 판단
		if (work > 8) {// 8시간 초과할때
			money = 40000 + (work - 8) * 5000 * 1.5;
		} else {// 8시간내일때
			money = work * 5000;
		}
		// 결과출력
		System.out.println("총 임금은 " + (int)money + "원 입니다.");

	}

}
