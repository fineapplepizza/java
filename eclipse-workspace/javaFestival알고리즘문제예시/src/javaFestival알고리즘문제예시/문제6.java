package javaFestival알고리즘문제예시;

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		//스캐너 기능 생성하기
		Scanner sc = new Scanner(System.in);
		//최대 공약수&최소 공배수 구하기 출력문 작성
		System.out.println("최대 공약수&최소 공배수 구하기");
		//숫자1입력 출력문 작성 및 입력 받기
		System.out.println("숫자1입력>> ");
		int number1 = sc.nextInt();
		//숫자2입력 출력문 작성 및 입력 받기
		System.out.println("숫자2입력>> ");
		int number2 = sc.nextInt();
		
		//최대 공약수 최소 공배수 변수 초기화
		int max = 0;
		int min = 0;
		//for문을 사용하여 숫자1,숫자2의 최대공약수 구하기
		for(int i = 1; i<=number1;i++) {
			if(number1%i==0 && number2%i==0) {
				max = i;
			}
				
		}
		//최대공약수 출력문 작성
		System.out.println("최대공약수: "+max);
		//숫자1,숫자2의 최소공배수 구하기
		min = number1*number2/max;
		//최소공배수 출력문 작성
		System.out.println("최소공배수: "+min);

	}

}
