package 최종문제복습;

import java.util.Scanner;

public class 문제32 {

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		//채점하기 출력문 작성 및 입력
		System.out.println("====채점하기====");
		String str = sc.next();
		//String [] split()함수
		String s[] = str.split("");
		//카운트할 변수
		int cnt =1;
		//개수를 저장할 변수
		int result =0;
		//for문
		for(int i=0; i<s.length;i++) {
			//if문으로 ox판단
			if(s[i].equals("o")) {
				result +=cnt;
				cnt++;
			}else {
				cnt=1;//o가아니면 카운트 초기화
			}
		}
		//결과
		System.out.println(result);

	}

}
