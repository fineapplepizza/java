import java.util.Scanner;

public class ����6_3�� {

	public static void main(String[] args) {
		//��ĳ�ʻ���
		Scanner sc = new Scanner(System.in);
		//�����Է���¹��ۼ� �� �Է¹ޱ�
		System.out.println("�����Է�>>");
		int num = sc.nextInt();
		//2������ ��ȯ�ؼ� ����ϱ�
		String binary = Integer.toBinaryString(num);
		System.out.println(binary);

	}

}
