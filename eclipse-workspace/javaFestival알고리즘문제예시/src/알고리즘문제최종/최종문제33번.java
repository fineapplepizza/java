package �˰���������;

public class ��������33�� {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		int result = powerN(base,n);
		System.out.println("���Ȯ��: "+result);

	}
	// ������ŭ ���� ��ȯ�ϴ� powerN()�޼ҵ带 �ۼ��ϼ���
	public static int powerN(int base, int n) {
		//������ ���ϴ� �Լ� Math.pow()�� ����ؼ� n������ŭ ��ȯ�ϱ�
		//������ ���ϴ� �Լ� Math.pow(��,����)�⺻���� double�̱� ������ int������ ��ȯ�ؾ��Ѵ�.
		int result = (int)Math.pow(base,n);
		return result;
	}

}
