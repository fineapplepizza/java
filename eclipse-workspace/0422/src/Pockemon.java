
public class Pockemon {
	// 스스로 동작X 설계만 진행하는 클래스 -> main() 사용 x
	// 포켓몬 설계도 -> 포켓몬 정보 저장, 기능
	// 포켓몬 정보 : 속성(타입) - String, 이름 - String,
	// 방어력, 공격력, 체력 - int

	// 포켓몬 속성 정의
	// 접근지정자 제한주기 -> 다른 사용자에 의해서 정보가 수정되지 않도록 하기 위함!
	private String type;
	private String name;
	private int shield = 10;
	private int attack = 10;
	private int hp = 10;

	// 생성자 메소드
	public Pockemon(String name, String type, int shield, int attack, int hp) {
		this.name = name;
		this.type = type;
		this.shield = shield;
		this.attack = attack;
		this.hp = hp;

	}

	// 포켓몬의 속성을 조회할 수 있는 get메소드 생성
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getshield() {
		return shield;
	}

	public int getattack() {
		return attack;
	}

	public int gethp() {
		return hp;
	}

}
