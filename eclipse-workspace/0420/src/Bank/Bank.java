package Bank;

public class Bank {
	//1. �ʵ�(�Ӽ�)
	private int money;//ĸ��ȭ(��������)
	
	//2. �޼ҵ�(���)
	//�޼ҵ�� : deposit/�Ű����� : ������ 1��/ ����Ÿ��X
	//Ŭ�������� �Ű����� ���鶧�� �ʵ��� �����ϰ� ����°� ��κ� ���
	public void deposit(int money) {
		this.money += money;
		//this >> ���� Ŭ���� ��ü�� ��Ī�ϴ� Ű����
	}
	//�޼ҵ�� : withdraw / �Ű����� : ������ 1�� / ����Ÿ��X
	public void withdraw(int money) {
	    this.money -= money;
		
	}
	//�޼ҵ�� : showmoney/�Ű�����:X /����Ÿ�� ������
	public int showmoney() {
		
		return money;
	}

}
