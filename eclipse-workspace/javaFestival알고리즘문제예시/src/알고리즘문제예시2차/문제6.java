package �˰���������2��;

public class ����6 {

	public static void main(String[] args) {
		// �� ���� ������ �Ű������� �޾� ���� ������ ���� ������
		// �������������� �Ǻ��ϴ� �޼ҵ� isDivide()�� �ۼ��ϼ���.
		// �̶�, ���������� true, ���������� ������ false�� ��ȯ��

		// �� ���� ������ �ʱ�ȭ�ϱ�
		int num1 = 10;
		int num2 = 2;
		// ���� ������ ���� ������ �������������� �Ǻ��ϴ� �޼ҵ�
		boolean result = isDivide(num1, num2);
		// ��� Ȯ�� ��¹� �ۼ�
		System.out.println("���Ȯ��: " + result);

	}

	// ���� ������ ���� ������ �������������� �Ǻ��ϴ� �޼ҵ� isDivide()�ۼ�
	public static boolean isDivide(int num1, int num2) {
		// boolean Ÿ���� ���Ȯ�� �ϴ� ����result �����
		boolean result;
		if (num1 % num2 == 0) {// ���� ������ ���� ������ ����������
			result = true;
		} else {// ���� ������ ���� ������ ������ ���� ������
			result = false;
		}
		return result;
	}

}
