package javaFestival�˰���������;

import java.util.Scanner;

public class ����5 {

	public static void main(String[] args) {
		// ��ĳ�� ��� ����
		Scanner sc = new Scanner(System.in);
		// ���� �Է� ��¹� �ۼ� �� �Է� �ޱ�
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
		// if���� Ȱ���Ͽ� �ݿø� �Ǵ��ϱ�
		if (number % 10 >= 5) { // 5�̻� �ݿø�
			number = (number / 10 * 10) + 10;
		} else {// 5�̸� �ݿø�
			number = number / 10 * 10;
		}
		// �ݿø��� ����ϱ�
		System.out.println("�ݿø� �� : " + number);

	}

}
