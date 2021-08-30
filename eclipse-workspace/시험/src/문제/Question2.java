package 문제;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		// 스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		// 일할시간 입력하는 출력문 작성하기
		System.out.print("일할시간을 입력하세요 : ");
		// 일할시간 입력하기
		int timeWork = sc.nextInt();
		
		// 임금 변수 만들기
        double money = 0;
		
		// 시급계산기 만들기
		// if-esle문 사용하여 8시간초과 했는지 안했는지 판단하기
		if (timeWork > 8) {
			money = 40000 + (timeWork - 8) * 5000 * 1.5;
		} else {
			money = timeWork * 5000;
		}
		
		// 총 임금 출력하기
		System.out.println("총 임금은 " + (int) money + "원 입니다.");

	}

}
