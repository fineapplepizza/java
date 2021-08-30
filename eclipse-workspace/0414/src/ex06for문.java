
public class ex06for문 {

	public static void main(String[] args) {
		
		//for문 구조
		//배열은 인덱스에서 꺼내와야하는데 인덱스번호가 0부터 시작하니까 for문 초기화 구문은 0으로 한다.
//		for(시작할 수; 검사조건; 반복을 위한 업무) {
//			실행문장;
//		}
		int  i =0;
		// 1~3까지의 수를 출력하기!

		for( i = 1; i <= 3; i++) {
			System.out.println("for문 안의 값: " + i);

		}
		
		// 반복문 이후 i 값 확인하기
		System.out.println("최종 값" + i);

	}

}
