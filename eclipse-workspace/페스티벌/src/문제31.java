package ��������;

import java.util.Scanner;

public class ����31 {

	public static void main(String[] args) {
		//��ĳ��
		Scanner sc = new Scanner(System.in);
		//ù ���� ����
		System.out.println("ù ��° ���� �Է�>> ");
		int num1 = sc.nextInt();
		//�� ��° ����
		System.out.println("�� ��° ���� �Է�>> ");
		int num2 = sc.nextInt();
        
		int result1=0;
		int result2=0;
		int result3=0;
		
		result1 = num1*(num2%10);
		result2 = num1*((num2/10)%10)*10;
		result3 = num1*(((num2/10)/10)%10)*100;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1+result2+result3);
		
		
	}

}
