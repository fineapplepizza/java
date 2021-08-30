package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제8 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//whlie문 작성
		while(true){
		//A입력 출력문 작성및 입력받기
		System.out.print("A 입력>>");
		int a = sc.nextInt();
		//B입력 출력문 작성및 입력받기
		System.out.print("B 입력>>");
		int b = sc.nextInt();
		//if문으로 A와B가 모두 0일때
		if(a==0 && b==0) {
			//프로그램 종료 출력하기
			System.out.println("프로그램종료");
			break;
		}else {
		//A-B연산 처리하기
		int result = a-b;
		//결과출력문 작성
		System.out.println("결과>> "+result);
		}
		}

	}

}
