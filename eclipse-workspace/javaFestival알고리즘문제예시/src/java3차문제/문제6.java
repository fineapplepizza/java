package java3������;

import java.util.Scanner;

public class ����6 {

	public static void main(String[] args) {
		// ��ĳ�� ���� �ϱ�
		Scanner sc = new Scanner(System.in);
		// �����Է� ��¹� �ۼ� �� �Է¹ޱ�
		System.out.println("�����Է� >>");
		int num = sc.nextInt();
		// 2���� ��ȭ�ϱ�
		// 2������ ��ȯ �� ���� IntegerŬ������ �Լ��� ���
		// IntegerŬ������ toBinaryString�Լ��� ����ϸ� 2������ ��ȯ���ش�.
		String binaryString = Integer.toBinaryString(num);
		System.out.println(binaryString);

	}

}
