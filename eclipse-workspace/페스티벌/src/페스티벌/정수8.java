package �佺Ƽ��;

import java.util.Scanner;

public class ����8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num = sc.nextInt();
		int result =0;
		while(num>0) {
			result += num%10;
			num =num/10;
		}
		System.out.println("���� "+result+"�Դϴ�.");
		
	}

}
