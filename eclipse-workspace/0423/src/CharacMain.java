
public class CharacMain {

	public static void main(String[] args) {
		Charac ch = new Charac();
		
		ch.down();
		ch.run();
		ch.jump();
		
		// ���ο� ĳ���� ��ü ����!
		System.out.println();
		CharacWizard cw = new CharacWizard();
		cw.down();
		cw.run();
		cw.jump();
		cw.fire();
		cw.water();
		
		System.out.println();
		CharacArcher ca = new CharacArcher();
		ca.down();
		ca.run();
		ca.jump();
		ca.poisonarrow();
		
		System.out.println();
		CharacManArms cma = new CharacManArms();
		cma.down();
		cma.run();
		cma.jump();
		cma.samdoryu();

	}

}
