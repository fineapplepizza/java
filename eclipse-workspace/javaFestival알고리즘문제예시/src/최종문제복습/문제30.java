package ������������;

import java.util.Scanner;

public class ����30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		int num= sc.nextInt();
	
		System.out.println("���('-')�� �� �� >> "+dash(num));

	}
	public static int dash(int num) {
		int arr[]= {6,2,5,5,4,5,6,3,7,6};
		int number =0;
		int result =0;
		while(num>0) {
			number = num%10;
			result += arr[number];
			num/=10;
		}
		return result;
	}

}
