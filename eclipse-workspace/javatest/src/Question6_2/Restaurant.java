package Question6_2;


public class Restaurant extends Store {
	
    double service;//���� ������ ������ �ʵ�
	double flavor;//�� ������ ������ �ʵ�
	double clean;//û�� ������ ������ �ʵ�

	//��ü ������ ���Ե��� ������ �Է¹޴� ������
	public Restaurant(String name, String event, double service, double flavor, double clean, double price) {
		this.name = name;
		this.event = event;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
		this.price = price;
	}

	@Override
	public double grade() {//����,��,û��,���� ������ ����� ����� �޼ҵ�
		double result = (service+flavor+clean+price)/4;
		
		String result2 = String.format("%.2f", result);
		System.out.println(result2);
		return 0;
		
	}

	public double getService() {
		return service;
	}

	public double getFlavor() {
		return flavor;
	}

	public double getClean() {
		return clean;
	}
	
	
	

}
