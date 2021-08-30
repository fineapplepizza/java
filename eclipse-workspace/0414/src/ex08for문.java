import java.util.Scanner;

public class ex08for문 {

	public static void main(String[] args) {
		
		//스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
	
		// 정수를 입력받아 1~입력받은 수 까지 
		// 출력! ex)7 -> 1~7까지
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// for문 사용하여 출력하기
		for(int i = 1;i <= num; i++) {
			System.out.print(i + " ");
		}
	
		
		
		

	}

}
