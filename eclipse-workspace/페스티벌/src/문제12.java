
public class 문제12 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인: " + result);

	}

	// isDivide메소드 생성
	public static boolean isDivide(int num1, int num2) {
		// 결과 값 변수
		boolean result;
		// if문
		if (num1 % num2 == 0) {// 나누어질때
			result = true;
		} else {// 안 나누어질때
			result = false;
		}

		return result;
	}

}
