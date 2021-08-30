package day05;

public class ex01메소드 {
        //메소드 - 기능을 담당하는 것
	public static void main(String[] args) {
		
		// 메소드 호출하기
		// static - 메모리 공간 (같은 메모리 공간에 있어야 서로 참조 할 수 있다)
		int result = addNumber(2,3);
		System.out.println(result);
		
		//변수 사용하지 않고 메소드 결과값 확인하기
		System.out.println(addNumber(1,9));

	}
     
	// 메소드 정의하기
	// : 클래스의 내부 지만 다른 메소드와 겹치면 안된다.
	// : 메인메소드 아래에서 새롭게 지정!(메소드랑 겹치지만 않으면 됨)
	
	// 메소드의 구조
	// 1. 접근제한자(지정자) - public (클래스의 내부/외부 에서 접근이 가능)
	// 2. 리턴타입 : 메소드가 호출되고 난 이후 결과값에 대한 타입
	//    - int, String, Char...-> 메소드 내에 return 키워드 사용!
	//    - 타입이 없는 경우 -> void
	// 3. 메소드의 이름
	// 4. 메소드 내에 사용될 변수 지정 -> 메소드에 들어올 입력값(x값) -> 메개변수 라고 불린다.
	//매개변수 O, 리턴타입 O 메소드
	public static int addNumber(int num1, int num2) {
		int result = num1 + num2 ;
		
		return result;
	}
}
