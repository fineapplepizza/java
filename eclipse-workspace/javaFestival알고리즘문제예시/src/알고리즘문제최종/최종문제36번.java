package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제36번 {

	public static void main(String[] args) {
		//스캐너 생성하기
		Scanner sc = new Scanner(System.in);
		//알파벳을 저장하는 배열생성
		int alpa[]=new int[26];
		//알파벳 빈도수 구하는 출력문작성
		System.out.println("=== 알파벳 빈도수 구하기 ===");
		//입력 출력문 작성 및 입력 받기
		System.out.println("입력>>");
		String str = sc.next();
		//대문자를 소문자로 변경하기
		str = str.toLowerCase();
		//공백을 없애기
		str = str.replace(" ", "");
		for(int i=0; i<str.length();i++) {
			//charAt-str을char타입으로 변환
			char ch = str.charAt(i);
			alpa[ch-'a']++;
		}
		for(int i=0;i<26;i++) {
			//(97+i)아스키코드를 char로 변환해주기
			System.out.println((char)(97+i)+":"+alpa[i]);
		}
				
		
		

	}

}
