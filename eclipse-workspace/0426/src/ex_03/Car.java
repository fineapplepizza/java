package ex_03;

// 추상 클래스 만들기
// abstract
// 1. 추상 클래스는 하나 이상의 추상 메소드를 포함하고 있어야 한다.
public abstract class Car {
	
	// 운전을 할 수 있는 기능 -> 추상메소드로 변경
	// 추상 메소드는 구체적인 내용일 가질수 없다. -> 몸체(로직,기능)를 가질수 없다.
	// 추상 메소드는 이러한 기능이 있습니다라고만 알려줌
	public abstract void runner() ;
	
	int tire = 4;
	String color;
	
	// 타이어 개수를 확인하기 위한 메소드
	public int getTire() {
		return tire;
	}

}
