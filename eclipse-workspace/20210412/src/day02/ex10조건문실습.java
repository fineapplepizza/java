package day02;

import java.util.Scanner;

public class ex10���ǹ��ǽ� {

	public static void main(String[] args) {
		
		// 1. �ð��� �Է��� �� �ִ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		
		int result = 0;
		// 2. 8�ð� �ʰ� / ���� �Ǵ�
		if(time <= 8) {
			//8�ð� ���� - ���ѽð�*�ñ�
		
			result = time*5000;
		}else {
			
		result =40000 + (int)((time-8)*5000*1.5);

	}
     System.out.println("�� �ӱ��� " + result + "�Դϴ�.");

	}
}

