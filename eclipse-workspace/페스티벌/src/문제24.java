

import java.util.Scanner;

public class 문제24 {

	public static void main(String[] args) {
		//스캐너생성
		Scanner sc = new Scanner(System.in);
		//숫자입력 출력 및 입력
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		//2진수 변환
		String two = Integer.toBinaryString(num);
		//출력
		System.out.println(two);

	}

}
