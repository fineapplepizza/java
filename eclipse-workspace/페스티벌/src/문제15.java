
public class ����15 {

	public static void main(String[] args) {
		// ���ڿ� ����
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		// String[]split()
		String str[] = score.split(",");
		// ���� �� �л� �� ���� �ʱ�ȭ
		int A = 0, B = 0, C = 0, D = 0, F = 0;
		// for��
		for (int i = 0; i < str.length; i++) {
			// if��
			if (str[i].equals("A")) {// A
				A += 1;
			} else if (str[i].equals("B")) {// B
				B += 1;
			} else if (str[i].equals("C")) {// C
				C += 1;
			} else if (str[i].equals("D")) {// D
				D += 1;
			} else if (str[i].equals("F")) {// F
				F += 1;
			}
		}
		// ������
		System.out.println(
				"A : " + A + "��\n" + "B : " + B + "��\n" + "C : " + C + "��\n" + "D : " + D + "��\n" + "F : " + F + "��\n");

	}

}
