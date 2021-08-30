package 알고리즘문제최종;

public class 최종문제19번 {

	public static void main(String[] args) {
		// 변수값 지정
		int num1 = 50;
		int num2 = 15;
		char op = '-';

		// cal메소드를 사용하여 결과값 출력
		System.out.println(cal(num1, num2, op));

	}

	// cal메소드 작성
	public static int cal(int num1, int num2, char op) {
		int result = 0; // 연산한 값을 넣어주는 변수 초기화
		// if문을 사용하여 op에 맞게 연산을 판단
		if (op == '+') {// +일때
			result = num1 + num2;
		} else if (op == '-') {// -일때
			result = num1 - num2;
		} else if (op == '*') {// *일때
			result = num1 - num2;
		} else if (op == '/') {// / 일때
			result = num1 - num2;
		}
		//연산한 결과값을 리턴값으로 지정
		return result;

	}

}
