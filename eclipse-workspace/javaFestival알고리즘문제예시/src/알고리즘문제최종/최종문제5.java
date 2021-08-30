package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제5 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//행 개수 출력문 작성및 입력 받기
		System.out.println("행 개수 : ");
		int num = sc.nextInt();
		//이중for문을 이용하여 삼각형 만들기
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
