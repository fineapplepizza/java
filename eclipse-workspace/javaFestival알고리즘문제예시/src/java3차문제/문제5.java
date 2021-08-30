package java3차문제;

import java.util.Random;
import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// 스캐너 생성하기
		Scanner sc = new Scanner(System.in);
		// 랜덤함수 생성하기
		Random rd = new Random();
		// 배열을 생성하기
		int lottoNumber[] = new int[6];

		// for문 돌려서 1~45번의 랜덤숫자를 추출
		for (int i = 0; i < lottoNumber.length; i++) {
			// nextInt(45)이면 해당 범위가 0~44이므로 1을 더해준다.
			lottoNumber[i] = rd.nextInt(45) + 1;
			

			// 앞의 숫자와 뒤의 숫자가 같으면 중복된 숫자를 알려주고 다시 한번돈다.
			for (int j = 0; j < i; j++) {
				if (lottoNumber[i] == lottoNumber[j]) {// 중복된 숫자가 생겼을때
					// 중복건수를 처리하기위해 반복문i번째를 다시 내린다.
					i--;
				}
			}
			System.out.println("행운의 숫자 : " + lottoNumber[i]);

		}

	}

}
