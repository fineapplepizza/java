package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제30번 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("첫자리 0을 제외한 숫자를 입력해주세요 >>");
		int num = sc.nextInt();
		System.out.println("대시('-')의 총 합>>"+toNum(num));

	}

	// 대시문자를 구하는 함수 toNum메소드 만들기
	public static int toNum(int num) {
		int result = 0;
		// 숫자별 - 개수
		int[] nums = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		while (num > 0) {
			int num2 = num % 10; // 10의 자리에서 남은숫자 구하기
			num /= 10; // 맨 뒷자리부터 10의 단위로 숫자 삭제하기
			result += nums[num2]; // 배열과 10의 자리 수를 비교해서 '-'구해서 합하기
		}
		return result;
	}

}
