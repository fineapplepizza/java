package ex_03;

public class Porche extends Car{
	
	// Car를 물려받는 Porche 생성
	// 추상 클래스를 물려받는 경우에는 부모로 부터 지정되어 있는 메소드를
	// 꼭 오버라이딩 해야한다.
	
	// 일반 클래스에서 부모클래스를 물려받으면
	// 부모의 기능을 사용하거나 사용하지 않거나 결정을 할수 있다.
	
	// 물려받는 추상메소드에 대하여
	// 구체적인 기능을 구현해 줘야한다.

	@Override
	public void runner() {
		
		System.out.println("부드러운 코너링~~~");
		
	}
	
	// 포르쉐만이 갖는 기능
	public void wet() {
		System.out.println("도로가 젖어있습니다! 시스템을 최적화 하겠습니다!");
	}

}
