package �佺Ƽ��;

import java.util.Scanner;

public class �Ž����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ѱݾ� �Է�: ");
		int money = sc.nextInt();
		System.out.println("�ܵ�: "+money+"��");
		int arr[] = {10000,5000,1000,500,100};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"��"+":"+(money/arr[i])+"��");
			money %=arr[i];
		}

	}

}
