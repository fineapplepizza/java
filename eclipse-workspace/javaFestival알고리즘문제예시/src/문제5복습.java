import java.util.Scanner;

public class 문제5복습 {

	public static void main(String[] args) {
		//스캐너 출력하기
		Scanner sc = new Scanner(System.in);
		//최대공약수&최소공배수 구하기 출력문 작성
		System.out.println("최대 공약수&최소 공배수 구하기");
	    //최대공약수,최소공배수 변수 초기화 하기	
		int max = 0 , min =0;
		//숫자1입력 출력문 작성 및 입력받기
		System.out.println("숫자1입력>> ");
		int num1 =sc.nextInt();
		//숫자2입력 출력문 작성 및 입력받기
		System.out.println("숫자2입력>> ");
		int num2 =sc.nextInt();
		//for문
		for(int i=1;i<=num1;i++) {
			if(num1%i==0 && num2%i==0) {//if문
				max = i;
			}
		}
		//최소공배수 고하기
		min = num1*num2/max;
		
		//최대공약수 출력문 작성
		System.out.println("최대공약수: "+max);
		//최송공배수 출력문 작성
		System.out.println("최소공배수: "+min);

	}

}
