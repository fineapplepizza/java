package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제31번 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//첫 번째 숫자 입력 출력문 작성 및 입력받기
		System.out.println("첫 번째 숫자 입력>> ");
		int num1 = sc.nextInt();
		//두 번째 숫자 입력 출력문 작성 및 입력받기
		System.out.println("두 번째 숫자 입력>> ");
		int num2 = sc.nextInt();
		
		int result1 = num1*(num2%10);
		int result2 = num1*((num2/10)%10);
		int result3 = num1*(((num2/10)/10)%10);
	    //결과 출력
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(num1*num2);

	}

}
