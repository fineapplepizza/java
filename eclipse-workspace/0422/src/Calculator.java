
public class Calculator {
	
	//필드 정의
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int sum() {
		int sum = num1+num2;
		return sum;
	}
	public int sub() {
		int sub = num1 - num2;
		return sub;
	}
	public int mul() {
	int mul = num1*num2;
	return mul;
	}	
	public double div() {
		double div = num1 / num2;
		return div;
	}

}
