package day02;

import java.util.Scanner;

public class ex07���ǹ� {

	public static void main(String[] args) {
		//1. ��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		//2. ���� �Է� �ޱ�
		int num = sc.nextInt();
		//3. ���ǹ�Ȱ���ؼ� ����ϱ�
		if (num % 3 ==0 && num % 5 ==0) {
			System.out.println("3�� 5�� ����Դϴ�.");
		}
       
	}

}
