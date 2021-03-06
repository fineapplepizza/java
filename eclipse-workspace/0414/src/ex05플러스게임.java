import java.util.Random;
import java.util.Scanner;

public class ex05플러스게임 {

	public static void main(String[] args) {

		// 1. 플러스 게임을 위한 랜덤수 만들기
		// + 입력기능을 위한 Scanner 생성
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// 첫 게임을 위한 랜덤수 지정
		// 틀리면 같은 문제 풀기
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;


		while (true) {
			// 문제를 틀렸을 경우 다시 풀때 틀린문제부터 출제하기!
			
			// 2. 만들어진 랜덤수 화면에 출력
			System.out.print(num1 + "+" + num2 + "=");
			int result = sc.nextInt();

			// 3. 입력한 값이 정답인지 판단(조건)하기
			if ((num1 + num2) == result) {
				System.out.println("Success");
				// 정답시 새로운 랜덤수 뽑기
				num1 = rd.nextInt(10) + 1;
			    num2 = rd.nextInt(10) + 1;
				
			} else {
				System.out.println("Fail");
			}

			// 4. 게임을 계속 진행하는지 판단(조건)하기
			System.out.print("계속 하시겠습니까? (Y/N) >> ");
			String ans = sc.next();

			if (ans.equals("N")) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
// 전체 불록 - > ctrl + a
// 전체정렬 하기 -> ctrl + shift + f
}
