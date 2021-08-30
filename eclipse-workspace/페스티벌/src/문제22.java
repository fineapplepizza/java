

import java.util.Scanner;

public class 문제22 {

	public static void main(String[] args) {
		//스캐너생성
		Scanner sc = new Scanner(System.in);
		//배열 생성
		int arr[] = new int[5];
		//for문 별의수
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"번째 별의 수 : ");
			arr[i]=sc.nextInt();
		}
		//이중for문 출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+": ");
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
