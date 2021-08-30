package java1차문제복습;

import java.util.Scanner;

public class 문제1복습 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 현재몸무게 출력문 작성 및 입력받기
		System.out.print("현재몸무게: ");
		int w = sc.nextInt();
		// 목표몸무게 출력문 작성 및 입력받기
		System.out.print("목표몸무게: ");
		int h = sc.nextInt();
		// 몇주차 변수 초기화 하기
		int week = 1;
		// while문
		while(w>h) {
		// 몇주차 감량 몸무게 출력문 작성 및 입력받기
		System.out.println(week+"주차 감량 몸무게: ");
		int m = sc.nextInt();
		w=w-m;
		week++;
		}
		// 목표 달성시 축하메세지 출력문 작성
		System.out.println(w+"kg 달성!! 축하합니다!");

	}

}
