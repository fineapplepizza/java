package Æä½ºÆ¼¹ú;

import java.util.Scanner;

public class º°Âï±â1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Çà °³¼ö: ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=num-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		

	}

}
