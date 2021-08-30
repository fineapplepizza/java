import java.util.Scanner;

public class 문제6_3차 {

	public static void main(String[] args) {
		//스캐너생성
		Scanner sc = new Scanner(System.in);
		//숫자입력출력문작성 및 입력받기
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		//2진수로 변환해서 출력하기
		String binary = Integer.toBinaryString(num);
		System.out.println(binary);

	}

}
