package ��������;

public class �ϻ���� {

	public static void main(String[] args) {
		//ex ���� 18�� 1+8=9�̰�
				//19�� 9�� ������������Ƿ� �ϻ��� �� �̴�.
		System.out.println(isHarshod(18));
	}
	//�ϻ�������� �ƴ��� �Ǻ��ؾ��ϱ� ������ booleanŸ������ �޼ҵ带 �����.��
	public static boolean isHarshod(int num) {
		//�����Ҽ��ִº���
		int sum = 0;
		//� ���� ������ �𸣱� ������
		//�� ó������ num�̶�� ���� ����ϴ� ����
		int b =num;
		//���° �ݺ����� �𸣱� ������ while�� 
		while(num !=0 ) {//0�̾ƴҶ����� �ݺ��ϰڽ��ϴ�.
			//1�� �ڸ��� ����� �� �ִ� ����
			int a = num % 10;
			//sum���ٰ� a���� ����
			sum +=a;
			//10�� �ڸ��� ������ �ü� ����
			num = num/10;
		}
		
		if(b%sum==0) {//�������� 0�϶�  �ϻ������ �ȴ�.
			return true;
		}else {// �������� 0�� �ƴҶ� 
			return false;
		}
		
		
	}

}
