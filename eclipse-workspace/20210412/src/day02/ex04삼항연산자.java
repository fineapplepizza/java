package day02;

import java.util.Scanner;

public class ex04���׿����� {

	public static void main(String[] args) {
		//1. ��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		//2. ù ��° ���� �Է� ����ϱ�
		System.out.print("ù ��° ���� �Է�: ");
		//3. ����ڿ��� ù ��° ���� �Է� �ޱ�
		int num1 = sc.nextInt();
		//4. �� ��° ���� �Է� ����ϱ�
		System.out.print("�� ��° ���� �Է�: ");
		//5. ����ڿ��� �� ��° ���� �Է� �ޱ�
		int num2 = sc.nextInt();
		//6. �� ���� �� ����ϱ�
       System.out.println( (num1>num2)? "�� ���� �� :" + (num1 - num2) : "�� ���� �� :" + (num2 - num1));
	}

}
