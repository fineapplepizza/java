package 문제;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		// 스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 숫자입력 출력문 작성
		System.out.print("숫자입력>> ");
		// 숫자입력받기
		int num = sc.nextInt();
		
		// 10으로 나눈 몫과 나머지 출력하기
		// 몫과 나머지 변수명 지정
		int share = num / 10;
		int rest = num % 10;

		// 몫과 나머지 출력문 작성
		System.out.println("10으로 나눈 몫 : " + share);
		System.out.println("10으로 나눈 나머지 : " + rest);

	}

}
