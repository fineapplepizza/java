package day01;

public class ex02연산자 {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		// 문자가 먼저 연산되므로 값이 나오질 않음
		System.out.println("더하기 결과"+num1+num2);
		// 문자와 숫자가 더하면 문자로 바뀐다.
		System.out.println("더하기 결과"+(num1+num2));
	}

}
