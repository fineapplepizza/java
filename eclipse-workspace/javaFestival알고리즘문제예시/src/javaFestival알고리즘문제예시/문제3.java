package javaFestival�˰���������;

public class ����3 {

	public static void main(String[] args) {
		int dualNumber = 0;
		int negativeQuantity = 0;
		// for���� Ȱ���Ͽ� 1 -2 3...-100���� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			// if���� Ȱ���Ͽ� ����� ���� �Ǵ��ϱ�
			if (i % 2 == 1) { // ��� ���
				System.out.print(i + " ");
				dualNumber += i; // ����� �� ��
			} else {// ���� ���
				System.out.print(-i + " ");
				negativeQuantity += -i; // ������ �� ��
			}
		}
		// ��� ����ϱ�
		System.out.println();
		System.out.println("��� : " + (dualNumber + negativeQuantity));

	}

}
