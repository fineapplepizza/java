package ��������;

import java.util.Scanner;

public class �Ǻ���ġ���� {

	public static void main(String[] args) {
		// �Ǻ���ġ ���� -ù��°�� �ι�°���� 1��1
		// ����°������ �տ� �ִ� �� ���� ���� ��
		
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// ���° �ױ��� ����� �Ұ��� ���� �Է¹ޱ�
		System.out.print("�����Է�>> ");
		int num = sc.nextInt();
		//n�� n1�� 1�� ������ ���̱� ������ �����ʱ�ȭ�ϱ�
		int n = 1;
		int n1 = 1;
		int n2 = 0;
		
		
		System.out.print(n + " ");
		System.out.print(n1 + " ");
		
		//1��1�� �����ϴ� ��Ģ�� ������ �Ǻ���ġ���� ����ϱ�
		//������ 1��1�� �ֱ� ������ ������ -2�� ����
		for(int i= 1;i<=num-2;i++) {
			//'��'�� ����ϱ� ���� ����ó��
			n2 = n+n1;
			System.out.print(n2+" ");
			
			//������� ���κ��� �տ� �ִ� ������ ����
			n=n1;
			n1 = n2;
		}

	}

}
