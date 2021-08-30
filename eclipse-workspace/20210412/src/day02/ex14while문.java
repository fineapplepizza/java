package day02;

import java.util.Scanner;

public class ex14while문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = 0 ;
		
		// boolean -> true/false 소문자로 시작해야한다.
		while (num<10){
			System.out.print("정수 입력 : ");
			 num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");

	}

}
