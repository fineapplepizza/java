package java1����������;

import java.util.Scanner;

public class ����4���� {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//�ѱݾ� �Է� ��¹� �ۼ� �� �Է¹ޱ�
		System.out.print("�ѱݾ� �Է� : ");
		int money = sc.nextInt();
		System.out.println();
		//�ܵ� ��¹� �ۼ�
		System.out.println("�ܵ� : "+money+"��");
		//10000�� ����
		int m10000= money/10000;
		System.out.println("10000��: "+m10000);
		//5000�� ����
		int m5000= (money%10000)/5000;
		System.out.println("5000��: "+m5000);
		//1000�� ����
		int m1000= ((money%10000)%5000)/1000;
		System.out.println("1000��: "+m1000);
		//500�� ����
		int m500 = (((money%10000)%5000)%1000)/500;
		System.out.println("500��: "+m500);
		//100�� ����
		int m100 = ((((money%10000)%5000)%1000)%500)/100;
		System.out.println("100��: "+m100);
		

	}

}
