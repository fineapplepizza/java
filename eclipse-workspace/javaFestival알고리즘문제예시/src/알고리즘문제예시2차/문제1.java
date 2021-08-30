package 알고리즘문제예시2차;

public class 문제1 {

	public static void main(String[] args) {
		// (77*1) + (76*2) + (75*3) +...+(1*77)를 계산하여 결과를 출력하시오.
		// 합계 변수 초기화
		int sum = 0;
		// 1~77곱하는 변수 초기화
		int cnt = 1;

		// for문을 활용하여 (77*1)+(76*2)~~계산하기
		for (int i = 77; i >= 1; --i) {
			sum = sum + (i * cnt);
			cnt++;
		}
		// 합계 출력하기
		System.out.println(sum);
	}

}
