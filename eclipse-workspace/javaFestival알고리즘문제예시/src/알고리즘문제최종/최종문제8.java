package �˰���������;

import java.util.Scanner;

public class ��������8 {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//whlie�� �ۼ�
		while(true){
		//A�Է� ��¹� �ۼ��� �Է¹ޱ�
		System.out.print("A �Է�>>");
		int a = sc.nextInt();
		//B�Է� ��¹� �ۼ��� �Է¹ޱ�
		System.out.print("B �Է�>>");
		int b = sc.nextInt();
		//if������ A��B�� ��� 0�϶�
		if(a==0 && b==0) {
			//���α׷� ���� ����ϱ�
			System.out.println("���α׷�����");
			break;
		}else {
		//A-B���� ó���ϱ�
		int result = a-b;
		//�����¹� �ۼ�
		System.out.println("���>> "+result);
		}
		}

	}

}
