package day02;

import java.util.Scanner;

public class ex14while�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = 0 ;
		
		// boolean -> true/false �ҹ��ڷ� �����ؾ��Ѵ�.
		while (num<10){
			System.out.print("���� �Է� : ");
			 num = sc.nextInt();
		}
		System.out.println("����Ǿ����ϴ�.");

	}

}
