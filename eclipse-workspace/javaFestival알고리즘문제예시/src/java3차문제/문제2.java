package java3������;

public class ����2 {

	public static void main(String[] args) {
		  // ���ڿ� ����
	      String score = "A,A,B,C,D,A,C,D,D,D,F";
	      // String[]spilt()���� score ���ڿ��� �迭�� �ֱ�
	      String[] str = score.split(",");
	      // ������ �л� �� ���� �ʱ�ȭ �ϱ�
	      int A = 0, B = 0, C = 0, D = 0, F = 0;
	      // for���� �̿��Ͽ� �������� �л� ���� �����ϱ�
	      for (int i = 0; i < str.length; i++) {
	         if (str[i].equals("A")) {// if�� A�л� ��
	            A++;
	         } else if (str[i].equals("B")) {// B�л���
	            B++;
	         } else if (str[i].equals("C")) {// C�л���
	            C++;
	         } else if (str[i].equals("D")) {// D�л���
	            D++;
	         } else if (str[i].equals("F")) {// F�л���

	         }
	      }
	      // ������ �л��� ����ϱ�
	      System.out.println(
	            "A : " + A + "��\n" + 
	              "B : " + B + "��\n" + 
	            "C : " + C + "��\n" + 
	              "D : " + D + "��\n" + 
	             "F : " + F + "��\n");



	}

}
