package �˰���������;

import java.util.Scanner;

public class ��������5 {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//�� ���� ��¹� �ۼ��� �Է� �ޱ�
		System.out.println("�� ���� : ");
		int num = sc.nextInt();
		//����for���� �̿��Ͽ� �ﰢ�� �����
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
