package javaFestival�˰���������;

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		// ��ĳ�� ��� ����
		Scanner sc = new Scanner(System.in);
		// �ѱݾ� �Է� ��� �� �Է� �ޱ�
		System.out.print("�ѱݾ� �Է� : ");
		int lumpsum = sc.nextInt();
		// �ܵ� ��¹ޱ�
		System.out.println("�ܵ� : " + lumpsum);
		// 10000�� ���� ���� ���
		int krw10000 = lumpsum / 10000;
		System.out.println("10000�� : " + krw10000);
		// 5000�� ���� ���� ���
		int krw5000 = (lumpsum % 10000) / 5000;
		System.out.println("5000�� : " + krw5000);
		// 1000�� ���� ���� ���
		int krw1000 = ((lumpsum % 10000) % 5000) / 1000;
		System.out.println("1000�� : " + krw1000);
		// 500�� ���� ���� ���
		int krw500 = ((((lumpsum % 10000) % 5000) % 1000) / 500);
		System.out.println("500�� : " + krw500);
		// 100�� ���� ���� ���
		int krw100 = (((((lumpsum % 10000) % 5000) % 1000) % 500) / 100);
		System.out.println("100�� : " + krw100);

	}

}
