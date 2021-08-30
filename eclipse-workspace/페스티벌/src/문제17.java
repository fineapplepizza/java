

import java.util.Scanner;

public class 문제17 {

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		//n 입력 출력및 입력
		System.out.print("n 입력: ");
		int n = sc.nextInt();
		//결과 값 변수
		int sum =1;
		for(int i=1; i<=n;i++) {
             System.out.print(sum+" ");
             sum +=i;
		}

	}

}
