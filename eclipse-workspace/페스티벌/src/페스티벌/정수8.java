package 페스티벌;

import java.util.Scanner;

public class 정수8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		int result =0;
		while(num>0) {
			result += num%10;
			num =num/10;
		}
		System.out.println("합은 "+result+"입니다.");
		
	}

}
