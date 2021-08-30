package 페스티벌;

import java.util.Scanner;

public class 진수변환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>>");
		int num = sc.nextInt();
        String str = Integer.toBinaryString(num);
        System.out.println(str);

	}

}
