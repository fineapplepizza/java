package Æä½ºÆ¼¹ú;

import java.util.Scanner;

public class °Å½º¸§µ· {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÃÑ±Ý¾× ÀÔ·Â: ");
		int money = sc.nextInt();
		System.out.println("ÀÜµ·: "+money+"¿ø");
		int arr[] = {10000,5000,1000,500,100};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"¿ø"+":"+(money/arr[i])+"°³");
			money %=arr[i];
		}

	}

}
