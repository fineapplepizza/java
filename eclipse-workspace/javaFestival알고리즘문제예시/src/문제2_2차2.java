import java.util.Scanner;

public class 문제2_2차2 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//행 개수 출력문 작성및 입력받기
		System.out.print("행 개수 : ");
		int star = sc.nextInt();
		//for문을 사용하여 삼각형 만들기
		for(int i=0;i<star;i++) {
			for(int j = star; i<j;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
