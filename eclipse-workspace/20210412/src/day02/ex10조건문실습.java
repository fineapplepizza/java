package day02;

import java.util.Scanner;

public class ex10조건문실습 {

	public static void main(String[] args) {
		
		// 1. 시간을 입력할 수 있는 기능
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int result = 0;
		// 2. 8시간 초과 / 이하 판단
		if(time <= 8) {
			//8시간 이하 - 일한시간*시급
		
			result = time*5000;
		}else {
			
		result =40000 + (int)((time-8)*5000*1.5);

	}
     System.out.println("총 임금은 " + result + "입니다.");

	}
}

