package day02;

import java.util.Scanner;

public class ex12switch�ǽ� {

	public static void main(String[] args) {
		
		// switch�� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int grade = sc.nextInt();
		String result = "";
		// switch���� ���� �� ���� ������ ǥ���� �Ǿ�� �Ѵ�.
		// ������ ����� �ִ� ����� ������ ���� �ʴ�. -> break ��� �ʿ�!
		// 90~99 =9
		switch(grade/10) {
		case 10:
		case 9:
			result = "A";
			break;
		// 80 ~ 90
		case 8:
			result = "B";
			break;
		// 70 ~ 80
		case 7:
			result = "C";
			break;
		// �� ��������� �ش����� �ʴ� �༮��
		default:
			result = "D";
			break;
		
		
		}
		System.out.println(result+" ���� �Դϴ�.");

	}

}
