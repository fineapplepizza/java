package �佺Ƽ��;

import java.util.Scanner;

public class ���3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		int cnt =1;
		for(int i=0;i<arr.length;i++) {
			System.out.print(cnt+"�� ° ���� �Է�>>");
			arr[i] = sc.nextInt();
			cnt++;
		}
		System.out.print("3�� ��� :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
