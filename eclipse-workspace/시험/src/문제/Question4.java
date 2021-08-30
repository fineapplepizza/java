package 문제;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		// while문 작성하기
		while (true) {
			// id출력문 작성하기
			System.out.print("id : ");
			// id 입력하기
			String id = sc.next();
			// pw출력문 작성하기
			System.out.print("pw : ");
			// pw 입력하기
			String pw = sc.next();

			// if문을 활용하여 로그인 일치 판단하기
			// 로그인 성공시
			if (id.equals("dldmsql") && pw.equals("1214")) {
				System.out.println(id + "님 환영합니다!");
				break;
			}
			// 로그인 실패시
			else {
				System.out.println("다시 확인하세요!");

			}
		}

	}

}
