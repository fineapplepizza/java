package ������������;

public class ����33 {

	public static void main(String[] args) {
		int base =2;
		int n =3;
		int result =powerN(base,n);
		System.out.println("���Ȯ��: "+result);

	}
	//powerN()�޼ҵ�
	public static int powerN(int base,int n) {
		// ������ ���� ������ ����
		int result = (int)Math.pow(base, n);
		return result;
	}

}
