package 최종문제;

import java.util.Scanner;

public class 문제32 {//

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		//채점하기
		System.out.println("==== 채점하기 ====");
		String str = sc.next();
		//split
		String[]s= str.split("");
		//카운트
		int cnt=0;
	
		//for
		for(int i=0; i<s.length;i++) {
			if(s[i].equals("o")) {
			   cnt++;
		}
		//if.e
		//결과
		

	}
		System.out.println(cnt);

	}
}
