package day02;

import java.util.Scanner;

public class ex03���׿����� {

	public static void main(String[] args) {
		//1. ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		//2. ������ �Է��ϼ����� ��¹� �ۼ�
		System.out.print("������ �Է��ϼ��� >>");
		//3. ����ڿ��� ���� �Է¹ޱ�
		int num = sc.nextInt();
		
//		if(num%2 == 0) { System.out.println(num+"�� ¦���Դϴ�.");}
//		else {
//			System.out.println(num+"�� Ȧ���Դϴ�.");
//			
//		}
        System.out.println((num%2==0) ? num+"�� ¦���Դϴ�." : num+"�� Ȧ���Դϴ�." );
	}

}
