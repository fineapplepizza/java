package day01;

public class ex01변수 {//파일명 

	public static void main(String[] args) {
		int age = 10;
		String name = "가나다";
		char name2 = '가';
		//변수 생성하기
		
		//숫자를 문자로 형변환
		int age2 = 10;
		String age3 = String.valueOf(age2);
		
		//문자를 숫자로 형변환
		String name3 = "50";
		int name4 = Integer.parseInt(name3);
		
		//int형 데이터 float형 데이터 형변환 정수 > 실수
		int number = 3;
		float number2 = 3.0f;
		float number3 = (float)3.5;
		int number4 = (int)number2;
	}

}
