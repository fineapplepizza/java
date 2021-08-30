
public class Pockemon {
	// ������ ����X ���踸 �����ϴ� Ŭ���� -> main() ��� x
	// ���ϸ� ���赵 -> ���ϸ� ���� ����, ���
	// ���ϸ� ���� : �Ӽ�(Ÿ��) - String, �̸� - String,
	// ����, ���ݷ�, ü�� - int

	// ���ϸ� �Ӽ� ����
	// ���������� �����ֱ� -> �ٸ� ����ڿ� ���ؼ� ������ �������� �ʵ��� �ϱ� ����!
	private String type;
	private String name;
	private int shield = 10;
	private int attack = 10;
	private int hp = 10;

	// ������ �޼ҵ�
	public Pockemon(String name, String type, int shield, int attack, int hp) {
		this.name = name;
		this.type = type;
		this.shield = shield;
		this.attack = attack;
		this.hp = hp;

	}

	// ���ϸ��� �Ӽ��� ��ȸ�� �� �ִ� get�޼ҵ� ����
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
