package day02;

import java.util.Scanner;

public class ex09조건문 {
	public static void main(String[] args) {
		
	
	// 1.정수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		//2.반올림 확인하기 -> 일의 자리 확인
		int n = input%10;
		
		int result = 0;
		
		// 3. 반올림을 할지 / 하지 않을지 판단
		if(n >= 5) {
			// 반올림 연산처리 진행
			result = (input/10 + 1)*10;
		
		}else {
			result = input/10*10;
			
		}
		
	     System.out.println("반올림 수 : " + result);

		}

}
