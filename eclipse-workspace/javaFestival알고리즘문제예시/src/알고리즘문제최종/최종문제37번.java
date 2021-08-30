package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제37번 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//입력 출력문 작성및 입력 받기
		System.out.print("입력 :");
		int num = sc.nextInt();
		int result = 1;//곱한 결과를 저장하는 변수 초기화
		//for문을 이용하여 팩토리얼 계산하기
		for(int i=num;i>0;i--) {
			result *= i;//곱한 결과를 누적시키기
		}
		//결과 출력
		System.out.println("출력 : "+result);

	}

}
