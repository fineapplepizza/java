
public class CharacWizard extends Charac {
	//기존의 Charac 클래스를 물려받아 더 확자오딘 기능으로 Wizard 클래스 생성
	
	// 부모로 부터 물려받는 jump()를 새롭게
	// 마법사 캐릭터 만의 기능으로 재구현! -> 재정의-> 오버라이딩
	public void jump() {
		System.out.println("포털로 이동!");
		
	}
	// 마법사 캐릭터만이 가질수 있는 기능 생성
	public void fire() {
		System.out.println("불");
	}
	
	public void water() {
		System.out.println("물");
	}

}
