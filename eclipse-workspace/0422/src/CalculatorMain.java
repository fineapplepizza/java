
public class CalculatorMain {

	public static void main(String[] args) {
		//2���� �Ű������� �Ѱܹ޴� �����ڸ� �̿��� ��ü cal�� ���弼��.
		Calculator cal = new Calculator(2,1);
		//cal��ü�� num1�� num2�� ���� ���� ����ϼ���.
		System.out.println(cal.sum());
		//cal��ü�� num1���� 75,num2�� ���� 5�� �����ϼ���.
		cal.setNum1(75);
		cal.setNum2(5);
		//cal��ü�� num1�� num2�� �� ��, ���� ��,���� ���� ����ϼ���.
		System.out.println(cal.sub()+","+cal.mul()+","+cal.div());

	}

}
