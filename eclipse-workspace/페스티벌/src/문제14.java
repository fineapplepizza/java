
public class ����14 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));

	}

	// getMiddle�޼ҵ� �����
	public static String getMiddle(String str) {
		// String[]split()
		String[] s = str.split("");
		// if��
		if (s.length % 2 == 0) {// ¦�����ڿ�
			int first = s.length / 2 - 1;
			int second = s.length / 2;
			return s[first] + s[second];
		} else {// Ȧ�����ڿ�
			int middle = s.length / 2;
			return s[middle];
		}

	}

}
