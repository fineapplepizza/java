package day02;

import java.util.Scanner;

public class ex05���׿����� {

	public static void main(String[] args) {
		// 1. ��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		// 2. �󱸰��� ������ �Է��ϼ��� ����ϱ�
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		// 3. ����ڿ��� ������ �Է� �ޱ�
		int basketball = sc.nextInt();
		// 4. �ʿ��� ������ �� ����ϱ�
		System.out.println(basketball % 5 == 0 ? "�ʿ��� ������ �� :" + (basketball / 5) : "�ʿ��� ������ �� :" + ((basketball / 5) + 1));

	}

}
