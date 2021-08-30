package 최종문제복습;

import java.util.Scanner;

public class 문제36_1 {

	public static void main(String[] args) {
	 //스캐너생성
	 Scanner sc = new Scanner(System.in);
     //알파벳 개수를 저장할 배열 생성
	 int alpa[]=new int[26];
	 //알파벳 빈도수 구하기
	 System.out.println("==== 알파벳 빈도수 구하기");
	 //입력
	 System.out.println("입력>>");
	 String str = sc.next();
	 //tolowercase
	 str = str.toLowerCase();
	 //replace
	 str = str.replace(" ","");
	 //for문
	 for(int i=0;i<str.length();i++) {
		//charat로 str을 char로 변환
		 int ch = str.charAt(i);
		 //알파벳 개수 카운트
		 alpa[ch-'a']++;
	 }
	 //출력
	 for(int i=0;i<26;i++) {
	 System.out.println((char)(97+i)+":"+alpa[i]);
	 }
	}

}
