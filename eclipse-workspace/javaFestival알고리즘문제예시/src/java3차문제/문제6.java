package java3차문제;

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// 스캐너 생성 하기
		Scanner sc = new Scanner(System.in);
		// 숫자입력 출력문 작성 및 입력받기
		System.out.println("숫자입력 >>");
		int num = sc.nextInt();
		// 2진수 변화하기
		// 2진수를 변환 할 때는 Integer클래스의 함수를 사용
		// Integer클래스의 toBinaryString함수를 사용하면 2진수로 변환해준다.
		String binaryString = Integer.toBinaryString(num);
		System.out.println(binaryString);

	}

}
