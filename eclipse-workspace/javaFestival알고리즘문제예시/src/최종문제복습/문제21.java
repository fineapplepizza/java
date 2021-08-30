package 최종문제복습;

import java.util.Random;
import java.util.Scanner;

public class 문제21 {

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		//랜덤생성
		Random rd = new Random();
		//로또숫자를 저장할 배열생성
		int arr[]=new int [6];
		//for문
		for(int i=0;i<arr.length;i++) {
			//배열저장
			arr[i]=rd.nextInt(46)+1;
			//중복제거
			for(int j=0 ;j<i;j++) {
				if(arr[i] == arr[j]) {
				i--;
				}
			}
		}
		//출력
		for(int i=0; i<arr.length;i++) {
			System.out.println("행운의숫자 : "+arr[i]);
			
		}

	}

}
