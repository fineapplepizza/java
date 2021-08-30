package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제18번 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//8자리 정수 입력 출력문 작성및 입력받기
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		//합 변수 초기화하기
		int hap = 0;
		//while문 활용
		while(num>0) {
			hap += num%10; //나머지를 hap에 누적시키기
			num = num/10; //나머지를 제외한 num 값을 while로 반복하기
			
		}
		//결과문 출력
		System.out.println("합은 "+hap+"입니다.");
		
		

	}

}
