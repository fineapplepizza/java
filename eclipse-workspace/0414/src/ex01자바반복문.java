import java.util.Scanner;

public class ex01자바반복문 {

	public static void main(String[] args) {
		//1.스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		int jjack = 0;
		int hole = 0;
		//while(){
		//2.숫자입력이라는 출력문 작성
		while(true) {
		System.out.print("숫자입력: ");
		//3.숫자를 입력받기
		int num = sc.nextInt();
		//4.-1을 입력했을때 종료 시키기.
		if(num == -1) {
			System.out.println("종료되었습니다.");
			break;
		}
		//5.-1이 아닌 경우 >> 짝수와 홀수를 비교
		//6.짝수와 홀수일때 각각 1씩 증가하는 로직작성
		else if(num % 2 ==0) {
			//짝수를 구하는 조건
			jjack++;
		}
		else {
			//홀수를 구하는 조건
			hole++;
		}
		//7.짝수와 홀수의 개수를 출력
		System.out.println("짝수의 개수 : "+ jjack);
		System.out.println("홀수의 개수 : "+ hole);
		}
		

	}

}
