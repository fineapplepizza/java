package day05;

public class ex04메소드 {

	public static void main(String[] args) {

		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);

	}

	// 사칙연산 메소드 구현
	public static void add(int num1, int num2) {
		
		System.out.println( num1 + num2);

	}

	public static void sub(int num1, int num2) {
//		int result = num1 - num2;
//		System.out.println(result);
		
		//큰수에서 작은 수 빼기
		System.out.println(num1 > num2 ? num1 -  num2 : num2 - num1);

	}

	public static void mul(int num1, int num2) {
		
		System.out.println(num1 * num2);

	}

	public static void div(int num1, int num2) {
		
		System.out.println(num1 / num2);

	}

}
