package day02;

import java.util.Scanner;

public class ex15while�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//		int num2 = 0;
//		int minus = 0;
		
		while(true) {
			System.out.print("A �Է� >> ");
			int num1 = sc.nextInt();
			System.out.print("B �Է� >> ");
			int num2 = sc.nextInt();
			
			if(num1 != 0 && num2 != 0) {
				System.out.println("��� >> "+ (num1-num2));
			}
			else if(num1 ==0 && num2 ==0) {
				break;
				
			}
//			minus = num1 - num2;
//			System.out.println("��� >>" + minus);
//			if (num1 == 0 && num2 == 0) {
//				System.out.println("���α׷� ����");
//				break;
//			}
		}

	}

}
