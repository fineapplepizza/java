package day02;

import java.util.Scanner;

public class ex13switch�ǽ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�� ����ϱ�
		System.out.print("�� �Է� : ");
		//���� �Է��ϱ�
		int month = sc.nextInt();
		String season = "";
		//���� �˷��ִ� ���α׷� �����
		switch(month/3) {
		case 4:
		case 0:
			season = "�ܿ�";
			break;
		case 1:
			season = "��";
			break;
		case 2:
			season = "����";
			break;
		case 3:
			season = "����";
			break;
		
		}
		
		System.out.println(month + "����" + season + "�Դϴ�!");

	}

}
