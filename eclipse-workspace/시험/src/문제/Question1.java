package ����;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		// ��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// �����Է� ��¹� �ۼ�
		System.out.print("�����Է�>> ");
		// �����Է¹ޱ�
		int num = sc.nextInt();
		
		// 10���� ���� ��� ������ ����ϱ�
		// ��� ������ ������ ����
		int share = num / 10;
		int rest = num % 10;

		// ��� ������ ��¹� �ۼ�
		System.out.println("10���� ���� �� : " + share);
		System.out.println("10���� ���� ������ : " + rest);

	}

}
