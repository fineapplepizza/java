package �˰���������2��;

public class ����1 {

	public static void main(String[] args) {
		// (77*1) + (76*2) + (75*3) +...+(1*77)�� ����Ͽ� ����� ����Ͻÿ�.
		// �հ� ���� �ʱ�ȭ
		int sum = 0;
		// 1~77���ϴ� ���� �ʱ�ȭ
		int cnt = 1;

		// for���� Ȱ���Ͽ� (77*1)+(76*2)~~����ϱ�
		for (int i = 77; i >= 1; --i) {
			sum = sum + (i * cnt);
			cnt++;
		}
		// �հ� ����ϱ�
		System.out.println(sum);
	}

}
