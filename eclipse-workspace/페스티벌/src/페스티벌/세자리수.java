package �佺Ƽ��;

import java.util.Scanner;

public class ���ڸ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�>>");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է�>>");
		int num2 = sc.nextInt();
		int result1=0;
		int result2=0;
		int result3=0;
		
		result1 = num1*(num2%10);
		result2 = num1*((num2/10)%10);
		result3 = num1*(((num2/10)/10)%10);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1+(result2*10)+(result3*100));

	}

}
