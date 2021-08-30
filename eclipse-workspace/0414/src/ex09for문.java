import java.util.Scanner;

public class ex09for문 {

	public static void main(String[] args) {
		
		//스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 단 출력 과 입력하기
		System.out.print("단 입력 : ");
        int  dan = sc.nextInt();
		int result = 0;
		//for문을 사용해서 구구단 출력하기
				
			for(int j = 1; j<=9; j++) {
				result = dan*j;
				System.out.println(dan + "*" + j + "=" + (dan*j));
			}
			
		}

	}


