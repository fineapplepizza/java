package day02;

import java.util.Scanner;

public class ex11���ǹ��ǽ� {

	public static void main(String[] args) {
		
		// 1. ���� �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���");
		int grade = sc.nextInt();
		String result = "";
		
		// 2. ���� �Ǵ�
		if(90 <= grade && grade <= 100) {
			// A����
			result = "A";
		}
		else if(80<= grade ){
			// B����
			result = "B";
		}
		else if(70<= grade) {
			result = "c";
		}
		else {
			result = "F";
		}
		System.out.println(result+"�����Դϴ�.");

	}

}
