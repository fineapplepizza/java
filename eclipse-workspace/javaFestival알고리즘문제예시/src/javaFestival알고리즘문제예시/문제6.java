package javaFestival�˰���������;

import java.util.Scanner;

public class ����6 {

	public static void main(String[] args) {
		//��ĳ�� ��� �����ϱ�
		Scanner sc = new Scanner(System.in);
		//�ִ� �����&�ּ� ����� ���ϱ� ��¹� �ۼ�
		System.out.println("�ִ� �����&�ּ� ����� ���ϱ�");
		//����1�Է� ��¹� �ۼ� �� �Է� �ޱ�
		System.out.println("����1�Է�>> ");
		int number1 = sc.nextInt();
		//����2�Է� ��¹� �ۼ� �� �Է� �ޱ�
		System.out.println("����2�Է�>> ");
		int number2 = sc.nextInt();
		
		//�ִ� ����� �ּ� ����� ���� �ʱ�ȭ
		int max = 0;
		int min = 0;
		//for���� ����Ͽ� ����1,����2�� �ִ����� ���ϱ�
		for(int i = 1; i<=number1;i++) {
			if(number1%i==0 && number2%i==0) {
				max = i;
			}
				
		}
		//�ִ����� ��¹� �ۼ�
		System.out.println("�ִ�����: "+max);
		//����1,����2�� �ּҰ���� ���ϱ�
		min = number1*number2/max;
		//�ּҰ���� ��¹� �ۼ�
		System.out.println("�ּҰ����: "+min);

	}

}
