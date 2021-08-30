package 알고리즘문제예시2차;

public class 문제2 {

	public static void main(String[] args) {
		// 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
		// for문을 활용하여 행 개수 출력하기
		for (int i = 0; i < 7; i++) {
			for (int j = 7; j > i; j--) {// 별의 열개수 출력
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
