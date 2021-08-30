

import java.util.Scanner;

public class 문제18 {

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		//정수입력 출력 및 입력
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int result = 0;
		while(num>0) {
			result += num%10;
			num=num/10;
		}
		//결과문 출력
		System.out.println("합은 "+result+"입니다.");

	}

}
