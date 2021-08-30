import java.util.Random;
import java.util.Scanner;

public class ex04랜덤수 {

	public static void main(String[] args) {
		
		// 랜덤수를 불러오기 위한 기능
		Random rd = new Random();
		
		// rd.nextInt(10)
		// 0~9 (10개의) 숫자가 생성!
		int num = rd.nextInt(10)+1;
		int num2 = rd.nextInt(10)+1;
		
		// 1~10 사이의 랜덤수 추출!
		System.out.println("첫번째 랜덤수 : " + num);
		System.out.println("두번째 랜덤수 : " + num2);
		
		

	}

}
