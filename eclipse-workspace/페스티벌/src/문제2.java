package ��������;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// ���� �ð� �Է� ��¹� �ۼ��� �Է�
		System.out.print("���ѽð��� �Է��ϼ���: ");
		int work = sc.nextInt();
		// ���ӱ� ���� �ʱ�ȭ
		double money = 0;
		// if�� 8�ð� �ʰ� �Ǵ�
		if (work > 8) {// 8�ð� �ʰ��Ҷ�
			money = 40000 + (work - 8) * 5000 * 1.5;
		} else {// 8�ð����϶�
			money = work * 5000;
		}
		// ������
		System.out.println("�� �ӱ��� " + (int)money + "�� �Դϴ�.");

	}

}
