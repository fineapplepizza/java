
public class CharacMain {

	public static void main(String[] args) {
		Charac ch = new Charac();
		
		ch.down();
		ch.run();
		ch.jump();
		
		// 货肺款 某腐磐 按眉 积己!
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
