package �˰���������;

public class ��������19�� {

	public static void main(String[] args) {
		// ������ ����
		int num1 = 50;
		int num2 = 15;
		char op = '-';

		// cal�޼ҵ带 ����Ͽ� ����� ���
		System.out.println(cal(num1, num2, op));

	}

	// cal�޼ҵ� �ۼ�
	public static int cal(int num1, int num2, char op) {
		int result = 0; // ������ ���� �־��ִ� ���� �ʱ�ȭ
		// if���� ����Ͽ� op�� �°� ������ �Ǵ�
		if (op == '+') {// +�϶�
			result = num1 + num2;
		} else if (op == '-') {// -�϶�
			result = num1 - num2;
		} else if (op == '*') {// *�϶�
			result = num1 - num2;
		} else if (op == '/') {// / �϶�
			result = num1 - num2;
		}
		//������ ������� ���ϰ����� ����
		return result;

	}

}
