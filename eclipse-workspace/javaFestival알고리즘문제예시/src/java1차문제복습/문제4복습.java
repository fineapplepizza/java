package java1차문제복습;

import java.util.Scanner;

public class 문제4복습 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//총금액 입력 출력문 작성 및 입력받기
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		System.out.println();
		//잔돈 출력문 작성
		System.out.println("잔돈 : "+money+"원");
		//10000원 개수
		int m10000= money/10000;
		System.out.println("10000원: "+m10000);
		//5000원 개수
		int m5000= (money%10000)/5000;
		System.out.println("5000원: "+m5000);
		//1000원 개수
		int m1000= ((money%10000)%5000)/1000;
		System.out.println("1000원: "+m1000);
		//500원 개수
		int m500 = (((money%10000)%5000)%1000)/500;
		System.out.println("500원: "+m500);
		//100원 개수
		int m100 = ((((money%10000)%5000)%1000)%500)/100;
		System.out.println("100원: "+m100);
		

	}

}
