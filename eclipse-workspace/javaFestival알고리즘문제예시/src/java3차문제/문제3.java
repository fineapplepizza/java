package java3차문제;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		 // 스캐너 생성하기
	      Scanner sc = new Scanner(System.in);
	      // 정수를 입력하는 출력문과 입력받기
	      System.out.print("정수를 입력하시요>> ");
	      int num = sc.nextInt();
	      // 이차원 배열을 생성하기
	      int[][] array = new int[num][num];
	      // 이차원 배열의 값을 저장하는 변수 초기화하기
	      int k = 1;
	      // 이중for문을 이용하여 이차원배열에 숫자를 저장하기
	      for (int i = 0; i < array.length; i++) {
	         if (i % 2 == 0) {// 홀수행일때 숫자 저장
	            for (int j = 0; j < array.length; j++) {
	               array[i][j] = k++;
	            }
	         } else {// 짝수행일때 숫자 저장
	            for (int j = array.length - 1; j >= 0; j--) {
	               array[i][j] = k++;
	            }
	         }
	      }
	      // 이중for문을 이용하여 이차원배열 출력하기
	      for (int i = 0; i < array.length; i++) {
	         for (int j = 0; j < array.length; j++) {
	            System.out.print(array[i][j] + "\t");
	         }
	         System.out.println();
	      }


	}

}
