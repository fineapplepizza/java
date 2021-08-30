package ex_03;

public class Main {

	public static void main(String[] args) {
		
		//  추상화 ? 여러 객체에서 공통적으로 사용되는 기능들을 뽑아내는 것 
		
		Porche po = new Porche();
		System.out.println(po.getTire());
		po.color = "빨간색";
		po.runner();
		po.wet();
		
		Volvo vol = new Volvo();
		vol.runner();
		vol.pilot();
		vol.color = "파란색";
		
		// 추상 클래스는 객체화를 할 수 없다!
		// 상속(업캐스팅,다운캐스팅,추상화,다형성)을 통하여 무언가 기능을 꼭! 구체화 하여 정의해야 할때 추상화를 사용한다.
//		Car c = new Car();


		
		

	}

}
