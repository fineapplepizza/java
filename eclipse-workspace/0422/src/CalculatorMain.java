
public class CalculatorMain {

	public static void main(String[] args) {
		//2개의 매개변수를 넘겨받는 생성자를 이용해 객체 cal을 만드세요.
		Calculator cal = new Calculator(2,1);
		//cal객체의 num1과 num2를 더한 값을 출력하세요.
		System.out.println(cal.sum());
		//cal객체의 num1값은 75,num2의 값은 5로 수정하세요.
		cal.setNum1(75);
		cal.setNum2(5);
		//cal객체의 num1과 num2를 뺀 값, 곱한 값,나눈 값을 출력하세요.
		System.out.println(cal.sub()+","+cal.mul()+","+cal.div());

	}

}
