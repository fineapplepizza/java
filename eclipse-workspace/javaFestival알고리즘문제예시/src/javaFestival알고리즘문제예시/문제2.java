package javaFestival�˰���������;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		// ��ĳ�� �����ϱ�
		Scanner sc = new Scanner(System.in);
		// ���ѽð� ��¹� �Է¹ޱ�
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int hoursDuty = sc.nextInt();
		// ���ӱ� ������ �ʱ�ȭ �ϱ�
		double grossWage = 0;
		// if���� Ȱ���ϱ�
		if (hoursDuty > 8) { // 8�ð����� �ʰ��ٹ�������
			grossWage = 40000 + 5000 * 1.5 * (hoursDuty - 8);

		} else { // 8�ð� �ȿ� �ٹ� ������
			grossWage = hoursDuty * 5000;
		}

		// ���ӱ� ����ϱ�
		System.out.println("�� �ӱ��� " + (int) grossWage + "�� �Դϴ�.");

	}

}
