package 최종문제복습;

import java.util.Scanner;

public class 문제36번 {

	public static void main(String[] args) {
		//알파벳을 저장하는 배열 생성
		int alpa[]=new int[26];
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//알파벳빈도수구하기 출력
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		//입력 출력및 입력받기
		System.out.print("입력>>");
		String str = sc.next();
		
		//대문자를 소문자로 변환하는 tolowercase()함수
	     str = str.toLowerCase();
		//공백을 지워줄수있는 replace()함수
	     str = str.replace(" ", "");
		//for
	    for(int i=0;i<str.length();i++) {
	    	//str을 char로 변환해주는 charAt()함수
	    	char ch = str.charAt(i);
			//알파벳의 값을 카운트
	    	alpa[ch-'a']++;
	    }
	  //결과 (아스키코드) 알파벳배열
	    for(int i=0; i<26;i++) {
	    System.out.println((char)(97+i)+":"+alpa[i]);
	    }

	}

}
