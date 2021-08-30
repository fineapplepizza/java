package day02;

import java.util.Scanner;

public class ex07조건문 {

	public static void main(String[] args) {
		//1. 스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		//2. 정수 입력 받기
		int num = sc.nextInt();
		//3. 조건문활용해서 출력하기
		if (num % 3 ==0 && num % 5 ==0) {
			System.out.println("3과 5의 배수입니다.");
		}
       
	}

}
