package java1����������;

import java.util.Scanner;

public class ����5 {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// ���� �Է� ��¹� �ۼ��� �Է¹ޱ�
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		//if���� ����Ͽ� �ݿø� �Ǵ�
		if(num%10 >= 5) {//5�̻��϶�
			num = (num/10)*10+10;
		}else if(num%10 < 5) {//5�̸��϶�
			num = (num/10)*10;
		}
		//�ݿø��� ��¹� �ۼ�
		System.out.println("�ݿø� �� : "+num);
		

	}

}
