package �˰���������;

public class ��������28 {

	public static void main(String[] args) {
		// ������ �迭 �����ϱ�
		int arr[][] = new int[5][5];
		// �������迭 ���� �����ϴ� ���� �ʱ�ȭ�ϱ�
		int k = 1;
		// for���� ����Ͽ� �������迭 ����ϱ�
		for (int i = 0; i < arr.length; i++) {// ���� for��
			for (int j = arr.length-1; j >=0; j--) {// ���� for��
				arr[j][i] = k;
				k++; // ���������ڸ� ����Ͽ� ���� 1�� �ø���
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
