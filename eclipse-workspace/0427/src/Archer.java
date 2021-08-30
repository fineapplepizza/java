
public class Archer implements Skill{
	// 상속을 물려받을때 -> extends
		// 인터페이스를 구현할때 -> implements

	@Override
	public void attack() {
		
		System.out.println("화살쏘기~~");
		
	}

	@Override
	public void run() {
		System.out.println("활 쏘면서 달리기~~");
		
	}
	

}
