package �˰���������;

import java.util.Scanner;

public class ��������18�� {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//8�ڸ� ���� �Է� ��¹� �ۼ��� �Է¹ޱ�
		System.out.println("���� �Է�: ");
		int num = sc.nextInt();
		//�� ���� �ʱ�ȭ�ϱ�
		int hap = 0;
		//while�� Ȱ��
		while(num>0) {
			hap += num%10; //�������� hap�� ������Ű��
			num = num/10; //�������� ������ num ���� while�� �ݺ��ϱ�
			
		}
		//����� ���
		System.out.println("���� "+hap+"�Դϴ�.");
		
		

	}

}
