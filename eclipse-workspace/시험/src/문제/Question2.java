package ����;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		// ��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		// ���ҽð� �Է��ϴ� ��¹� �ۼ��ϱ�
		System.out.print("���ҽð��� �Է��ϼ��� : ");
		// ���ҽð� �Է��ϱ�
		int timeWork = sc.nextInt();
		
		// �ӱ� ���� �����
        double money = 0;
		
		// �ñް��� �����
		// if-esle�� ����Ͽ� 8�ð��ʰ� �ߴ��� ���ߴ��� �Ǵ��ϱ�
		if (timeWork > 8) {
			money = 40000 + (timeWork - 8) * 5000 * 1.5;
		} else {
			money = timeWork * 5000;
		}
		
		// �� �ӱ� ����ϱ�
		System.out.println("�� �ӱ��� " + (int) money + "�� �Դϴ�.");

	}

}
