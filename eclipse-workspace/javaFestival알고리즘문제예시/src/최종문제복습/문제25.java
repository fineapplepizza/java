package ������������;

public class ����25 {

	public static void main(String[] args) {
		// 1�����迭����
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		// ���� ���� �Ÿ��� �����ϴ� ���� �ʱ�ȭ
		int min = Math.abs(point[0] - point[1]);
        //�ε��� ��ġ�� �������� ���� �ʱ�ȭ
		int first = 0;
		int second = 0;
		// for��
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {//i=j�� ������ �ּ� �Ÿ��� ���� �� ����
					if (min > Math.abs(point[i] - point[j])) {// if������ �������� �Ÿ� ��
						min = Math.abs(point[i] - point[j]);
						first = i;
						second = j;
					}
				}
			}
		}
		// ���
		System.out.println("result = [" + first + "," + second + "]");

	}

}
