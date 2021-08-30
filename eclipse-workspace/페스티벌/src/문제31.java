package 최종문제;

import java.util.Scanner;

public class 문제31 {

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		//첫 번재 숫자
		System.out.println("첫 번째 숫자 입력>> ");
		int num1 = sc.nextInt();
		//두 번째 숫자
		System.out.println("두 번째 숫자 입력>> ");
		int num2 = sc.nextInt();
        
		int result1=0;
		int result2=0;
		int result3=0;
		
		result1 = num1*(num2%10);
		result2 = num1*((num2/10)%10)*10;
		result3 = num1*(((num2/10)/10)%10)*100;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1+result2+result3);
		
		
	}

}
