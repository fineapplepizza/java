package day05;

public class ex07�޼ҵ� {
// �ڵ� ��ü ���� -> ctrl + shift + f
	public static void main(String[] args) {
		 
		// �Լ��� �ԷµǴ� ���� ����� �����ִ� �޼ҵ�
		// getDivisor(10)
		// 10�� ��� : 1 2 5 10
		getDivisor(10);

	}
	// ����� 0���� �����ϸ� �ȵ� ������ �ȵ�
	public static void getDivisor(int num) {
		System.out.print(num + "�� ��� : ");
		for(int i = 1; i <= num ; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
