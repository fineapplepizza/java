import java.util.Scanner;

public class ex09배열 {

	public static void main(String[] args) {
		
		//1. 배열 생성
		int [] num = new int [10] ;
		
		//2. 숫자 입력 받아 저장
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < num.length ; i++) {
			
			System.out.print((i+1) + "번 째 정수 입력>> ");
			num[i] = sc.nextInt();
		}
		
		//3. 3의 배수라면 출력!
         System.out.print("3의 배수 점수 입력: ");
			for(int i = 0 ; i<num.length ; i++) {
				if(num[i] % 3 == 0) {
					System.out.print(num[i] + " ");
				}
			}
		

	}

}
