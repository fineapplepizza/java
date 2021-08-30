package 최종문제;

public class 문제6 {

	public static void main(String[] args) {
		// 카운트할 변수
		int cnt = 1;
		// 합계 변수
		int sum = 0;
		// for문
		for (int i = 77; i > 0; i--) {
			sum += (i * cnt);
			cnt++;
		}
		System.out.println(sum);

	}

}
