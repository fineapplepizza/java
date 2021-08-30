import java.util.Scanner;

public class ex11문자형배열 {

	public static void main(String[] args) {
		
		//문자형 타입의 배열 생성
		char[] game = {'수','박'};
		
		//배열의 생성방법
		//1.배열 선언후 (크기) -> 값 지정
		//2.배열의 선언과 동시에 값 지정
		
		
		//숫자를 입력받을 수 있는 기능
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요>>");
		int num = sc.nextInt();
		
		//입력받은 숫자가 짝수,홀수 판단
		//'수','박' 출력!

		for(int i = 0; i<num;i++) {
//		if(i % 2 == 0) {
//			System.out.print(game[0]);
//		} else {
//			System.out.print(game[1]);
//
//			
//		}
			System.out.print(i%2==0?  game[0] : game[1]);
		}

	}

}
