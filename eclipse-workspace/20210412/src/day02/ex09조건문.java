package day02;

import java.util.Scanner;

public class ex09���ǹ� {
	public static void main(String[] args) {
		
	
	// 1.���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		//2.�ݿø� Ȯ���ϱ� -> ���� �ڸ� Ȯ��
		int n = input%10;
		
		int result = 0;
		
		// 3. �ݿø��� ���� / ���� ������ �Ǵ�
		if(n >= 5) {
			// �ݿø� ����ó�� ����
			result = (input/10 + 1)*10;
		
		}else {
			result = input/10*10;
			
		}
		
	     System.out.println("�ݿø� �� : " + result);

		}

}
