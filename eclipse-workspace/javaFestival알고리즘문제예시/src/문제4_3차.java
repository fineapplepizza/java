import java.util.Scanner;

public class 문제4_3차 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//n입력 출력문 작성및 입력받기
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		//수열의 합 변수 초기화하기
		int hap =1;
		//for문을 사용하여 n번째 항까지 출력하시오
		for(int i=1;i<=n;i++) {
			System.out.print(hap+" ");
			hap+=i;
		}

	}

}
