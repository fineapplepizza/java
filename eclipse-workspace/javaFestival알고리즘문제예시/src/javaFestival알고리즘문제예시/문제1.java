package javaFestival�˰���������;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		// ��ĳ�� ��� �����ϱ�
		Scanner sc = new Scanner(System.in);
		// ��������� ��� �� �Է��ϱ�
		System.out.print("��������� : ");
		int currentWeight = sc.nextInt();
		// ��ǥ������ ��� �� �Է��ϱ�
		System.out.print("��ǥ������ : ");
		int targetWeight = sc.nextInt();
		// ������ ���� �ʱ�ȭ�ϱ�
		int week = 1;
		
		// while�� Ȱ���ϱ�
		while (true) {
			// if���� Ȱ���Ͽ� ��ǥ�����Կ� �����ߴ��� �Ǵ��ϱ�
			if (currentWeight > targetWeight) { // ��ǥ�����Կ� �������� �ʾ��� ���

				// ���������� ��� �� �Է��ϱ�
				System.out.print(week + "���� ���� ������ : ");
				int loseWeight = sc.nextInt();
				currentWeight -= loseWeight;
				week++;
			} else if (currentWeight <= targetWeight) { // ��ǥ�޼����� ���
				// ���ϸ޽��� ����ϱ�
				System.out.println(currentWeight + "kg �޼�!! �����մϴ�!");
				break;
			}

		}

	}
}
