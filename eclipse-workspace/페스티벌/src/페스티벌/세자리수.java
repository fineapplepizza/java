package 페스티벌;

import java.util.Scanner;

public class 세자리수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력>>");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력>>");
		int num2 = sc.nextInt();
		int result1=0;
		int result2=0;
		int result3=0;
		
		result1 = num1*(num2%10);
		result2 = num1*((num2/10)%10);
		result3 = num1*(((num2/10)/10)%10);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1+(result2*10)+(result3*100));

	}

}
