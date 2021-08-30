import java.util.Random;
import java.util.Scanner;

public class ex05랜덤실습 {

	public static void main(String[] args) {
		
		//1 랜덤 수 기능 불러오기
		Random rd = new Random();
		//스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		while(true) {
		//2.(0~9)10개의 숫자 생성!
		int num1 = rd.nextInt(10)+1;
		int num2 = rd.nextInt(10)+1;
		
		//3.사용자로부터 답 입력받기
	    
		System.out.print(num1 + "+" + num2+ "=");
		int num3 = sc.nextInt();
		
        //4.게임을 진행할 것인지 확인
		if(num3 == num1+num2) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
			
		}
		//5.Y/N 입력받기
		System.out.print("계속 하시겠습니까 >> ");
		String choice = sc.next();
		//6.Y->새로운 랜덤값 문제
		if(choice.equals("Y")){
			continue;
			
		}
		else if(choice.equals("N")) {
			//7.N->프로그램 종료
			System.out.println("프로그램종료");
			break;
		}
	    }
		
	}

}
