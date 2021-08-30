package 알고리즘문제최종;

import java.util.Scanner;

public class 최종문제32번 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//채점하기 출력문작성
		System.out.println("====채점하기====");
		String inputString = sc.next();//채점한 결과값 문자열에저장
		//String[]split()함수를 이용해서 배열에 저장
		String [] arr = inputString.split("");
		int cnt =1; //카운트 변수 초기화\k
		int result =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("o")) {//if문을사용하여 o,x를 판단
				result += cnt;
				cnt++;
				
				//o면 카운트 1씩 증가함
			}else {
				cnt =1;
			}
		}System.out.println(result);
		
		

	}
	

}
