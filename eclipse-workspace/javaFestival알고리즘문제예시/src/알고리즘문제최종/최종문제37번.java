package �˰���������;

import java.util.Scanner;

public class ��������37�� {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		
		//�Է� ��¹� �ۼ��� �Է� �ޱ�
		System.out.print("�Է� :");
		int num = sc.nextInt();
		int result = 1;//���� ����� �����ϴ� ���� �ʱ�ȭ
		//for���� �̿��Ͽ� ���丮�� ����ϱ�
		for(int i=num;i>0;i--) {
			result *= i;//���� ����� ������Ű��
		}
		//��� ���
		System.out.println("��� : "+result);

	}

}
