
public class ex01오버로딩 {

	public static void main(String[] args) {
		// 오버로딩
		// 하나의 기능으로 여러개의 데이터 처리를 해줄 수 있게 도와주는 기능
		// 똑같은 메소드를 가지고 매개변수만 바뀌면서 값을 출력해주는 기능
		
		print(1);
		print("문자");
		print(1,3);
		
		System.out.println();

	}

	private static void print(int i, int j) {
		System.out.println("더하기 출력 " +(i+j));
		
	}

	private static void print(String string) {
		System.out.println("문자열 출력 " + string);
		
	}

	private static void print(int i) {
		System.out.println("숫자 하나 출력 " + i);
		
	}

}
