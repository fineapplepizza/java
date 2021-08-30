package java1차문제복습;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 숫자 입력 출력문 작성및 입력받기
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		//if문을 사용하여 반올림 판단
		if(num%10 >= 5) {//5이상일때
			num = (num/10)*10+10;
		}else if(num%10 < 5) {//5미만일때
			num = (num/10)*10;
		}
		//반올림수 출력문 작성
		System.out.println("반올림 수 : "+num);
		

	}

}
