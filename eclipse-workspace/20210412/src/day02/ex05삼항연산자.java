package day02;

import java.util.Scanner;

public class ex05삼항연산자 {

	public static void main(String[] args) {
		// 1. 스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		// 2. 농구공의 개수를 입력하세요 출력하기
		System.out.print("농구공의 개수를 입력하세요 : ");
		// 3. 사용자에게 정수를 입력 받기
		int basketball = sc.nextInt();
		// 4. 필여한 상자의 수 출력하기
		System.out.println(basketball % 5 == 0 ? "필요한 상자의 수 :" + (basketball / 5) : "필요한 상자의 수 :" + ((basketball / 5) + 1));

	}

}
