package day02;

import java.util.Scanner;

public class ex12switch실습 {

	public static void main(String[] args) {
		
		// switch문 사용하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int grade = sc.nextInt();
		String result = "";
		// switch문의 식은 꼭 실제 값으로 표현이 되어야 한다.
		// 스스로 멈출수 있는 기능을 가지고 있지 않다. -> break 사용 필요!
		// 90~99 =9
		switch(grade/10) {
		case 10:
		case 9:
			result = "A";
			break;
		// 80 ~ 90
		case 8:
			result = "B";
			break;
		// 70 ~ 80
		case 7:
			result = "C";
			break;
		// 그 어느곳에도 해당하지 않는 녀석들
		default:
			result = "D";
			break;
		
		
		}
		System.out.println(result+" 학점 입니다.");

	}

}
