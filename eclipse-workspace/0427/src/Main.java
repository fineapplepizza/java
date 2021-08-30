
public class Main {

	public static void main(String[] args) {
		
		Archer a = new Archer();
		a.attack();
		a.run();
		
		
		// 추상화와 인터페이스의 공통점!
		// 1. 선언만 있고 구현은 없는 기능
		// 2. new 라는 키워드로 객체 생성 X
		// 3. 상속을 받거나 구현이된 자식들에 한해서는 객체가 생성이 가능하다.
		
		// 차이점!
		/* 1. 목적의 차이
		     - 추상클래스: 동일한 부모를 가지는 클래스를 묶어 상속을 받아 기능을 더 확장 
		     - 인터페이스 : 구현 객체가 같은 동작을 한다는 것을 보장하기 위한 목적(강제성) */
		// 2. 추상클래스의 경우 단일상속(extends) 가능, 
		//    인터페이스 경우 다중으로 구현(상속/implements)이 가능하다.
		
		Warrior w = new Warrior();
		System.out.println("전사 캐릭터 서버:" + w.server);
		w.attack();
		w.run();
		w.skin();

	}

}
