package 최종문제복습;

import java.util.Scanner;

public class 문제30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num= sc.nextInt();
	
		System.out.println("대시('-')의 총 합 >> "+dash(num));

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
