package �˰���������;

import java.util.Scanner;

public class ��������31�� {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//ù ��° ���� �Է� ��¹� �ۼ� �� �Է¹ޱ�
		System.out.println("ù ��° ���� �Է�>> ");
		int num1 = sc.nextInt();
		//�� ��° ���� �Է� ��¹� �ۼ� �� �Է¹ޱ�
		System.out.println("�� ��° ���� �Է�>> ");
		int num2 = sc.nextInt();
		
		int result1 = num1*(num2%10);
		int result2 = num1*((num2/10)%10);
		int result3 = num1*(((num2/10)/10)%10);
	    //��� ���
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(num1*num2);

	}

}
