

import java.util.Scanner;

public class ����24 {

	public static void main(String[] args) {
		//��ĳ�ʻ���
		Scanner sc = new Scanner(System.in);
		//�����Է� ��� �� �Է�
		System.out.println("�����Է�>>");
		int num = sc.nextInt();
		//2���� ��ȯ
		String two = Integer.toBinaryString(num);
		//���
		System.out.println(two);

	}

}
