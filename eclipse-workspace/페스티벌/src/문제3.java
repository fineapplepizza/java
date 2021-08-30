package 최종문제;

public class 문제3 {

	public static void main(String[] args) {
		// 홀수 양수 합 변수
		int num1 = 0;
		// 음수 양수 합 변수
		int num2 = 0;
		// for문
		for (int i = 1; i <= 100; i++) {
			// if문
			if (i % 2 == 1) {// 홀수는 양수
				System.out.print(i + " ");
				num1 += i;
			} else {// 짝수는 음수
				System.out.print(-i + " ");
				num2 += -i;
			}
		}
		System.out.println();
		// 결과출력
		System.out.println("결과: " + (num1 + num2));

	}

}
