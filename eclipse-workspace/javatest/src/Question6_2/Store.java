package Question6_2;

public abstract class Store {
	 String name; //���Ի�ȣ �̸��� ������ �ʵ�
	 String event; //���������� ������ �ʵ�
	 double price; //���� ���� �� ���������� ������ �ʵ�
	
	//�� ���Ե��� ������ ����� ����� �޼ҵ�(�߻�޼ҵ�)
	public abstract double grade();

	public String getName() {
		return name;
	}

	public String getEvent() {
		return event;
	}

	public double getPrice() {
		return price;
	}
	
	
}

