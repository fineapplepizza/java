package java1����������;

import java.util.Scanner;

public class ����2���� {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//���ӱ� ���� �ʱ�ȭ
		double money = 0;
		//���ҽð��� �Է��ϼ��� ��¹� �ۼ��� �Է¹ޱ�
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int work = sc.nextInt();
		//if���� Ȱ���Ͽ� 8�ð� �ʰ��ߴ��� �Ǵ�
		if(work>8) {//8�ð� �ʰ�������
			money = 40000+(work-8)*5000*1.5;
		}else {//8�ð� �ȿ� ��������
			money = work*5000;
		}
		//�� �ӱ� ��¹� �ۼ�
		System.out.println("�� �Ա��� "+(int)money+"�� �Դϴ�.");

	}

}
