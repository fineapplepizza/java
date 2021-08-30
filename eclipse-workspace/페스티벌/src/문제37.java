
import java.util.Scanner;

public class 문제37 {

	public static void main(String[] args) {
		// 스캐너생성
		Scanner sc = new Scanner(System.in);
		// 입력
		System.out.println("입력 : ");
		int num = sc.nextInt();
		int result = 1;
		// for문
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		// 출력
		System.out.println("출력: " + result);

	}

}
