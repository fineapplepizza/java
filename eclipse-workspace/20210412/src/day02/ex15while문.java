package day02;

import java.util.Scanner;

public class ex15while문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//		int num2 = 0;
//		int minus = 0;
		
		while(true) {
			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int num2 = sc.nextInt();
			
			if(num1 != 0 && num2 != 0) {
				System.out.println("결과 >> "+ (num1-num2));
			}
			else if(num1 ==0 && num2 ==0) {
				break;
				
			}
//			minus = num1 - num2;
//			System.out.println("결과 >>" + minus);
//			if (num1 == 0 && num2 == 0) {
//				System.out.println("프로그램 종료");
//				break;
//			}
		}

	}

}
