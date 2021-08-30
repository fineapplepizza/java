package javaFestival알고리즘문제예시;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// 스캐너 기능 생성하기
		Scanner sc = new Scanner(System.in);
		// 현재몸무게 출력 및 입력하기
		System.out.print("현재몸무게 : ");
		int currentWeight = sc.nextInt();
		// 목표몸무게 출력 및 입력하기
		System.out.print("목표몸무게 : ");
		int targetWeight = sc.nextInt();
		// 몇주차 변수 초기화하기
		int week = 1;
		
		// while문 활용하기
		while (true) {
			// if문을 활용하여 목표몸무게에 감량했는지 판단하기
			if (currentWeight > targetWeight) { // 목표몸무게에 도달하지 않았을 경우

				// 감량몸무게 출력 및 입력하기
				System.out.print(week + "주차 감량 몸무게 : ");
				int loseWeight = sc.nextInt();
				currentWeight -= loseWeight;
				week++;
			} else if (currentWeight <= targetWeight) { // 목표달성했을 경우
				// 축하메시지 출력하기
				System.out.println(currentWeight + "kg 달성!! 축하합니다!");
				break;
			}

		}

	}
}
