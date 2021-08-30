package 문제;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		//스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		//나이 입력 받는 출력문 작성하기
		System.out.print("나이 >> ");
		//나이 입력 받기
		int age = sc.nextInt();
		// 사람 변수 만들기
		String people = "";
		//다중 if문을 사용하여 초년,중년,노년 판단하기
		//초년 판단하기
		if(0<=age && age <= 40) {
			people = "초년";
		}
		//중년 판단하기
		else if(age <= 60) {
			people = "중년";
		}
		//노년 판단하기
		else if(61 <= age) {
			people = "노년";
		}
		
		//결과 출력하기
		System.out.println(people + "입니다.");

	}

}
