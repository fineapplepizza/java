package 페스티벌;

import java.util.Scanner;

public class 팩토리얼 {

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		//입력
	     System.out.print("입력: ");
	     int num = sc.nextInt();
	     int result =1;
		//for
	     for(int i=1 ;i<=num;i++) {
	    	 result *=i;
	     }
		//출력
	     System.out.println("출력: "+result);

	}

}
