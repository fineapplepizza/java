

import java.util.Scanner;

public class ����18 {

	public static void main(String[] args) {
		//��ĳ��
		Scanner sc = new Scanner(System.in);
		//�����Է� ��� �� �Է�
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		int result = 0;
		while(num>0) {
			result += num%10;
			num=num/10;
		}
		//����� ���
		System.out.println("���� "+result+"�Դϴ�.");

	}

}
