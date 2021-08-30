import java.util.Scanner;

public class ex02다이어트 {

	public static void main(String[] args) {
		
		//1.스캐너 기능 불러오기(입력을 받기위해서)
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		//2.현재 몸무게 출력 후 입력받기
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		//3.목표몸무게 출력 후 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		//4.몇주차 감량 몸무게 출력 후 입력받기
		do {
			//한번은 무조건 실행되야 하는 부분
			//반복작업을 실행할 부분
			System.out.print(cnt+"주차 감량 몸무게 :");
			int minus = sc.nextInt();
			now -= minus;
			cnt++;
		}while(now>goal);
		
		System.out.println(now + " kg 달성 축하합니다.");
		//5.목표치를 달성했을때 축하합니다 메세지 제공하기.

	}

}
