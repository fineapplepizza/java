package day02;

import java.util.Scanner;

public class ex04삼항연산자 {

	public static void main(String[] args) {
		//1. 스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		//2. 첫 번째 정수 입력 출력하기
		System.out.print("첫 번째 정수 입력: ");
		//3. 사용자에게 첫 번째 정수 입력 받기
		int num1 = sc.nextInt();
		//4. 두 번째 정수 입력 출력하기
		System.out.print("두 번째 정수 입력: ");
		//5. 사용자에게 두 번째 정수 입력 받기
		int num2 = sc.nextInt();
		//6. 두 수의 차 출력하기
       System.out.println( (num1>num2)? "두 수의 차 :" + (num1 - num2) : "두 수의 차 :" + (num2 - num1));
	}

}
