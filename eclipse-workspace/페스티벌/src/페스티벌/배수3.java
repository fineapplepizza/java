package 페스티벌;

import java.util.Scanner;

public class 배수3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		int cnt =1;
		for(int i=0;i<arr.length;i++) {
			System.out.print(cnt+"번 째 정수 입력>>");
			arr[i] = sc.nextInt();
			cnt++;
		}
		System.out.print("3의 배수 :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
