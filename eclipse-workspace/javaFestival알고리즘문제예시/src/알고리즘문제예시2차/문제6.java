package 알고리즘문제예시2차;

public class 문제6 {

	public static void main(String[] args) {
		// 두 개의 정수를 매개변수로 받아 앞의 정수가 뒤의 정수로
		// 나누어지는지를 판별하는 메소드 isDivide()를 작성하세요.
		// 이때, 나누어지면 true, 나누어지지 않으면 false를 반환함

		// 두 개의 정수를 초기화하기
		int num1 = 10;
		int num2 = 2;
		// 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드
		boolean result = isDivide(num1, num2);
		// 결과 확인 출력문 작성
		System.out.println("결과확인: " + result);

	}

	// 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드 isDivide()작성
	public static boolean isDivide(int num1, int num2) {
		// boolean 타입의 결과확인 하는 변수result 만들기
		boolean result;
		if (num1 % num2 == 0) {// 앞의 정수가 뒤의 정수로 나누어질때
			result = true;
		} else {// 앞의 정수가 뒤의 정수로 나누어 지지 않을때
			result = false;
		}
		return result;
	}

}
