
public class ����6_2�� {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =3;
		boolean result = isDivide(num1,num2);
		System.out.println("���Ȯ��: "+result);

	}
	//���� ������ ���� ������ �������������� �Ǻ��ϴ� �޼ҵ�isDivide()�� �ۼ�
	public static boolean isDivide(int num1,int num2) {
		//��/������ �Ǻ��ϴ� ����
		boolean result;
		if(num1%num2==0) {//����������
			result = true;
		}else {//���������� ������
			result = false;
			
		}
		return result;
	}

}
