package day02;

import java.util.Scanner;

public class ex11조건문실습 {

	public static void main(String[] args) {
		
		// 1. 점수 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요");
		int grade = sc.nextInt();
		String result = "";
		
		// 2. 학점 판단
		if(90 <= grade && grade <= 100) {
			// A학점
			result = "A";
		}
		else if(80<= grade ){
			// B학점
			result = "B";
		}
		else if(70<= grade) {
			result = "c";
		}
		else {
			result = "F";
		}
		System.out.println(result+"학점입니다.");

	}

}
