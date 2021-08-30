package javaFestival알고리즘문제예시;

public class 문제3 {

	public static void main(String[] args) {
		int dualNumber = 0;
		int negativeQuantity = 0;
		// for문을 활용하여 1 -2 3...-100까지 출력하기
		for (int i = 1; i <= 100; i++) {
			// if문을 활용하여 양수와 음수 판단하기
			if (i % 2 == 1) { // 양수 출력
				System.out.print(i + " ");
				dualNumber += i; // 양수의 총 합
			} else {// 음수 출력
				System.out.print(-i + " ");
				negativeQuantity += -i; // 음수의 총 합
			}
		}
		// 결과 출력하기
		System.out.println();
		System.out.println("결과 : " + (dualNumber + negativeQuantity));

	}

}
