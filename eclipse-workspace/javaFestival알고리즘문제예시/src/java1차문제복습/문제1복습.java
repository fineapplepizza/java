package java1����������;

import java.util.Scanner;

public class ����1���� {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// ��������� ��¹� �ۼ� �� �Է¹ޱ�
		System.out.print("���������: ");
		int w = sc.nextInt();
		// ��ǥ������ ��¹� �ۼ� �� �Է¹ޱ�
		System.out.print("��ǥ������: ");
		int h = sc.nextInt();
		// ������ ���� �ʱ�ȭ �ϱ�
		int week = 1;
		// while��
		while(w>h) {
		// ������ ���� ������ ��¹� �ۼ� �� �Է¹ޱ�
		System.out.println(week+"���� ���� ������: ");
		int m = sc.nextInt();
		w=w-m;
		week++;
		}
		// ��ǥ �޼��� ���ϸ޼��� ��¹� �ۼ�
		System.out.println(w+"kg �޼�!! �����մϴ�!");

	}

}
