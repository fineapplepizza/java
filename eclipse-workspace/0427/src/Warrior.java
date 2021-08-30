
public class Warrior implements Skill, Skin{
	
	//Skill에 대한 구현 메소드
	public void attack() {
		System.out.println("검 휘두르기...!");
	}
	
	//Skill에 대한 구현 메소드
	public void run() {
		System.out.println("말을 타고 달려가기!");
	}
	
	//Skin에 대한 구현 메소드
	public void skin() {
		System.out.println("300 스파르타 전사느낌!");
	}

}
