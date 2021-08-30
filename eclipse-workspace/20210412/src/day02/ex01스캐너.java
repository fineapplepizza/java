package day02;

import java.util.Scanner;

public class ex01스캐너 {

	public static void main(String[] args) {
		//1.스캐너 기능 불러오기 >> 입력을 해야 하니까
		Scanner sc = new Scanner(System.in);
		//2.Java점수 입력이라는 출력문을 작성
		System.out.print("Java점수 입력: ");
		//3.사용자에게 점수를 입력받기
		int java = sc.nextInt();
		//4.Web점수 입력이라는 출력문을 작성
		System.out.print("Web점수 입력: ");
		//5.사용자에게 점수를 입력받기
		int Web = sc.nextInt();
		//6.Android 점수 입력이라는 출력문 작성
		System.out.print("Android점수 입력: ");
		//7.사용자에게 점수를 입력받기
		int Android = sc.nextInt();
		//8.합계 출력하기
		int total = (java + Web + Android);
		System.out.println("합계 : " + total);
		//9. 평균 출력하기
		System.out.println("평균 : " + total/3);

	}

}
