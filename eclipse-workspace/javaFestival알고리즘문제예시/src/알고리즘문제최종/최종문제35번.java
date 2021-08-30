package 알고리즘문제최종;

import java.util.Random;
import java.util.Scanner;

public class 최종문제35번 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 랜덤 생성
		Random rd = new Random();

		int result = 0;// 연산 결과값 변수 초기화
		int f = 0; // 틀린개수 세는 변수 초기화
		while (f != 5) {
			// 연산 출력문 작성 및 입력받기
			int num1 = rd.nextInt(10) + 1;//랜덤으로 num1에 값 넣기
			int num2 = rd.nextInt(10) + 1;//랜덤으로 num2에 값 넣기
			System.out.println(num1 + "+" + num2 + "=");
			result = sc.nextInt();
			// if문을 사용하여 정잡을 맞추었는지 확인하기
			if (result == num1 + num2) {// 정답을 맞췄을때
				System.out.println("SUCCESS!");
			} else if (result != num1 + num2) {// 정답을 맞추지 못 할때
				System.out.println("Fail...");
				f++;
			}
		}
		// 다섯번 틀리면 게임오버
		System.out.println("GAME OVER!");
	}

}
