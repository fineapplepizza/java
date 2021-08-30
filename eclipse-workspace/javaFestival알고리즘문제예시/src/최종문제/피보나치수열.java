package 최종문제;

import java.util.Scanner;

public class 피보나치수열 {

	public static void main(String[] args) {
		// 피보나치 수열 -첫번째와 두번째값은 1과1
		// 세번째값부터 앞에 있는 두 값을 더한 수
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 몇번째 항까지 출력을 할건지 정수 입력받기
		System.out.print("정수입력>> ");
		int num = sc.nextInt();
		//n과 n1은 1로 고정된 값이기 때문에 변수초기화하기
		int n = 1;
		int n1 = 1;
		int n2 = 0;
		
		
		System.out.print(n + " ");
		System.out.print(n1 + " ");
		
		//1과1로 시작하는 규칙을 제외한 피보나치수열 출력하기
		//고정된 1과1이 있기 때문에 정수에 -2를 해줌
		for(int i= 1;i<=num-2;i++) {
			//'나'를 계산하기 위한 연산처리
			n2 = n+n1;
			System.out.print(n2+" ");
			
			//출력이후 나로부터 앞에 있는 수들을 수정
			n=n1;
			n1 = n2;
		}

	}

}
