package java3������;

public class ����1 {

	public static void main(String[] args) {
		// getMiddle�޼ҵ�� ��� ���� ���ϱ�
		System.out.println(getMiddle("test")); 

	}

	// �ܾ ��ȯ�ϴ� getMiddle�޼ҵ� �����
	public static String getMiddle(String str) {
		// String[] spilt()-�Է¹��� ����ǥ���� �Ǵ� Ư�����ڸ� �������� ���ڿ��� ������ �迭(Array)�� �����Ͽ� �����մϴ�.
		String[] list = str.split("");
		// if���� Ȱ���Ͽ� �ܾ��� ���̰� ¦������ Ȧ������ �Ǵ�
		if (list.length % 2 == 1) {// �ܾ��� ���̰� Ȧ�� �϶�
			int middle = list.length / 2; // �迭�� ���̸� 2�� ������ �迭�� �ε��� ��� ���� ���� �� �ִ�.
			return list[middle];
		}
		if (list.length % 2 == 0) {// �ܾ��� ���̰� ¦�� �϶�
			int first = list.length / 2 - 1;
			int second = list.length / 2;
			return list[first] + list[second];
		}
		return str;
		
	}

}
