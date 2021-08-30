
import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 현재몸무게 출력문 생성 및 입력
		System.out.println("현재몸무게: ");
		int now = sc.nextInt();
		// 목표몸무게 출력문 생성 및 입력
		System.out.println("목표몸무게: ");
		int goal = sc.nextInt();
		// 주차카운트 해줄 변수 초기화
		int cnt = 1;
		while (now > goal) {
			// 몇주차 감량 몸무게 출력문 생성 및 입력
			System.out.print(cnt + "주차 감량 몸무게: ");
			int num = sc.nextInt();
			now -= num;
			cnt++;
		}
		// 결과 출력문 생성 및 입력
		System.out.println(now + "kg 달성!! 축하합니다!");

	}

}
