package java1차문제복습;

import java.util.Scanner;

public class 문제2복습 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//총임금 변수 초기화
		double money = 0;
		//일할시간을 입력하세요 출력문 작성및 입력받기
		System.out.print("일한시간을 입력하세요 : ");
		int work = sc.nextInt();
		//if문을 활용하여 8시간 초과했는지 판단
		if(work>8) {//8시간 초과했을때
			money = 40000+(work-8)*5000*1.5;
		}else {//8시간 안에 일했을때
			money = work*5000;
		}
		//총 임금 출력문 작성
		System.out.println("총 입금은 "+(int)money+"원 입니다.");

	}

}
