package day02;

import java.util.Scanner;

public class ex02��ĳ�� {

	public static void main(String[] args) {
		//1. ��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		//2. �� �Է��̶�� ��¹� �ۼ�
		System.out.print("�� �Է�: ");
		//3. �������� �Է��ϱ�
		int totalSecond = sc.nextInt();
		//4. ��� ��� �������� ������ֱ�
	    int hour = totalSecond/3600;
		int minute = (totalSecond%3600)/60;
		int second = (totalSecond%3600)%60;
		System.out.println(hour+"��"+minute+"��"+second+"��");

	}

}
