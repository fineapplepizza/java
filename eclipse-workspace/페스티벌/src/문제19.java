

public class 문제19 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '-';

		System.out.println(cal(num1, num2, op));

	}

	// cal메소드 생성
	public static int cal(int num1, int num2, char op) {
		// 결과값
		int result = 0;
		if (op == '+') {// +일때
			result = num1 + num2;
		} else if (op == '-') {// -일때
			result = num1 - num2;
		} else if (op == '*') {// *일때
			result = num1 * num2;
		} else if (op == '/') {// /일때
			result = num1 / num2;
		}
		return result;
	}

}
